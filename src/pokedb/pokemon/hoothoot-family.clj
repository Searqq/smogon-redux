
(defpokemon :hoothoot
  :name "Hoothoot"
  :introduced-in :gs
  :types [[:flying :normal]]
  :egggroups [[:flying]]
  :abilities [[:insomnia :keen-eye]
              :bw [:insomnia :keen-eye :tinted-lens]]
  :stats [[60 30 30 36 56 50]]
  :weight [21.2]
  :height [0.7])

(defpokemon :noctowl
  :name "Noctowl"
  :introduced-in :gs
  :types [[:flying :normal]]
  :egggroups [[:flying]]
  :abilities [[:insomnia :keen-eye]
              :bw [:insomnia :keen-eye :tinted-lens]]
  :stats [[100 50 50 76 96 70]]
  :weight [40.8]
  :height [1.6])

(deffamily :hoothoot :noctowl)
