
(deffamily :bulbasaur :ivysaur :venusaur)

(defpokemon :bulbasaur
  :name "Bulbasaur"
  :introduced-in :rb
  :types [[:grass :poison]]
  :egggroups [[:monster :plant]]
  :abilities [[:overgrow]
              :bw [:chlorophyll :overgrow]]
  :stats [[45 49 49 65 45]
          :gs [45 49 49 65 65 45]]
  :weight [6.9]
  :height [0.7])

(defpokemon :venusaur
  :name "Venusaur"
  :introduced-in :rb
  :types [[:grass :poison]]
  :egggroups [[:monster :plant]]
  :abilities [[:overgrow]
              :bw [:chlorophyll :overgrow]]
  :stats [[80 82 83 100 80]
          :gs [80 82 83 100 100 80]]
  :weight [100]
  :height [2])

(defpokemon :ivysaur
  :name "Ivysaur"
  :introduced-in :rb
  :types [[:grass :poison]]
  :egggroups [[:monster :plant]]
  :abilities [[:overgrow]
              :bw [:chlorophyll :overgrow]]
  :stats [[60 62 63 80 60]
          :gs [60 62 63 80 80 60]]
  :weight [13]
  :height [1])

(use 'smogon.dex)
