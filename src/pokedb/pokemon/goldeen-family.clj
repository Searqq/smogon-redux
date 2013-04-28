
(defpokemon :goldeen
  :name "Goldeen"
  :introduced-in :rb
  :types [[:water]]
  :egggroups [[:water-2]]
  :abilities [[:swift-swim :water-veil]
              :bw [:lightningrod :swift-swim :water-veil]]
  :stats [[45 67 60 50 63]
          :gs [45 67 60 35 50 63]]
  :weight [15]
  :height [0.6])

(defpokemon :seaking
  :name "Seaking"
  :introduced-in :rb
  :types [[:water]]
  :egggroups [[:water-2]]
  :abilities [[:swift-swim :water-veil]
              :bw [:lightningrod :swift-swim :water-veil]]
  :stats [[80 92 65 80 68]
          :gs [80 92 65 65 80 68]]
  :weight [39]
  :height [1.3])

(deffamily :goldeen :seaking)
