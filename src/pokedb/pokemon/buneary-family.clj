
(defpokemon :buneary
  :name "Buneary"
  :introduced-in :dp
  :types [[:normal]]
  :egggroups [[:ground :humanshape]]
  :abilities [[:klutz :limber :run-away]]
  :stats [[55 66 44 44 56 85]]
  :weight [5.5]
  :height [0.4])

(defpokemon :lopunny
  :name "Lopunny"
  :introduced-in :dp
  :types [[:normal]]
  :egggroups [[:ground :humanshape]]
  :abilities [[:cute-charm :klutz :limber]]
  :stats [[65 76 84 54 96 105]]
  :weight [33.3]
  :height [1.2])

(deffamily :buneary :lopunny)
