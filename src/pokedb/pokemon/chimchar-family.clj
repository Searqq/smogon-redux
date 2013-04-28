
(defpokemon :chimchar
  :name "Chimchar"
  :introduced-in :dp
  :types [[:fire]]
  :egggroups [[:ground :humanshape]]
  :abilities [[:blaze :iron-fist]]
  :stats [[44 58 44 58 44 61]]
  :weight [6.2]
  :height [0.5])

(defpokemon :monferno
  :name "Monferno"
  :introduced-in :dp
  :types [[:fighting :fire]]
  :egggroups [[:ground :humanshape]]
  :abilities [[:blaze :iron-fist]]
  :stats [[64 78 52 78 52 81]]
  :weight [22]
  :height [0.9])

(defpokemon :infernape
  :name "Infernape"
  :introduced-in :dp
  :types [[:fighting :fire]]
  :egggroups [[:ground :humanshape]]
  :abilities [[:blaze :iron-fist]]
  :stats [[76 104 71 104 71 108]]
  :weight [55]
  :height [1.2])

(deffamily :chimchar :monferno :infernape)
