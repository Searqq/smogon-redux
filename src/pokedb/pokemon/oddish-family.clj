
(defpokemon :oddish
  :name "Oddish"
  :introduced-in :rb
  :types [[:grass :poison]]
  :egggroups [[:plant]]
  :abilities [[:chlorophyll]
              :bw [:chlorophyll :run-away]]
  :stats [[45 50 55 75 30]
          :gs [45 50 55 75 65 30]]
  :weight [5.4]
  :height [0.5])

(defpokemon :gloom
  :name "Gloom"
  :introduced-in :rb
  :types [[:grass :poison]]
  :egggroups [[:plant]]
  :abilities [[:chlorophyll]
              :bw [:chlorophyll :stench]]
  :stats [[60 65 70 85 40]
          :gs [60 65 70 85 75 40]]
  :weight [8.6]
  :height [0.8])

(defpokemon :vileplume
  :name "Vileplume"
  :introduced-in :rb
  :types [[:grass :poison]]
  :egggroups [[:plant]]
  :abilities [[:chlorophyll]
              :bw [:chlorophyll :effect-spore]]
  :stats [[75 80 85 100 50]
          :gs [75 80 85 100 90 50]]
  :weight [18.6]
  :height [1.2])

(defpokemon :bellossom
  :name "Bellossom"
  :introduced-in :gs
  :types [[:grass]]
  :egggroups [[:plant]]
  :abilities [[:chlorophyll]
              :bw [:chlorophyll :healer]]
  :stats [[75 80 85 90 100 50]]
  :weight [5.8]
  :height [0.4])

(deffamily :oddish :gloom [:vileplume :bellossom])
