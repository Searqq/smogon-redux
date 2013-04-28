
(defpokemon :spheal
  :name "Spheal"
  :introduced-in :rs
  :types [[:ice :water]]
  :egggroups [[:ground :water-1]]
  :abilities [[:thick-fat]
              :dp [:ice-body :thick-fat]
              :bw [:ice-body :oblivious :thick-fat]]
  :stats [[70 40 50 55 50 25]]
  :weight [39.5]
  :height [0.8])

(defpokemon :sealeo
  :name "Sealeo"
  :introduced-in :rs
  :types [[:ice :water]]
  :egggroups [[:ground :water-1]]
  :abilities [[:thick-fat]
              :dp [:ice-body :thick-fat]
              :bw [:ice-body :oblivious :thick-fat]]
  :stats [[90 60 70 75 70 45]]
  :weight [87.6]
  :height [1.1])

(defpokemon :walrein
  :name "Walrein"
  :introduced-in :rs
  :types [[:ice :water]]
  :egggroups [[:ground :water-1]]
  :abilities [[:thick-fat]
              :dp [:ice-body :thick-fat]
              :bw [:ice-body :oblivious :thick-fat]]
  :stats [[110 80 90 95 90 65]]
  :weight [150.6]
  :height [1.4])

(deffamily :spheal :sealeo :walrein)
