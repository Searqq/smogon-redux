
(defpokemon :foongus
  :name "Foongus"
  :introduced-in :bw
  :types [[:grass :poison]]
  :egggroups [[:plant]]
  :abilities [[:effect-spore :regenerator]]
  :stats [[69 55 45 55 55 15]]
  :weight [1]
  :height [0.2])

(defpokemon :amoonguss
  :name "Amoonguss"
  :introduced-in :bw
  :types [[:grass :poison]]
  :egggroups [[:plant]]
  :abilities [[:effect-spore :regenerator]]
  :stats [[114 85 70 85 80 30]]
  :weight [10.5]
  :height [0.6])

(deffamily :foongus :amoonguss)
