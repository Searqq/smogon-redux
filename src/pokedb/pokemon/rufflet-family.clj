
(defpokemon :rufflet
  :name "Rufflet"
  :introduced-in :bw
  :types [[:flying :normal]]
  :egggroups [[:flying]]
  :abilities [[:hustle :keen-eye :sheer-force]]
  :stats [[70 83 50 37 50 60]]
  :weight [10.5]
  :height [0.5])

(defpokemon :braviary
  :name "Braviary"
  :introduced-in :bw
  :types [[:flying :normal]]
  :egggroups [[:flying]]
  :abilities [[:defiant :keen-eye :sheer-force]]
  :stats [[100 123 75 57 75 80]]
  :weight [41]
  :height [1.5])

(deffamily :rufflet :braviary)
