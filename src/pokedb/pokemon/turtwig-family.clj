
(defpokemon :turtwig
  :name "Turtwig"
  :introduced-in :dp
  :types [[:grass]]
  :egggroups [[:monster :plant]]
  :abilities [[:overgrow :shell-armor]]
  :stats [[55 68 64 45 55 31]]
  :weight [10.2]
  :height [0.4])

(defpokemon :grotle
  :name "Grotle"
  :introduced-in :dp
  :types [[:grass]]
  :egggroups [[:monster :plant]]
  :abilities [[:overgrow :shell-armor]]
  :stats [[75 89 85 55 65 36]]
  :weight [97]
  :height [1.1])

(defpokemon :torterra
  :name "Torterra"
  :introduced-in :dp
  :types [[:grass :ground]]
  :egggroups [[:monster :plant]]
  :abilities [[:overgrow :shell-armor]]
  :stats [[95 109 105 75 85 56]]
  :weight [310]
  :height [2.2])

(deffamily :turtwig :grotle :torterra)
