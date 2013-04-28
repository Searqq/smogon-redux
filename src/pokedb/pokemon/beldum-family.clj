
(defpokemon :beldum
  :name "Beldum"
  :introduced-in :rs
  :types [[:psychic :steel]]
  :egggroups [[:mineral]]
  :abilities [[:clear-body]
              :bw [:clear-body :light-metal]]
  :stats [[40 55 80 35 60 30]]
  :weight [95.2]
  :height [0.6])

(defpokemon :metang
  :name "Metang"
  :introduced-in :rs
  :types [[:psychic :steel]]
  :egggroups [[:mineral]]
  :abilities [[:clear-body]
              :bw [:clear-body :light-metal]]
  :stats [[60 75 100 55 80 50]]
  :weight [202.5]
  :height [1.2])

(defpokemon :metagross
  :name "Metagross"
  :introduced-in :rs
  :types [[:psychic :steel]]
  :egggroups [[:mineral]]
  :abilities [[:clear-body]
              :bw [:clear-body :light-metal]]
  :stats [[80 135 130 95 90 70]]
  :weight [550]
  :height [1.6])

(deffamily :beldum :metang :metagross)
