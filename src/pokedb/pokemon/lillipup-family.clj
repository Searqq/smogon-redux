
(defpokemon :lillipup
  :name "Lillipup"
  :introduced-in :dp
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:pickup :run-away :vital-spirit]]
  :stats [[45 60 45 25 45 55]]
  :weight [4.1]
  :height [0.4])

(defpokemon :herdier
  :name "Herdier"
  :introduced-in :dp
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:intimidate :sand-rush :scrappy]]
  :stats [[65 80 65 35 65 60]]
  :weight [14.7]
  :height [0.9])

(defpokemon :stoutland
  :name "Stoutland"
  :introduced-in :dp
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:intimidate :sand-rush :scrappy]]
  :stats [[85 100 90 45 90 80]]
  :weight [61]
  :height [1.2])

(deffamily :lillipup :herdier :stoutland)
