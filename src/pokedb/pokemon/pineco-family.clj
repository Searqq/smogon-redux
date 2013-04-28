
(defpokemon :pineco
  :name "Pineco"
  :introduced-in :gs
  :types [[:bug]]
  :egggroups [[:bug]]
  :abilities [[:sturdy]
              :bw [:overcoat :sturdy]]
  :stats [[50 65 90 35 35 15]]
  :weight [7.2]
  :height [0.6])

(defpokemon :forretress
  :name "Forretress"
  :introduced-in :gs
  :types [[:bug :steel]]
  :egggroups [[:bug]]
  :abilities [[:sturdy]
              :bw [:overcoat :sturdy]]
  :stats [[75 90 140 60 60 40]]
  :weight [125.8]
  :height [1.2])

(deffamily :pineco :forretress)
