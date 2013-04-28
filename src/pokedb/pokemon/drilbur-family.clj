
(defpokemon :drilbur
  :name "Drilbur"
  :introduced-in :bw
  :types [[:ground]]
  :egggroups [[:ground]]
  :abilities [[:mold-breaker :sand-force :sand-rush]]
  :stats [[60 85 40 30 45 68]]
  :weight [8.5]
  :height [0.3])

(defpokemon :excadrill
  :name "Excadrill"
  :introduced-in :bw
  :types [[:ground :steel]]
  :egggroups [[:ground]]
  :abilities [[:mold-breaker :sand-force :sand-rush]]
  :stats [[110 135 60 50 65 88]]
  :weight [40.4]
  :height [0.7])

(deffamily :drilbur :excadrill)
