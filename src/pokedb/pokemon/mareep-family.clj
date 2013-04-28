
(defpokemon :mareep
  :name "Mareep"
  :introduced-in :gs
  :types [[:electric]]
  :egggroups [[:ground :monster]]
  :abilities [[:static]
              :bw [:plus :static]]
  :stats [[55 40 40 65 45 35]]
  :weight [7.8]
  :height [0.6])

(defpokemon :flaaffy
  :name "Flaaffy"
  :introduced-in :gs
  :types [[:electric]]
  :egggroups [[:ground :monster]]
  :abilities [[:static]
              :bw [:plus :static]]
  :stats [[70 55 55 80 60 45]]
  :weight [13.3]
  :height [0.8])

(defpokemon :ampharos
  :name "Ampharos"
  :introduced-in :gs
  :types [[:electric]]
  :egggroups [[:ground :monster]]
  :abilities [[:static]
              :bw [:plus :static]]
  :stats [[90 75 75 115 90 55]]
  :weight [61.5]
  :height [1.4])

(deffamily :mareep :flaaffy :ampharos)
