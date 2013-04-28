
(defpokemon :palkia
  :name "Palkia"
  :introduced-in :dp
  :types [[:dragon :water]]
  :egggroups [[]]
  :abilities [[:pressure :telepathy]]
  :stats [[90 120 100 150 120 100]]
  :weight [336]
  :height [4.2])

(defpokemon :dialga
  :name "Dialga"
  :introduced-in :dp
  :types [[:dragon :steel]]
  :egggroups [[]]
  :abilities [[:pressure :telepathy]]
  :stats [[100 120 120 150 100 90]]
  :weight [683]
  :height [5.4])

(defpokemon :giratina
  :name "Giratina"
  :introduced-in :dp
  :types [[:dragon :ghost]]
  :egggroups [[]]
  :abilities [[:pressure :telepathy]]
  :stats [[150 100 120 100 120 90]]
  :weight [750]
  :height [4.5])

(defpokemon :giratina-o
  :name "Giratina-Origin"
  :introduced-in :dp
  :types [[:dragon :ghost]]
  :egggroups [[]]
  :abilities [[:levitate]]
  :stats [[150 120 100 120 100 90]]
  :weight [650]
  :height [6.9])

(deffamily :giratina :giratina-o)
(deffamily :palkia)
(deffamily :dialga)
