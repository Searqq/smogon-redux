
(defpokemon :spoink
  :name "Spoink"
  :introduced-in :rs
  :types [[:psychic]]
  :egggroups [[:ground]]
  :abilities [[:own-tempo :thick-fat]
              :bw [:gluttony :own-tempo :thick-fat]]
  :stats [[60 25 35 70 80 60]]
  :weight [30.6]
  :height [0.7])

(defpokemon :grumpig
  :name "Grumpig"
  :introduced-in :rs
  :types [[:psychic]]
  :egggroups [[:ground]]
  :abilities [[:own-tempo :thick-fat]
              :bw [:gluttony :own-tempo :thick-fat]]
  :stats [[80 45 65 90 110 80]]
  :weight [71.5]
  :height [0.9])

(deffamily :spoink :grumpig)
