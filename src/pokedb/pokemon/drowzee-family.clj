
(defpokemon :drowzee
  :name "Drowzee"
  :introduced-in :rb
  :types [[:psychic]]
  :egggroups [[:humanshape]]
  :abilities [[:insomnia]
              :dp [:forewarn :insomnia]
              :bw [:forewarn :inner-focus :insomnia]]
  :stats [[60 48 45 90 42]
          :gs [60 48 45 43 90 42]]
  :weight [32.4]
  :height [1])

(defpokemon :hypno
  :name "Hypno"
  :introduced-in :rb
  :types [[:psychic]]
  :egggroups [[:humanshape]]
  :abilities [[:insomnia]
              :dp [:forewarn :insomnia]
              :bw [:forewarn :inner-focus :insomnia]]
  :stats [[85 73 70 115 67]
          :gs [85 73 70 73 115 67]]
  :weight [75.6]
  :height [1.6])

(deffamily :drowzee :hypno)
