
(defpokemon :raikou
  :name "Raikou"
  :introduced-in :gs
  :types [[:electric]]
  :egggroups [[]]
  :abilities [[:pressure]
              :bw [:pressure :volt-absorb]]
  :stats [[90 85 75 115 100 115]]
  :weight [178]
  :height [1.9])

(defpokemon :entei
  :name "Entei"
  :introduced-in :gs
  :types [[:fire]]
  :egggroups [[]]
  :abilities [[:pressure]
              :bw [:flash-fire :pressure]]
  :stats [[115 115 85 90 75 100]]
  :weight [198]
  :height [2.1])

(defpokemon :suicune
  :name "Suicune"
  :introduced-in :gs
  :types [[:water]]
  :egggroups [[]]
  :abilities [[:pressure]
              :bw [:pressure :water-absorb]]
  :stats [[100 75 115 90 115 85]]
  :weight [187]
  :height [2])


(deffamily :suicune)
(deffamily :entei)
(deffamily :raikou)
