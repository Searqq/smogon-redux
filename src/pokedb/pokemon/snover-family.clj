
(defpokemon :snover
  :name "Snover"
  :introduced-in :dp
  :types [[:grass :ice]]
  :egggroups [[:monster :plant]]
  :abilities [[:snow-warning :soundproof]]
  :stats [[60 62 50 62 60 40]]
  :weight [50.5]
  :height [1])

(defpokemon :abomasnow
  :name "Abomasnow"
  :introduced-in :dp
  :types [[:grass :ice]]
  :egggroups [[:monster :plant]]
  :abilities [[:snow-warning :soundproof]]
  :stats [[90 92 75 92 85 60]]
  :weight [135.5]
  :height [2.2])

(deffamily :snover :abomasnow)
