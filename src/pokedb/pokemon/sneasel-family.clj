
(defpokemon :sneasel
  :name "Sneasel"
  :introduced-in :gs
  :types [[:dark :ice]]
  :egggroups [[:ground]]
  :abilities [[:inner-focus :keen-eye]
              :bw [:inner-focus :keen-eye :pickpocket]]
  :stats [[55 95 55 35 75 115]]
  :weight [28]
  :height [0.9])

(defpokemon :weavile
  :name "Weavile"
  :introduced-in :dp
  :types [[:dark :ice]]
  :egggroups [[:ground]]
  :abilities [[:pickpocket :pressure]]
  :stats [[70 120 65 45 85 125]]
  :weight [34]
  :height [1.1])

(deffamily :sneasel :weavile)
