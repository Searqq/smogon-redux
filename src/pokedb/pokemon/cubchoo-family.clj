
(defpokemon :cubchoo
  :name "Cubchoo"
  :introduced-in :bw
  :types [[:ice]]
  :egggroups [[:ground]]
  :abilities [[:rattled :snow-cloak]]
  :stats [[55 70 40 60 40 40]]
  :weight [8.5]
  :height [0.5])

(defpokemon :beartic
  :name "Beartic"
  :introduced-in :bw
  :types [[:ice]]
  :egggroups [[:ground]]
  :abilities [[:snow-cloak :swift-swim]]
  :stats [[95 110 80 70 80 50]]
  :weight [260]
  :height [2.6])

(deffamily :cubchoo :beartic)
