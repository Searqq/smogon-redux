
(defpokemon :combee
  :name "Combee"
  :introduced-in :dp
  :types [[:bug :flying]]
  :egggroups [[:bug]]
  :abilities [[:honey-gather :hustle]]
  :stats [[30 30 42 30 42 70]]
  :weight [5.5]
  :height [0.3])

(defpokemon :vespiquen
  :name "Vespiquen"
  :introduced-in :dp
  :types [[:bug :flying]]
  :egggroups [[:bug]]
  :abilities [[:pressure :unnerve]]
  :stats [[70 80 102 80 102 40]]
  :weight [38.5]
  :height [1.2])

(deffamily :combee :vespiquen)
