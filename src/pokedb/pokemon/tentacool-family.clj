
(defpokemon :tentacool
  :name "Tentacool"
  :introduced-in :rb
  :types [[:poison :water]]
  :egggroups [[:water-3]]
  :abilities [[:clear-body :liquid-ooze]
              :bw [:clear-body :liquid-ooze :rain-dish]]
  :stats [[40 40 35 100 70]
          :gs [40 40 35 50 100 70]]
  :weight [45.5]
  :height [0.9])

(defpokemon :tentacruel
  :name "Tentacruel"
  :introduced-in :rb
  :types [[:poison :water]]
  :egggroups [[:water-3]]
  :abilities [[:clear-body :liquid-ooze]
              :bw [:clear-body :liquid-ooze :rain-dish]]
  :stats [[80 70 65 120 100]
          :gs [80 70 65 80 120 100]]
  :weight [55]
  :height [1.6])

(deffamily :tentacool :tentacruel)
