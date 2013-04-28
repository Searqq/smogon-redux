
(defpokemon :shinx
  :name "Shinx"
  :introduced-in :dp
  :types [[:electric]]
  :egggroups [[:ground]]
  :abilities [[:guts :intimidate :rivalry]]
  :stats [[45 65 34 40 34 45]]
  :weight [9.5]
  :height [0.5])

(defpokemon :luxio
  :name "Luxio"
  :introduced-in :dp
  :types [[:electric]]
  :egggroups [[:ground]]
  :abilities [[:guts :intimidate :rivalry]]
  :stats [[60 85 49 60 49 60]]
  :weight [30.5]
  :height [0.9])

(defpokemon :luxray
  :name "Luxray"
  :introduced-in :dp
  :types [[:electric]]
  :egggroups [[:ground]]
  :abilities [[:guts :intimidate :rivalry]]
  :stats [[80 120 79 95 79 70]]
  :weight [42]
  :height [1.4])

(deffamily :shinx :luxio :luxray)
