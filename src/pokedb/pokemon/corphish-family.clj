
(defpokemon :corphish
  :name "Corphish"
  :introduced-in :rs
  :types [[:water]]
  :egggroups [[:water-1 :water-3]]
  :abilities [[:hyper-cutter :shell-armor]
              :bw [:adaptability :hyper-cutter :shell-armor]]
  :stats [[43 80 65 50 35 35]]
  :weight [11.5]
  :height [0.6])

(defpokemon :crawdaunt
  :name "Crawdaunt"
  :introduced-in :rs
  :types [[:dark :water]]
  :egggroups [[:water-1 :water-3]]
  :abilities [[:hyper-cutter :shell-armor]
              :bw [:adaptability :hyper-cutter :shell-armor]]
  :stats [[63 120 85 90 55 55]]
  :weight [32.8]
  :height [1.1])

(deffamily :corphish :crawdaunt)
