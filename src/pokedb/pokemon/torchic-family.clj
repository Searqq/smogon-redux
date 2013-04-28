
(defpokemon :torchic
  :name "Torchic"
  :introduced-in :rs
  :types [[:fire]]
  :egggroups [[:ground]]
  :abilities [[:blaze]
              :bw [:blaze :speed-boost]]
  :stats [[45 60 40 70 50 45]]
  :weight [2.5]
  :height [0.4])

(defpokemon :combusken
  :name "Combusken"
  :introduced-in :rs
  :types [[:fighting :fire]]
  :egggroups [[:ground]]
  :abilities [[:blaze]
              :bw [:blaze :speed-boost]]
  :stats [[60 85 60 85 60 55]]
  :weight [19.5]
  :height [0.9])

(defpokemon :blaziken
  :name "Blaziken"
  :introduced-in :rs
  :types [[:fighting :fire]]
  :egggroups [[:ground]]
  :abilities [[:blaze]
              :bw [:blaze :speed-boost]]
  :stats [[80 120 70 110 70 80]]
  :weight [52]
  :height [1.9])

(deffamily :torchic :combusken :blaziken)
