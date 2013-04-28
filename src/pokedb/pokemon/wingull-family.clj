
(defpokemon :wingull
  :name "Wingull"
  :introduced-in :rs
  :types [[:flying :water]]
  :egggroups [[:flying :water-1]]
  :abilities [[:keen-eye]
              :bw [:keen-eye :rain-dish]]
  :stats [[40 30 30 55 30 85]]
  :weight [9.5]
  :height [0.6])

(defpokemon :pelipper
  :name "Pelipper"
  :introduced-in :rs
  :types [[:flying :water]]
  :egggroups [[:flying :water-1]]
  :abilities [[:keen-eye]
              :bw [:keen-eye :rain-dish]]
  :stats [[60 50 100 85 70 65]]
  :weight [28]
  :height [1.2])

(deffamily :wingull :pelipper)
