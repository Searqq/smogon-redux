
(defpokemon :electrike
  :name "Electrike"
  :introduced-in :rs
  :types [[:electric]]
  :egggroups [[:ground]]
  :abilities [[:lightningrod :static]
              :bw [:lightningrod :minus :static]]
  :stats [[40 45 40 65 40 65]]
  :weight [15.2]
  :height [0.6])

(defpokemon :manectric
  :name "Manectric"
  :introduced-in :rs
  :types [[:electric]]
  :egggroups [[:ground]]
  :abilities [[:lightningrod :static]
              :bw [:lightningrod :minus :static]]
  :stats [[70 75 60 105 60 105]]
  :weight [40.2]
  :height [1.5])

(deffamily :electrike :manectric)
