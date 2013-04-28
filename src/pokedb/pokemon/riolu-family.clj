
(defpokemon :riolu
  :name "Riolu"
  :introduced-in :dp
  :types [[:fighting]]
  :egggroups [[]]
  :abilities [[:inner-focus :prankster :steadfast]]
  :stats [[40 70 40 35 40 60]]
  :weight [20.2]
  :height [0.7])

(defpokemon :lucario
  :name "Lucario"
  :introduced-in :dp
  :types [[:fighting :steel]]
  :egggroups [[:ground :humanshape]]
  :abilities [[:inner-focus :justified :steadfast]]
  :stats [[70 110 70 115 70 90]]
  :weight [54]
  :height [1.2])

(deffamily :riolu :lucario)
