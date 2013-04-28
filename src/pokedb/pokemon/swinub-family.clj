
(defpokemon :swinub
  :name "Swinub"
  :introduced-in :gs
  :types [[:ground :ice]]
  :egggroups [[:ground]]
  :abilities [[:oblivious]
              :dp [:oblivious :snow-cloak]
              :bw [:oblivious :snow-cloak :thick-fat]]
  :stats [[50 50 40 30 30 50]]
  :weight [6.5]
  :height [0.4])

(defpokemon :piloswine
  :name "Piloswine"
  :introduced-in :gs
  :types [[:ground :ice]]
  :egggroups [[:ground]]
  :abilities [[:oblivious]
              :dp [:oblivious :snow-cloak]
              :bw [:oblivious :snow-cloak :thick-fat]]
  :stats [[100 100 80 60 60 50]]
  :weight [55.8]
  :height [1.1])

(defpokemon :mamoswine
  :name "Mamoswine"
  :introduced-in :dp
  :types [[:ground :ice]]
  :egggroups [[:ground]]
  :abilities [[:oblivious :snow-cloak :thick-fat]]
  :stats [[110 130 80 70 60 80]]
  :weight [291]
  :height [2.5])

(deffamily :swinub :piloswine :mamoswine)
