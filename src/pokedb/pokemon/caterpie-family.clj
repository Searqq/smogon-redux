
(defpokemon :caterpie
  :name "Caterpie"
  :introduced-in :rb
  :types [[:bug]]
  :egggroups [[:bug]]
  :abilities [[:shield-dust]
              :bw [:run-away :shield-dust]]
  :stats [[45 30 35 20 45]
          :gs [45 30 35 20 20 45]]
  :weight [2.9]
  :height [0.3])

(defpokemon :metapod
  :name "Metapod"
  :introduced-in :rb
  :types [[:bug]]
  :egggroups [[:bug]]
  :abilities [[:shed-skin]]
  :stats [[50 20 55 25 30]
          :gs [50 20 55 25 25 30]]
  :weight [9.9]
  :height [0.7])

(defpokemon :butterfree
  :name "Butterfree"
  :introduced-in :rb
  :types [[:bug :flying]]
  :egggroups [[:bug]]
  :abilities [[:compoundeyes]
              :bw [:compoundeyes :tinted-lens]]
  :stats [[60 45 50 80 70]
          :gs [60 45 50 80 80 70]]
  :weight [32]
  :height [1.1])

(deffamily :caterpie :metapod :butterfree)
