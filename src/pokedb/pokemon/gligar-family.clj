
(defpokemon :gligar
  :name "Gligar"
  :introduced-in :gs
  :types [[:flying :ground]]
  :egggroups [[:bug]]
  :abilities [[:hyper-cutter :sand-veil]
              :bw [:hyper-cutter :immunity :sand-veil]]
  :stats [[65 75 105 35 65 85]]
  :weight [64.8]
  :height [1.1])

(defpokemon :gliscor
  :name "Gliscor"
  :introduced-in :dp
  :types [[:flying :ground]]
  :egggroups [[:bug]]
  :abilities [[:hyper-cutter :poison-heal :sand-veil]]
  :stats [[75 95 125 45 75 95]]
  :weight [42.5]
  :height [2])

(deffamily :gligar :gliscor)
