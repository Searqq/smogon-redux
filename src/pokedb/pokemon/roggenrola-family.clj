
(defpokemon :roggenrola
  :name "Roggenrola"
  :introduced-in :bw
  :types [[:rock]]
  :egggroups [[:mineral]]
  :abilities [[:sand-force :sturdy]]
  :stats [[55 75 85 25 25 15]]
  :weight [18]
  :height [0.4])

(defpokemon :boldore
  :name "Boldore"
  :introduced-in :bw
  :types [[:rock]]
  :egggroups [[:mineral]]
  :abilities [[:sand-force :sturdy]]
  :stats [[70 105 105 50 40 20]]
  :weight [102]
  :height [0.9])

(defpokemon :gigalith
  :name "Gigalith"
  :introduced-in :bw
  :types [[:rock]]
  :egggroups [[:mineral]]
  :abilities [[:sand-force :sturdy]]
  :stats [[85 135 130 60 70 25]]
  :weight [260]
  :height [1.7])

(deffamily :roggenrola :boldore :gigalith)
