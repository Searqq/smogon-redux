
(defpokemon :chinchou
  :name "Chinchou"
  :introduced-in :gs
  :types [[:electric :water]]
  :egggroups [[:water-2]]
  :abilities [[:illuminate :volt-absorb]
              :bw [:illuminate :volt-absorb :water-absorb]]
  :stats [[75 38 38 56 56 67]]
  :weight [12]
  :height [0.5])

(defpokemon :lanturn
  :name "Lanturn"
  :introduced-in :gs
  :types [[:electric :water]]
  :egggroups [[:water-2]]
  :abilities [[:illuminate :volt-absorb]
              :bw [:illuminate :volt-absorb :water-absorb]]
  :stats [[125 58 58 76 76 67]]
  :weight [22.5]
  :height [1.2])

(deffamily :chinchou :lanturn)
