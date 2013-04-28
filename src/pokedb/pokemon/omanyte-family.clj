
(defpokemon :omanyte
  :name "Omanyte"
  :introduced-in :rb
  :types [[:rock :water]]
  :egggroups [[:water-1 :water-3]]
  :abilities [[:shell-armor :swift-swim]
              :bw [:shell-armor :swift-swim :weak-armor]]
  :stats [[35 40 100 90 35]
          :gs [35 40 100 90 55 35]]
  :weight [7.5]
  :height [0.4])

(defpokemon :omastar
  :name "Omastar"
  :introduced-in :rb
  :types [[:rock :water]]
  :egggroups [[:water-1 :water-3]]
  :abilities [[:shell-armor :swift-swim]
              :bw [:shell-armor :swift-swim :weak-armor]]
  :stats [[70 60 125 115 55]
          :gs [70 60 125 115 70 55]]
  :weight [35]
  :height [1])

(deffamily :omanyte :omastar)
