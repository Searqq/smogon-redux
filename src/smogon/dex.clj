
(ns smogon.dex
  (:require [clojure.core.logic :as l]
            [clojure.tools.macro :as m]
            [smogon.core-logic-hacks :as lhacks]
            [clojure.java.io :as io]))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Utilities
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn load-dex-files
  "Load every .clj script under src/pokedb. The intention is to initialize the
  pokedex relations."
  []
  (doseq [f (file-seq (io/file (io/resource "pokedb/.")))]
    (when (.isFile f)
      (load-file (.getPath  f)))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; All dex objects :)
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(lhacks/defrel name-f o x)

(lhacks/defsingleton name-of [id] 
  [q] (name-f id q))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Generations
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;

(def ^:dynamic *gen*
  "Current generation (for convenience). Defaults to latest generation."
  :bw)

(def official-generations
  [:rb :gs :rs :dp :bw])

(defn generations-since
  [gen]
  (drop-while #(not= gen %) official-generations))

(defn generations-upto
  [gen]
  (take-while #(not= gen %) official-generations))

(defn ^:private fill-generations
  "(fill-generations [:gs :rs :dp :bw] {:gs [:ice :grass], :dp [:fire]}) 
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
      (fill-generations next-gens gen-map'))))

(defn make-generational
  "(make-generational :gs [[:ice :grass] :dp [:fire]] 
     --> 
   {:gs [:ice :grass], :rs [:ice grass], :dp [:fire], :bw [:fire]}"
  [begin-gen [v & {:as overrides}]]
  (let [gen-map (merge overrides {begin-gen v})
        gens (generations-since begin-gen)] 
    (fill-generations gens gen-map)))

(defmacro defgenrel [name & args]
  (let [[name [& args]] (m/name-with-attributes name args)] 
    `(let [rel# (lhacks/rel ^:index g# ~@args)] 
       (when (defonce ~name (fn [~@args]
                              (rel# *gen* ~@args)))
         (alter-meta! #'~name #(assoc % ::genrel rel#))
         #'~name))))

(defmacro genfact
  [gen rel & tuple]
  `(l/fact (-> #'~rel meta ::genrel) ~gen ~@tuple))

(defmacro in-gen [gen & body]
  `(binding [*gen* ~gen]
    ~@body))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defgenrel type-f t)
(defgenrel type-effective-against-f t1 t2 modifier)

(lhacks/defpredicate type? [tid] (type-f tid))
(lhacks/defsingleton type-effectiveness [tid1 tid2]
  [q] (type-effective-against-f tid1 tid2 q))
(lhacks/defquery type-effectiveness-row [tid]
  [q r] (type-effective-against-f tid q r))

(defn deftypechart
  [id & {name :name
         gen :introduced-in
         geffectives :effective-against}]
  (doseq [g (generations-since gen)]
    (genfact g type-f id))
  (doseq [[g mods] (make-generational gen geffectives)
          [type mod] mods]
    (genfact g type-effective-against-f id type mod))
  (l/fact name-f id name))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Moves
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defgenrel move-f m)

(lhacks/defpredicate move? [id] (move-f id))

(lhacks/defquery list-moves [] 
  [q] (move-f q))
  
(defn defmove
  [id & {name :name,
         gen :introduced-in}]
  (doseq [g (generations-since gen)]
    (genfact g move-f id))
  (l/fact name-f id name))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Abilities
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(defgenrel ability-f a)

(lhacks/defpredicate ability? [id] (ability-f id))

(lhacks/defquery list-abilities [] 
  [q] (ability-f q))

(defn defability
  [id & {name :name,
         gen :introduced-in}]
  (doseq [g (generations-since gen)]
    (genfact g ability-f id))
  (l/fact name-f id name))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Items
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defgenrel item-f i)

(lhacks/defpredicate item? [id] (item-f id))

(defn defitem
  [id & {name :name,
         gen :introduced-in}]
  (doseq [g (generations-since gen)]
    (genfact g item-f id))
  (l/fact name-f id name))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Pokemon
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def generations-without-abilities [:rb :gs])

(defgenrel pokemon-f x)
(defgenrel pokemon-type-f p x)
(defgenrel pokemon-ability-f p x)
(defgenrel pokemon-egggroup-f p x)
(defgenrel pokemon-hp-f p x)
(defgenrel pokemon-atk-f p x)
(defgenrel pokemon-def-f p x)
(defgenrel pokemon-spatk-f p x)
(defgenrel pokemon-spdef-f p x)
(defgenrel pokemon-special-f p x)
(defgenrel pokemon-speed-f p x)
(defgenrel pokemon-weight-f p x)
(defgenrel pokemon-height-f p x)

;; Queries

(lhacks/defpredicate pokemon? [id] (pokemon-f id))

(lhacks/defquery list-pokemon [] 
  [q] (pokemon-f q))

(lhacks/defquery type-of [id] 
  [q] (pokemon-type-f id q))

(lhacks/defquery ability-of [id] 
  [q] (pokemon-ability-f id q))

(lhacks/defquery ability-monset-of [aid]
  [q] (pokemon-ability-f q aid))

(lhacks/defsingleton weight-of [id]
  [q] (pokemon-weight-f id q))

(lhacks/defsingleton height-of [id]
  [q] (pokemon-height-f id q))

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

  (doseq [g (generations-since gen)]
    (genfact g pokemon-f id))
  
  (l/fact name-f id name)
  
  (letfn [(mg [x] (make-generational gen x))]
    (doseq [[g types] (mg gtypes)
            type types]
      (genfact g pokemon-type-f id type))
    
    (doseq [[g abilities] (mg gabilities)
            ability abilities]
      (genfact g pokemon-ability-f id ability))
    
    (doseq [[g stats] (mg gstats)]
      ;; Ugly hack; for :rb spatk/spdef are combined.
      (if (= g :rb)
        (let [[hp atk def special speed] stats]
          (genfact g pokemon-hp-f id hp)
          (genfact g pokemon-atk-f id atk)
          (genfact g pokemon-def-f id def)
          (genfact g pokemon-special-f id special)
          (genfact g pokemon-speed-f id speed))
        (let [[hp atk def spatk spdef speed] stats]
          (genfact g pokemon-hp-f id hp)
          (genfact g pokemon-atk-f id atk)
          (genfact g pokemon-def-f id def)
          (genfact g pokemon-spatk-f id spatk)
          (genfact g pokemon-spdef-f id spdef)
          (genfact g pokemon-speed-f id speed))))
    
    (doseq [[g egggroups] (mg gegggroups)
            egggroup egggroups]
      (genfact g pokemon-egggroup-f id egggroup))
    
    (doseq [[g weight] (mg gweight)]
      (genfact g pokemon-weight-f id weight))
    
    (doseq [[g height] (mg gheight)]
      (genfact g pokemon-height-f id height))))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Evolutions
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defgenrel evolves-f p p')

(defn evolves-r [p p']
  (l/conde
   ((evolves-f p p'))
   ((l/fresh [p'']
           (evolves-f p p'')
           (evolves-r p'' p')))))

(lhacks/defquery preevos-of [id]
  [q] (evolves-r id q))

(lhacks/defquery postevos-of [id]
  [q] (evolves-r q id))
 
(lhacks/defquery family-of [id]
  [q] (l/conde
       ((evolves-r q id))
       ((evolves-r id q))))

(defn ^:private group-transitive
  "(group-transitive [1 2 3]) -> [[1 2] [2 3]]"
  [xs] (map vector xs (rest xs)))

(defn ^:private make-vector-if-not
  "Take a wild guess."
  [x] (if (vector? x) x [x]))

(defn ^:private fixup-family-tree
  [tree]
  (for [g official-generations]
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
    (genfact g evolves-f p pevo)))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Learnsets
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; You don't need to include moves preevos learns; these are handled by learns-r
(defgenrel learns-f p m)

(defn learns-r
  [p m]
  (l/conde ((learns-f p m))
           ((l/fresh [p']
                     (evolves-r p' p) 
                     (learns-f p' m)))))

(lhacks/defpredicate learns? [pid mid]
  (learns-r pid mid))

(lhacks/defquery move-monset-of [mid]
  [q] (learns-r q mid))

(lhacks/defquery learnset-of [pid]
  [q] (learns-r pid q))

(defn deflearnset
  [gen & pairs]
  (doseq [[p ms] (partition 2 pairs)
          m ms]
    (genfact gen learns-f p m)))
