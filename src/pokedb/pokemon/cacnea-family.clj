
(defpokemon :cacnea
  :name "Cacnea"
  :introduced-in :rs
  :types [[:grass]]
  :egggroups [[:humanshape :plant]]
  :abilities [[:sand-veil]
              :bw [:sand-veil :water-absorb]]
  :stats [[50 85 40 85 40 35]]
  :weight [51.3]
  :height [0.4])

(defpokemon :cacturne
  :name "Cacturne"
  :introduced-in :rs
  :types [[:dark :grass]]
  :egggroups [[:humanshape :plant]]
  :abilities [[:sand-veil]
              :bw [:sand-veil :water-absorb]]
  :stats [[70 115 60 115 60 55]]
  :weight [77.4]
  :height [1.3])

(deffamily :cacnea :cacturne)
