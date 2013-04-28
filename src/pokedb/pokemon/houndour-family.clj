
(defpokemon :houndour
  :name "Houndour"
  :introduced-in :gs
  :types [[:dark :fire]]
  :egggroups [[:ground]]
  :abilities [[:early-bird :flash-fire]
              :bw [:early-bird :flash-fire :unnerve]]
  :stats [[45 60 30 80 50 65]]
  :weight [10.8]
  :height [0.6])

(defpokemon :houndoom
  :name "Houndoom"
  :introduced-in :gs
  :types [[:dark :fire]]
  :egggroups [[:ground]]
  :abilities [[:early-bird :flash-fire]
              :bw [:early-bird :flash-fire :unnerve]]
  :stats [[75 90 50 110 80 95]]
  :weight [35]
  :height [1.4])

(deffamily :houndour :houndoom)
