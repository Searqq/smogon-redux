
(defpokemon :patrat
  :name "Patrat"
  :introduced-in :dp
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:analytic :keen-eye :run-away]]
  :stats [[45 55 39 35 39 42]]
  :weight [11.6]
  :height [0.5])

(defpokemon :watchog
  :name "Watchog"
  :introduced-in :dp
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:analytic :illuminate :keen-eye]]
  :stats [[60 85 69 60 69 77]]
  :weight [27]
  :height [1.1])

(deffamily :patrat :watchog)
