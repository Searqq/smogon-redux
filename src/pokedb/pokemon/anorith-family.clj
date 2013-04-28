
(defpokemon :anorith
  :name "Anorith"
  :introduced-in :rs
  :types [[:bug :rock]]
  :egggroups [[:water-3]]
  :abilities [[:battle-armor]
              :bw [:battle-armor :swift-swim]]
  :stats [[45 95 50 40 50 75]]
  :weight [12.5]
  :height [0.7])

(defpokemon :armaldo
  :name "Armaldo"
  :introduced-in :rs
  :types [[:bug :rock]]
  :egggroups [[:water-3]]
  :abilities [[:battle-armor]
              :bw [:battle-armor :swift-swim]]
  :stats [[75 125 100 70 80 45]]
  :weight [68.2]
  :height [1.5])

(deffamily :anorith :armaldo)
