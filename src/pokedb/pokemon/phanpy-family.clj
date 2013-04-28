
(defpokemon :phanpy
  :name "Phanpy"
  :introduced-in :gs
  :types [[:ground]]
  :egggroups [[:ground]]
  :abilities [[:pickup]
              :bw [:pickup :sand-veil]]
  :stats [[90 60 60 40 40 40]]
  :weight [33.5]
  :height [0.5])

(defpokemon :donphan
  :name "Donphan"
  :introduced-in :gs
  :types [[:ground]]
  :egggroups [[:ground]]
  :abilities [[:sturdy]
              :bw [:sand-veil :sturdy]]
  :stats [[90 120 120 60 60 50]]
  :weight [120]
  :height [1.1])

(deffamily :phanpy :donphan)
