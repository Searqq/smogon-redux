
(defpokemon :sunkern
  :name "Sunkern"
  :introduced-in :gs
  :types [[:grass]]
  :egggroups [[:plant]]
  :abilities [[:chlorophyll]
              :dp [:chlorophyll :solar-power]
              :bw [:chlorophyll :early-bird :solar-power]]
  :stats [[30 30 30 30 30 30]]
  :weight [1.8]
  :height [0.3])

(defpokemon :sunflora
  :name "Sunflora"
  :introduced-in :gs
  :types [[:grass]]
  :egggroups [[:plant]]
  :abilities [[:chlorophyll]
              :dp [:chlorophyll :solar-power]
              :bw [:chlorophyll :early-bird :solar-power]]
  :stats [[75 75 55 105 85 30]]
  :weight [8.5]
  :height [0.8])

(deffamily :sunkern :sunflora)
