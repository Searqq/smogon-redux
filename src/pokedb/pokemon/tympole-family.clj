
(defpokemon :tympole
  :name "Tympole"
  :introduced-in :bw
  :types [[:water]]
  :egggroups [[:water-1]]
  :abilities [[:hydration :swift-swim :water-absorb]]
  :stats [[50 50 40 50 40 64]]
  :weight [4.5]
  :height [0.5])

(defpokemon :palpitoad
  :name "Palpitoad"
  :introduced-in :bw
  :types [[:ground :water]]
  :egggroups [[:water-1]]
  :abilities [[:hydration :swift-swim :water-absorb]]
  :stats [[75 65 55 65 55 69]]
  :weight [17]
  :height [0.8])

(defpokemon :seismitoad
  :name "Seismitoad"
  :introduced-in :bw
  :types [[:ground :water]]
  :egggroups [[:water-1]]
  :abilities [[:poison-touch :swift-swim :water-absorb]]
  :stats [[105 85 75 85 75 74]]
  :weight [62]
  :height [1.5])

(deffamily :tympole :palpitoad :seismitoad)
