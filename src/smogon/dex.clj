
(ns smogon.dex
  (:require [clojure.core.logic :as l]
            [clojure.java.io :as io]))


;; General
;;

(defn load-dex-files []
  (doseq [f (file-seq (io/file (io/resource "pokedb/.")))]
    (when (.isFile f)
      (load-file (.getPath  f)))))

;; For all dex objects
;;

(l/defrel name-f o x)


;; Generations
;;

(def ^:dynamic *gen*
  "Current generation (for convenience). Defaults to latest generation."
  :bw)

(defmacro defgenrel [name & params]
  `(l/defrel ~name ^:index g# ~@params))

(defmacro with-gen [gen & body]
  `(with-redefs [*gen* ~gen]
    ~@body))

(def official-generations
  [:rb :gs :rs :dp :bw])

(defn generations-since
  [gen]
  (drop-while #(not= gen %) official-generations))

(defn generations-upto
  [gen]
  (take-while #(not= gen %) official-generations))

(defn fill-generations
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


;; Utility
;;


(defmacro defdexquery [name args queryvars body & {:keys [post], :or {post identity}}]
  `(defn ~name
     [~@args & {gen# :gen, :or {gen# *gen*}}]
     (~post (l/run* ~queryvars (with-gen gen# ~body)))))

(defmacro defdexpred [name args body]
  `(defn ~name
     [~@args & {gen# :gen, :or {gen# *gen*}}]
     ;; Warning: this is not the same as not-empty because Clojure is stupid as
     ;; fuck and thinks returning the list is accetpable answer (hint: its not,
     ;; return true or false please)
     (not (empty? (l/run* [q#] (with-gen gen# ~body))))))

(defdexquery name-of [id] 
  [q] (name-f id q)
  :post #(first %))


;; Pokemon
;;

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
(defgenrel evolves-f p p')

(defn evolves-r [g p p']
  (l/conde
   ((evolves-f g p p'))
   ((l/fresh [p'']
           (evolves-f g p p'')
           (evolves-r g p'' p')))))

;; Queries

(defdexpred pokemon? [id] (pokemon-f *gen* id))

(defdexquery list-pokemon [] 
  [q] (pokemon-f *gen* q))

(defdexquery preevos-of [id]
  [q] (evolves-r *gen* q id))

(defdexquery postevos-of [id]
  [q] (evolves-r *gen* q id))

(defdexquery family-of [id]
  [q] (l/conde
       ((evolves-r *gen* q id))
       ((evolves-r *gen* id q))))

(defdexquery type-of [id] 
  [q] (pokemon-type-f *gen* id q)
  :post #(vec (sort %)))

(defdexquery ability-of [id] 
  [q] (pokemon-ability-f *gen* id q)
  :post #(vec (sort %)))

;; Helpers

(defn- group-transitive
  "(group-transitive [1 2 3]) -> [[1 2] [2 3]]"
  [xs] (map vector xs (rest xs)))

(defn- make-vector-if-not
  "Take a wild guess."
  [x] (if (vector? x) x [x]))

(defn- fixup-family-tree
  [tree]
  (for [g official-generations]
    (let [tree' (for [x tree]
                  ;; (deffamily :sneasel :weavile) is shorthand for (deffamily [:sneasel] [:weavile])
                  (let [alternatives (make-vector-if-not x)]
                    ;; Ignore Pokemon not in this generation
                    (filter #(pokemon? % :gen g) alternatives)))] 
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
    (l/fact evolves-f g p pevo)))

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
    (l/fact pokemon-f g id))
  
  (l/fact name-f id name)
  
  (letfn [(mg [x] (make-generational gen x))]
    (doseq [[g types] (mg gtypes)
            type types]
      (l/fact pokemon-type-f g id type))
    
    (doseq [[g abilities] (mg gabilities)
            ability abilities]
      (l/fact pokemon-ability-f g id ability))
    
    (doseq [[g stats] (mg gstats)]
      ;; Ugly hack; for :rb spatk/spdef are combined.
      (if (= g :rb)
        (let [[hp atk def special speed] stats]
          (l/fact pokemon-hp-f g id hp)
          (l/fact pokemon-atk-f g id atk)
          (l/fact pokemon-def-f g id def)
          (l/fact pokemon-special-f g id special)
          (l/fact pokemon-speed-f g id speed))
        (let [[hp atk def spatk spdef speed] stats]
          (l/fact pokemon-hp-f g id hp)
          (l/fact pokemon-atk-f g id atk)
          (l/fact pokemon-def-f g id def)
          (l/fact pokemon-spatk-f g id spatk)
          (l/fact pokemon-spdef-f g id spdef)
          (l/fact pokemon-speed-f g id speed))))
    
    (doseq [[g egggroups] (mg gegggroups)
            egggroup egggroups]
      (l/fact pokemon-egggroup-f g id egggroup))
    
    (doseq [[g weight] (mg gweight)]
      (l/fact pokemon-weight-f g id weight))
    
    (doseq [[g height] (mg gheight)]
      (l/fact pokemon-height-f g id height))))


;; Moves
;;

(defgenrel move-f m)

(defdexpred move? [id] (move-f *gen* id))

(defdexquery list-moves [] 
  [q] (move-f *gen* q))
  
(defn defmove
  [id & {name :name,
         gen :introduced-in}]
  (doseq [g (generations-since gen)]
    (l/fact move-f g id))
  (l/fact name-f id name))
 

;; Learnsets
;;

;; You don't need to include moves preevos learns; these are handled by learns-r
(defgenrel learns-f p m)

(defn learns-r
  [g p m]
  (l/conde ((learns-f g p m))
           ((l/fresh [p']
                     (evolves-r g p' p) 
                     (learns-f g p' m)))))

(defdexpred learns? [pid mid]
  (learns-r *gen* pid mid))

(defdexquery move-monset-of [mid]
  [q] (learns-r *gen* q mid))

(defdexquery learnset-of [pid]
  [q] (learns-r *gen* pid q))

(defn deflearnset
  [gen & pairs]
  (doseq [[p ms] (partition 2 pairs)
          m ms]
    (l/fact learns-f gen p m)))


;; Abilities
;;

(defgenrel ability-f a)

(defdexpred ability? [id] (ability-f *gen* id))

(defdexquery list-abilities [] 
  [q] (ability-f *gen* q))

(defdexquery ability-monset-of [aid]
  [q] (pokemon-ability-f *gen* q aid))

(defn defability
  [id & {name :name,
         gen :introduced-in}]
  (doseq [g (generations-since gen)]
    (l/fact ability-f g id))
  (l/fact name-f id name))

;; Items
;;

(defgenrel item-f i)

(defdexpred item? [id] (item-f *gen* id))

(defn defitem
  [id & {name :name,
         gen :introduced-in}]
  (doseq [g (generations-since gen)]
    (l/fact item-f g id))
  (l/fact name-f id name))
 
