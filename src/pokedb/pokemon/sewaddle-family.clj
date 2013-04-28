
(defpokemon :sewaddle
  :name "Sewaddle"
  :introduced-in :bw
  :types [[:bug :grass]]
  :egggroups [[:bug]]
  :abilities [[:chlorophyll :overcoat :swarm]]
  :stats [[45 53 70 40 60 42]]
  :weight [2.5]
  :height [0.3])

(defpokemon :swadloon
  :name "Swadloon"
  :introduced-in :bw
  :types [[:bug :grass]]
  :egggroups [[:bug]]
  :abilities [[:chlorophyll :leaf-guard :overcoat]]
  :stats [[55 63 90 50 80 42]]
  :weight [7.3]
  :height [0.5])

(defpokemon :leavanny
  :name "Leavanny"
  :introduced-in :bw
  :types [[:bug :grass]]
  :egggroups [[:bug]]
  :abilities [[:chlorophyll :overcoat :swarm]]
  :stats [[75 103 80 70 70 92]]
  :weight [20.5]
  :height [1.2])

(deffamily :sewaddle :swadloon :leavanny)
