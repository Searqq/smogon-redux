
(defpokemon :karrablast
  :name "Karrablast"
  :introduced-in :bw
  :types [[:bug]]
  :egggroups [[:bug]]
  :abilities [[:no-guard :shed-skin :swarm]]
  :stats [[50 75 45 40 45 60]]
  :weight [5.9]
  :height [0.5])

(defpokemon :escavalier
  :name "Escavalier"
  :introduced-in :bw
  :types [[:bug :steel]]
  :egggroups [[:bug]]
  :abilities [[:overcoat :shell-armor :swarm]]
  :stats [[70 135 105 60 105 20]]
  :weight [33]
  :height [1])

(deffamily :karrablast :escavalier)
