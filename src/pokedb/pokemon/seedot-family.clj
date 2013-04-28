
(defpokemon :seedot
  :name "Seedot"
  :introduced-in :rs
  :types [[:grass]]
  :egggroups [[:ground :plant]]
  :abilities [[:chlorophyll :early-bird]
              :bw [:chlorophyll :early-bird :pickpocket]]
  :stats [[40 40 50 30 30 30]]
  :weight [4]
  :height [0.5])

(defpokemon :nuzleaf
  :name "Nuzleaf"
  :introduced-in :rs
  :types [[:dark :grass]]
  :egggroups [[:ground :plant]]
  :abilities [[:chlorophyll :early-bird]
              :bw [:chlorophyll :early-bird :pickpocket]]
  :stats [[70 70 40 60 40 60]]
  :weight [28]
  :height [1])

(defpokemon :shiftry
  :name "Shiftry"
  :introduced-in :rs
  :types [[:dark :grass]]
  :egggroups [[:ground :plant]]
  :abilities [[:chlorophyll :early-bird]
              :bw [:chlorophyll :early-bird :pickpocket]]
  :stats [[90 100 60 90 60 80]]
  :weight [59.6]
  :height [1.3])

(deffamily :seedot :nuzleaf :shiftry)
