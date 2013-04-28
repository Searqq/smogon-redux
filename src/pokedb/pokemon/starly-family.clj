
(defpokemon :starly
  :name "Starly"
  :introduced-in :dp
  :types [[:flying :normal]]
  :egggroups [[:flying]]
  :abilities [[:keen-eye]]
  :stats [[40 55 30 30 30 60]]
  :weight [2]
  :height [0.3])

(defpokemon :staravia
  :name "Staravia"
  :introduced-in :dp
  :types [[:flying :normal]]
  :egggroups [[:flying]]
  :abilities [[:intimidate :reckless]]
  :stats [[55 75 50 40 40 80]]
  :weight [15.5]
  :height [0.6])

(defpokemon :staraptor
  :name "Staraptor"
  :introduced-in :dp
  :types [[:flying :normal]]
  :egggroups [[:flying]]
  :abilities [[:intimidate :reckless]]
  :stats [[85 120 70 50 50 100]]
  :weight [24.9]
  :height [1.2])

(deffamily :starly :staravia :staraptor)
