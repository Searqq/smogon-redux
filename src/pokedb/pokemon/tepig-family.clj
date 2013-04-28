
(defpokemon :tepig
  :name "Tepig"
  :introduced-in :dp
  :types [[:fire]]
  :egggroups [[:ground]]
  :abilities [[:blaze :thick-fat]]
  :stats [[65 63 45 45 45 45]]
  :weight [9.9]
  :height [0.5])

(defpokemon :pignite
  :name "Pignite"
  :introduced-in :dp
  :types [[:fighting :fire]]
  :egggroups [[:ground]]
  :abilities [[:blaze :thick-fat]]
  :stats [[90 93 55 70 55 55]]
  :weight [55.5]
  :height [1])

(defpokemon :emboar
  :name "Emboar"
  :introduced-in :dp
  :types [[:fighting :fire]]
  :egggroups [[:ground]]
  :abilities [[:blaze :reckless]]
  :stats [[110 123 65 100 65 65]]
  :weight [150]
  :height [1.6])

(deffamily :tepig :pignite :emboar)
