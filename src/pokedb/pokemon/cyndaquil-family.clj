
(defpokemon :cyndaquil
  :name "Cyndaquil"
  :introduced-in :gs
  :types [[:fire]]
  :egggroups [[:ground]]
  :abilities [[:blaze]
              :bw [:blaze :flash-fire]]
  :stats [[39 52 43 60 50 65]]
  :weight [7.9]
  :height [0.5])

(defpokemon :quilava
  :name "Quilava"
  :introduced-in :gs
  :types [[:fire]]
  :egggroups [[:ground]]
  :abilities [[:blaze]
              :bw [:blaze :flash-fire]]
  :stats [[58 64 58 80 65 80]]
  :weight [19]
  :height [0.9])

(defpokemon :typhlosion
  :name "Typhlosion"
  :introduced-in :gs
  :types [[:fire]]
  :egggroups [[:ground]]
  :abilities [[:blaze]
              :bw [:blaze :flash-fire]]
  :stats [[78 84 78 109 85 100]]
  :weight [79.5]
  :height [1.7])

(deffamily :cyndaquil :quilava :typhlosion)
