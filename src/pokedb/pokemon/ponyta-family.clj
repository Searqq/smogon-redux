
(defpokemon :ponyta
  :name "Ponyta"
  :introduced-in :rb
  :types [[:fire]]
  :egggroups [[:ground]]
  :abilities [[:flash-fire :run-away]
              :bw [:flame-body :flash-fire :run-away]]
  :stats [[50 85 55 65 90]
          :gs [50 85 55 65 65 90]]
  :weight [30]
  :height [1])

(defpokemon :rapidash
  :name "Rapidash"
  :introduced-in :rb
  :types [[:fire]]
  :egggroups [[:ground]]
  :abilities [[:flash-fire :run-away]
              :bw [:flame-body :flash-fire :run-away]]
  :stats [[65 100 70 80 105]
          :gs [65 100 70 80 80 105]]
  :weight [95]
  :height [1.7])

(deffamily :ponyta :rapidash)
