
(defpokemon :aipom
  :name "Aipom"
  :introduced-in :gs
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:pickup :run-away]
              :bw [:pickup :run-away :skill-link]]
  :stats [[55 70 55 40 55 85]]
  :weight [11.5]
  :height [0.8])

(defpokemon :ambipom
  :name "Ambipom"
  :introduced-in :dp
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:pickup :skill-link :technician]]
  :stats [[75 100 66 60 66 115]]
  :weight [20.3]
  :height [1.2])

(deffamily :aipom :ambipom)
