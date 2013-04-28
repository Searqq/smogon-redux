
(defpokemon :natu
  :name "Natu"
  :introduced-in :gs
  :types [[:flying :psychic]]
  :egggroups [[:flying]]
  :abilities [[:early-bird :synchronize]
              :bw [:early-bird :magic-bounce :synchronize]]
  :stats [[40 50 45 70 45 70]]
  :weight [2]
  :height [0.2])

(defpokemon :xatu
  :name "Xatu"
  :introduced-in :gs
  :types [[:flying :psychic]]
  :egggroups [[:flying]]
  :abilities [[:early-bird :synchronize]
              :bw [:early-bird :magic-bounce :synchronize]]
  :stats [[65 75 70 95 70 95]]
  :weight [15]
  :height [1.5])

(deffamily :natu :xatu)
