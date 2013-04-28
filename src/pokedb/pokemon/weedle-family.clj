
(defpokemon :weedle
  :name "Weedle"
  :introduced-in :rb
  :types [[:bug :poison]]
  :egggroups [[:bug]]
  :abilities [[:shield-dust]
              :bw [:run-away :shield-dust]]
  :stats [[40 35 30 20 50]
          :gs [40 35 30 20 20 50]]
  :weight [3.2]
  :height [0.3])

(defpokemon :kakuna
  :name "Kakuna"
  :introduced-in :rb
  :types [[:bug :poison]]
  :egggroups [[:bug]]
  :abilities [[:shed-skin]]
  :stats [[45 25 50 25 35]
          :gs [45 25 50 25 25 35]]
  :weight [10]
  :height [0.6])

(defpokemon :beedrill
  :name "Beedrill"
  :introduced-in :rb
  :types [[:bug :poison]]
  :egggroups [[:bug]]
  :abilities [[:swarm]
              :bw [:sniper :swarm]]
  :stats [[65 80 40 45 75]
          :gs [65 80 40 45 80 75]]
  :weight [29.5]
  :height [1])

(deffamily :weedle :kakuna :beedrill)
