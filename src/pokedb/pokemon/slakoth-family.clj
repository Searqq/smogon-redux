
(defpokemon :slakoth
  :name "Slakoth"
  :introduced-in :rs
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:truant]]
  :stats [[60 60 60 35 35 30]]
  :weight [24]
  :height [0.8])

(defpokemon :vigoroth
  :name "Vigoroth"
  :introduced-in :rs
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:vital-spirit]
              :bw [:vital-spirit]]
  :stats [[80 80 80 55 55 90]]
  :weight [46.5]
  :height [1.4])

(defpokemon :slaking
  :name "Slaking"
  :introduced-in :rs
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:truant]]
  :stats [[150 160 100 95 65 100]]
  :weight [130.5]
  :height [2])

(deffamily :slakoth :vigoroth :slaking)
