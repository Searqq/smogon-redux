
(defpokemon :squirtle
  :name "Squirtle"
  :introduced-in :rb
  :types [[:water]]
  :egggroups [[:monster :water-1]]
  :abilities [[:torrent]
              :bw [:rain-dish :torrent]]
  :stats [[44 48 65 50 43]
          :gs [44 48 65 50 64 43]]
  :weight [9]
  :height [0.5])

(defpokemon :wartortle
  :name "Wartortle"
  :introduced-in :rb
  :types [[:water]]
  :egggroups [[:monster :water-1]]
  :abilities [[:torrent]
              :bw [:rain-dish :torrent]]
  :stats [[59 63 80 65 58]
          :gs [59 63 80 65 80 58]]
  :weight [22.5]
  :height [1])

(defpokemon :blastoise
  :name "Blastoise"
  :introduced-in :rb
  :types [[:water]]
  :egggroups [[:monster :water-1]]
  :abilities [[:torrent]
              :bw [:rain-dish :torrent]]
  :stats [[79 83 100 85 78]
          :gs [79 83 100 85 105 78]]
  :weight [85.5]
  :height [1.6])

(deffamily :squirtle :wartortle :blastoise)
