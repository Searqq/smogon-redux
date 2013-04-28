
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

(l/defrel nameo o x)


;; Generations
;;

(def ^:dynamic *gen*
  "Current generation (for convenience). Defaults to latest generation."
  :bw)

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
     (~post (l/run* ~queryvars (with-gen gen# ~@body)))))


;; Pokemon
;;

(def generations-without-abilities [:rb :gs])

(l/defrel pokemono g x)
(l/defrel pokemon-typeo g p x)
(l/defrel pokemon-abilityo g p x)
(l/defrel pokemon-egggroupo g p x)
(l/defrel pokemon-hpo g p x)
(l/defrel pokemon-atko g p x)
(l/defrel pokemon-defo g p x)
(l/defrel pokemon-spatko g p x)
(l/defrel pokemon-spdefo g p x)
(l/defrel pokemon-specialo g p x)
(l/defrel pokemon-speedo g p x)
(l/defrel pokemon-weighto g p x)
(l/defrel pokemon-heighto g p x)
(l/defrel pokemon-evo g p p')

;; Queries

(defdexquery pokemon? [id]
  [q] ((pokemono *gen* id))
  ;; Warning: this is not the same as not-empty because Clojure is stupid as
  ;; fuck and thinks returning the list is accetpable answer (hint: its not,
  ;; return true or false please)
  :post #(not (empty? %)))

(defdexquery pokemon-q [] 
  [q] ((pokemono *gen* q)))

(defdexquery name-q [id] 
  [q] ((nameo id q))
  :post #(first %))

(defdexquery pokemon-type-q [id] 
  [q] ((pokemon-typeo *gen* id q))
  :post #(vec (sort %)))

(defdexquery pokemon-ability-q [id] 
  [q] ((pokemon-abilityo *gen* id q))
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
    (l/fact pokemon-evo g p pevo)))

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
    (l/fact pokemono g id))
  
  (l/fact nameo id name)
  
  (letfn [(mg [x] (make-generational gen x))]
    (doseq [[g types] (mg gtypes)
            type types]
      (l/fact pokemon-typeo g id type))
    
    (doseq [[g abilities] (mg gabilities)
            ability abilities]
      (l/fact pokemon-abilityo g id ability))
    
    (doseq [[g stats] (mg gstats)]
      ;; Ugly hack; for :rb spatk/spdef are combined.
      (if (= g :rb)
        (let [[hp atk def special speed] stats]
          (l/fact pokemon-hpo g id hp)
          (l/fact pokemon-atko g id atk)
          (l/fact pokemon-defo g id def)
          (l/fact pokemon-specialo g id special)
          (l/fact pokemon-speedo g id speed))
        (let [[hp atk def spatk spdef speed] stats]
          (l/fact pokemon-hpo g id hp)
          (l/fact pokemon-atko g id atk)
          (l/fact pokemon-defo g id def)
          (l/fact pokemon-spatko g id spatk)
          (l/fact pokemon-spdefo g id spdef)
          (l/fact pokemon-speedo g id speed))))
    
    (doseq [[g egggroups] (mg gegggroups)
            egggroup egggroups]
      (l/fact pokemon-egggroupo g id egggroup))
    
    (doseq [[g weight] (mg gweight)]
      (l/fact pokemon-weighto g id weight))
    
    (doseq [[g height] (mg gheight)]
      (l/fact pokemon-heighto g id height))))


;; Moves
;;

(l/defrel moveo g m)

(defn defmove
  [id & {name :name,
         gen :introduced-in}]
  (doseq [g (generations-since gen)]
    (l/fact moveo g id))
  (l/fact nameo id name))
 

;; Learnsets
;;

(l/defrel learnso g p m meth)

(defn deflearnset
  [pid gen & tuples]
  (doseq [[mid method] tuples]
    (l/fact learnso gen pid mid method)))


;; Abilities

(l/defrel abilityo g a)

(defn defability
  [id & {name :name,
         gen :introduced-in}]
  (doseq [g (generations-since gen)]
    (l/fact abilityo g id))
  (l/fact nameo id name))


;; Items

(l/defrel itemo g i)

(defn defitem
  [id & {name :name,
         gen :introduced-in}]
  (doseq [g (generations-since gen)]
    (l/fact itemo g id))
  (l/fact nameo id name))
 
