
(defpokemon :mankey
  :name "Mankey"
  :introduced-in :rb
  :types [[:fighting]]
  :egggroups [[:ground]]
  :abilities [[:vital-spirit]
              :dp [:anger-point :vital-spirit]
              :bw [:anger-point :defiant :vital-spirit]]
  :stats [[40 80 35 35 70]
          :gs [40 80 35 35 45 70]]
  :weight [28]
  :height [0.5])

(defpokemon :primeape
  :name "Primeape"
  :introduced-in :rb
  :types [[:fighting]]
  :egggroups [[:ground]]
  :abilities [[:vital-spirit]
              :dp [:anger-point :vital-spirit]
              :bw [:anger-point :defiant :vital-spirit]]
  :stats [[65 105 60 60 95]
          :gs [65 105 60 60 70 95]]
  :weight [32]
  :height [1])

(deffamily :mankey :primeape)
