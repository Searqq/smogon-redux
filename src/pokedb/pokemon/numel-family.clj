
(defpokemon :numel
  :name "Numel"
  :introduced-in :rs
  :types [[:fire :ground]]
  :egggroups [[:ground]]
  :abilities [[:oblivious]
              :dp [:oblivious :simple]
              :bw [:oblivious :own-tempo :simple]]
  :stats [[60 60 40 65 45 35]]
  :weight [24]
  :height [0.7])

(defpokemon :camerupt
  :name "Camerupt"
  :introduced-in :rs
  :types [[:fire :ground]]
  :egggroups [[:ground]]
  :abilities [[:magma-armor]
              :dp [:magma-armor :solid-rock]
              :bw [:anger-point :magma-armor :solid-rock]]
  :stats [[70 100 70 105 75 40]]
  :weight [220]
  :height [1.9])

(deffamily :numel :camerupt)
