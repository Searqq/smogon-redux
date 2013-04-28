
(defpokemon :mantyke
  :name "Mantyke"
  :introduced-in :dp
  :types [[:flying :water]]
  :egggroups [[]]
  :abilities [[:swift-swim :water-absorb :water-veil]]
  :stats [[45 20 50 60 120 50]]
  :weight [65]
  :height [1])

(defpokemon :mantine
  :name "Mantine"
  :introduced-in :gs
  :types [[:flying :water]]
  :egggroups [[:water-1]]
  :abilities [[:swift-swim :water-absorb]
              :bw [:swift-swim :water-absorb :water-veil]]
  :stats [[65 40 70 80 140 70]]
  :weight [220]
  :height [2.1])

(deffamily :mantyke :mantine)
