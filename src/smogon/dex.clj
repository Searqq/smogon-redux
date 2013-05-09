
(ns smogon.dex
  (:require [clojure.core.logic :as l]
            [clojure.tools.macro :as m]
            [smogon.core-logic-hacks :as lhacks]
            [clojure.java.io :as io]
            [clojure.set :as set]))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Utilities
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn ^:private vec-sort [x]
  (vec (sort x)))

(defn ^:private vec-union [x y]
  (vec (sort (concat x y)))) 

(defn ^:private group-vals-vec [coll]
  (reduce (fn [m [k v]] (merge-with vec-union m {k #{v}})) {} coll))

(defn ^:private group-vals [coll]
  (reduce (fn [m [k v]] (merge-with set/union m {k #{v}})) {} coll))

(defn ^:private group-keys [coll]
  (reduce (fn [m [k v]]  (merge-with set/union m {v #{k}})) {} coll))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; All dex objects :)
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(lhacks/defrel name-r ^:index o x)

(defn name-of [x]
  (lhacks/run-1 [q] (name-r x q)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Generations
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def ^:dynamic *gen*
  "Current generation (for convenience). Defaults to latest generation."
  :bw)

(def official-gens
  '(:rb :gs :rs :dp :bw))

(defn gens->ordering
  [gens]
  (into {} (map-indexed #(vector %2 %1) gens)))

(defn gens-since
  [gen]
  (drop-while #(not= gen %) official-gens))

(defn gens-upto
  [gen]
  (take-while #(not= gen %) official-gens))

(defmacro in-gen
  "Evaluate body in the context of a different generation."
  [gen & body]
  `(binding [*gen* ~gen]
    ~@body))

(defn sort-grouped-gens
  [gen-ordering valgens]
  (sort-by (fn [[val gs]]
             (reduce min (map (gens->ordering gen-ordering) gs)))
           valgens))

(defn ^:private fill-gens
  "(fill-gens [:gs :rs :dp :bw] {:gs [:ice :grass], :dp [:fire]}) 
     --> 
   {:gs [:ice :grass], :rs [:ice grass], :dp [:fire], :bw [:fire]}"
  [[prev-gen & [gen :as next-gens]] gen-map]
  (cond
    (nil? gen) gen-map

    :else
    (let [;; Get the value from the previous generation,
          prev (get gen-map prev-gen)
          ;; ... and carry it over to the current generation (if the current
          ;; generation has no set value--merge works left to right)
          gen-map' (merge {gen prev} gen-map)]
      (fill-gens next-gens gen-map'))))

(defn make-generational
  "(make-generational :gs [[:ice :grass] :dp [:fire]] 
     --> 
   {:gs [:ice :grass], :rs [:ice grass], :dp [:fire], :bw [:fire]}"
  [begin-gen [v & {:as overrides}]]
  (let [gen-map (merge overrides {begin-gen v})
        gens (gens-since begin-gen)] 
    (fill-gens gens gen-map)))

;; Relations
;;

(defmacro defgenrel [name & args]
  (let [[name [& args]] (m/name-with-attributes name args)]
    ;; defonce clears metadata, so use this hack instead.
    ;; can't just use (bound? #'~name) due to some macroexpand quirk.
    ;; ... whatever.
    `(when-not (bound? (resolve '~name))
       (let [rel# (lhacks/rel ^:index g# ~@args)] 
         (defn ~name [~@args]
           (rel# *gen* ~@args))
         (alter-meta! #'~name #(assoc % ::genrel rel#))
         #'~name))))

;; Genrels hide their gen argument. This gives you a relation
;; that doesn't hide it.
(defmacro genrel->rel
  [name & args]
  (if args
    `((-> #'~name meta ::genrel) ~@args) 
    `(-> #'~name meta ::genrel)))

(defmacro genfact
  [gen rel & tuple]
  `(l/fact (genrel->rel ~rel) ~gen ~@tuple))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defgenrel type-r t)
(defgenrel type-effective-against-r t1 t2 modifier)

(defn type? [t]
  (lhacks/run-bool (type-r t)))

(defn type-effectiveness [t1 t2]
  (lhacks/run-1 [q] (type-effective-against-r t1 t2 q)))

(defn type-effectiveness-row [t]
  (lhacks/run-strict [q r] (type-effective-against-r t q r)))

(defn deftypechart
  [id & {name :name
         gen :introduced-in
         geffectives :effective-against}]
  (doseq [g (gens-since gen)]
    (genfact g type-r id))
  (doseq [[g mods] (make-generational gen geffectives)
          [type mod] mods]
    (genfact g type-effective-against-r id type mod))
  (l/fact name-r id name))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Moves
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defgenrel move-r m)

(defn move? [m]
  (lhacks/run-bool (move-r m)))

(defn list-moves [] 
  (lhacks/run-strict [q] (move-r q)))

(defn list-moves* [] 
  (group-keys (lhacks/run-strict [g q] (genrel->rel move-r g q))))

(defn defmove
  [id & {name :name,
         gen :introduced-in}]
  (doseq [g (gens-since gen)]
    (genfact g move-r id))
  (l/fact name-r id name))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Abilities
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defgenrel ability-r a)

(defn ability? [a]
  (lhacks/run-bool (ability-r a)))

(defn list-abilities [] 
  (lhacks/run-strict [q] (ability-r q)))

(defn list-abilities* [] 
  (group-keys (lhacks/run-strict [g q] (genrel->rel ability-r g q))))

(defn defability
  [id & {name :name,
         gen :introduced-in}]
  (doseq [g (gens-since gen)]
    (genfact g ability-r id))
  (l/fact name-r id name))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Items
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defgenrel item-r i)

(defn item? [i]
  (lhacks/run-bool (item-r i)))

(defn defitem
  [id & {name :name,
         gen :introduced-in}]
  (doseq [g (gens-since gen)]
    (genfact g item-r id))
  (l/fact name-r id name))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Pokemon
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def official-gens-without-abilities #{:rb :gs})

(defgenrel pokemon-r x)
(defgenrel pokemon-type-r ^:index p ^:index x)
(defgenrel pokemon-ability-r ^:index p ^:index x)
(defgenrel pokemon-egggroup-r ^:index p ^:index x)
(defgenrel pokemon-hp-r ^:index p x)
(defgenrel pokemon-atk-r ^:index p x)
(defgenrel pokemon-def-r ^:index p x)
(defgenrel pokemon-spatk-r ^:index p x)
(defgenrel pokemon-spdef-r ^:index p x)
(defgenrel pokemon-speed-r ^:index p x)
(defgenrel pokemon-weight-r ^:index p x)
(defgenrel pokemon-height-r ^:index p x)

(defn pokemon? [p]
  (lhacks/run-bool (pokemon-r p)))

(defn list-pokemon []
  (lhacks/run-strict [q] (pokemon-r q)))

(defn list-pokemon* []
  (group-keys (l/run* [g q] (genrel->rel pokemon-r g q))))

(defn type-of [p]
  (vec-sort (l/run* [t] (pokemon-type-r p t))))

(defn type-of* [p]
  (group-keys (group-vals-vec (l/run* [g q] (genrel->rel pokemon-type-r g p q)))))

(defn has-type? [p t]
  (cond 
   (keyword? t) (lhacks/run-bool (pokemon-type-r p t))
   (coll? t) (lhacks/run-bool (l/everyg #(pokemon-type-r p %) t))))

(defn who-has-type [t]
  (lhacks/run-strict [q]
                     (cond
                      (keyword? t) (pokemon-type-r q t)
                      (coll? t) (l/everyg #(pokemon-type-r q %) t))))

(defn who-has-type* [t]
  (group-keys
   (lhacks/run-strict [g q]
                      (cond
                       (keyword? t) (genrel->rel pokemon-type-r g q t)
                       (coll? t) (l/everyg #(genrel->rel pokemon-type-r g q %) t)))))

(defn abilities-of [p]
  (set (l/run* [q] (pokemon-ability-r p q))))

(defn abilities-of* [p]
  (group-keys (l/run* [g q] (genrel->rel pokemon-ability-r g p q))))

(defn has-ability? [p a]
  (lhacks/run-bool (pokemon-ability-r p a)))

(defn who-has-ability [a]
  (lhacks/run-strict [q] (pokemon-ability-r q a)))

(defn who-has-ability* [a]
  (group-keys (l/run* [g q] (genrel->rel pokemon-ability-r g q a))))
 
(defn hp-of [p]
  (lhacks/run-1 [q] (pokemon-hp-r p q)))

(defn hp-of* [p]
  (group-keys (l/run* [g q] (genrel->rel pokemon-hp-r g p q))))

(defn atk-of [p]
  (lhacks/run-1 [q] (pokemon-atk-r p q)))

(defn atk-of* [p]
  (group-keys (l/run* [g q] (genrel->rel pokemon-atk-r g p q))))

(defn def-of [p]
  (lhacks/run-1 [q] (pokemon-def-r p q)))

(defn def-of* [p]
  (group-keys (l/run* [g q] (genrel->rel pokemon-def-r g p q))))

(defn spatk-of [p]
  (lhacks/run-1 [q] (pokemon-spatk-r p q)))

(defn spatk-of* [p]
  (group-keys (l/run* [g q] (genrel->rel pokemon-spatk-r g p q))))

(defn spdef-of [p]
  (lhacks/run-1 [q] (pokemon-spdef-r p q)))

(defn spdef-of* [p]
  (group-keys (l/run* [g q] (genrel->rel pokemon-spdef-r g p q))))

(defn speed-of [p]
  (lhacks/run-1 [q] (pokemon-speed-r p q)))

(defn speed-of* [p]
  (group-keys (l/run* [g q] (genrel->rel pokemon-speed-r g p q))))

(defn defpokemon
  "Helper function to define a Pokemon."
  [id & {name :name,
         gen :introduced-in,
         gstats :stats,
         gtypes :types,
         gabilities :abilities,
         gegggroups :egggroups,
         gweight :weight,
         gheight :height}]

  (doseq [g (gens-since gen)]
    (genfact g pokemon-r id))
  
  (l/fact name-r id name)
  
  (letfn [(mg [x] (make-generational gen x))]
    (doseq [[g types] (mg gtypes)
            type types]
      (genfact g pokemon-type-r id type))
    
    (doseq [[g abilities] (mg gabilities)
            ability abilities]
      (when-not (contains? official-gens-without-abilities g) 
        (genfact g pokemon-ability-r id ability)))
    
    (doseq [[g stats] (mg gstats)]
      ;; Ugly hack; for :rb spatk/spdef are combined.
      (if (= g :rb)
        (let [[hp atk def special speed] stats]
          (genfact g pokemon-hp-r id hp)
          (genfact g pokemon-atk-r id atk)
          (genfact g pokemon-def-r id def)
          (genfact g pokemon-spatk-r id special)
          (genfact g pokemon-spdef-r id special)
          (genfact g pokemon-speed-r id speed))
        (let [[hp atk def spatk spdef speed] stats]
          (genfact g pokemon-hp-r id hp)
          (genfact g pokemon-atk-r id atk)
          (genfact g pokemon-def-r id def)
          (genfact g pokemon-spatk-r id spatk)
          (genfact g pokemon-spdef-r id spdef)
          (genfact g pokemon-speed-r id speed))))
    
    (doseq [[g egggroups] (mg gegggroups)
            egggroup egggroups]
      (genfact g pokemon-egggroup-r id egggroup))
    
    (doseq [[g weight] (mg gweight)]
      (genfact g pokemon-weight-r id weight))
    
    (doseq [[g height] (mg gheight)]
      (genfact g pokemon-height-r id height))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Evolutions
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defgenrel directly-evolves-r ^:index p ^:index p')

(defn evolves-r [g p p']
  (l/conde
   ((genrel->rel directly-evolves-r g p p'))
   ((l/fresh [p'']
           (genrel->rel directly-evolves-r g p p'')
           (evolves-r g p'' p')))))

(defn preevos-of [id]
  (lhacks/run-strict [q] (evolves-r *gen* id q)))

(defn postevos-of [id]
  (lhacks/run-strict [q] (evolves-r *gen* q id)))
 
(defn family-of [id]
  (lhacks/run-strict [q] (l/conde
                          ((evolves-r *gen* q id))
                          ((evolves-r *gen* id q)))))

(defn ^:private group-transitive
  "(group-transitive [1 2 3]) -> [[1 2] [2 3]]"
  [xs] (map vector xs (rest xs)))

(defn ^:private make-vector-if-not
  "Take a wild guess."
  [x] (if (vector? x) x [x]))

(defn ^:private fixup-family-tree
  [tree]
  (for [g official-gens]
    (let [tree' (for [x tree]
                  ;; (deffamily :sneasel :weavile) is shorthand for (deffamily [:sneasel] [:weavile])
                  (let [alternatives (make-vector-if-not x)]
                    ;; Ignore Pokemon not in this generation
                    (filter #(in-gen g (pokemon? %)) alternatives)))] 
      [g (group-transitive tree')])))

(defn deffamily
 "Define a family tree. 

  For example, (deffamily :bulbasaur :ivysaur :venusaur) creates evolution
  relations between [:bulbasaur :ivysaur], [:ivysaur :venusaur] in every
  generation. 

  To specify different evolution paths, you may enclose alternatives in a
  vector. For example, (deffamily :slowpoke [:slowbro :slowking]) creates
  evolution relations between [:slowpoke, :slowbro] and [:slowpoke :slowking] in
  every generation (sans the latter in :rb).

  Pokemon that did not exist in a particular generation are ignored."
  [& tree]
  (doseq [[g pairs] (fixup-family-tree tree)
          [palts pevoalts] pairs
          p palts
          pevo pevoalts]
    (genfact g directly-evolves-r p pevo)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Learnsets
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defgenrel learns-sans-preevos-r ^:index p ^:index m)

(defn learns-r
  [g p m]
  (l/conde ((genrel->rel learns-sans-preevos-r g p m))
           ((l/fresh [p']
                     (evolves-r g p' p) 
                     (genrel->rel learns-sans-preevos-r g p' m)))))

(defn has-move? [p m]
  (lhacks/run-bool (learns-r *gen* p m)))

(defn who-has-move [m]
  (lhacks/run-strict [q] (learns-r *gen* q m)))

(defn who-has-move* [m]
  (group-keys (l/run* [g q] (learns-r g q m))))

(defn moves-of [p]
  (lhacks/run-strict [q] (learns-r *gen* p q)))

(defn moves-of* [p]
  (group-keys (l/run* [g q] (learns-r g p q))))

(defn deflearnset
  [gen & pairs]
  (doseq [[p ms] (partition 2 pairs)
          m ms]
    (genfact gen learns-sans-preevos-r p m)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Dex server
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn ^:private load-dex-files
  "Load every .clj script under src/pokedb. The intention is to initialize the
  pokedex relations."
  []
  (doseq [f (file-seq (io/file (io/resource "pokedb/.")))]
    (when (.isFile f)
      (load-file (.getPath f)))))

(defn start-dex
  "Start up the dex; load up all the files necessary.

  Don't call this function directly; prefer smogon.core/start-all with
  :start-dex true."
  []
  (load-dex-files))
