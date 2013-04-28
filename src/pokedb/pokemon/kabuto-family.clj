
(defpokemon :kabuto
  :name "Kabuto"
  :introduced-in :rb
  :types [[:rock :water]]
  :egggroups [[:water-1 :water-3]]
  :abilities [[:battle-armor :swift-swim]
              :bw [:battle-armor :swift-swim :weak-armor]]
  :stats [[30 80 90 45 55]
          :gs [30 80 90 55 45 55]]
  :weight [11.5]
  :height [0.5])

(defpokemon :kabutops
  :name "Kabutops"
  :introduced-in :rb
  :types [[:rock :water]]
  :egggroups [[:water-1 :water-3]]
  :abilities [[:battle-armor :swift-swim]
              :bw [:battle-armor :swift-swim :weak-armor]]
  :stats [[60 115 105 70 80]
          :gs [60 115 105 65 70 80]]
  :weight [40.5]
  :height [1.3])

(deffamily :kabuto :kabutops)
