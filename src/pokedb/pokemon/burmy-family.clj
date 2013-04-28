
(defpokemon :burmy
  :name "Burmy"
  :introduced-in :dp
  :types [[:bug]]
  :egggroups [[:bug]]
  :abilities [[:overcoat :shed-skin]]
  :stats [[40 29 45 29 45 36]]
  :weight [3.4]
  :height [0.2])

(defpokemon :wormadam
  :name "Wormadam"
  :introduced-in :dp
  :types [[:bug :grass]]
  :egggroups [[:bug]]
  :abilities [[:anticipation :overcoat]]
  :stats [[60 59 85 79 105 36]]
  :weight [6.5]
  :height [0.5])

(defpokemon :wormadam-s
  :name "Wormadam-Sandy"
  :introduced-in :dp
  :types [[:bug :ground]]
  :egggroups [[:bug]]
  :abilities [[:anticipation :overcoat]]
  :stats [[60 79 105 59 85 36]]
  :weight [6.5]
  :height [0.5])

(defpokemon :wormadam-t
  :name "Wormadam-Trash"
  :introduced-in :dp
  :types [[:bug :steel]]
  :egggroups [[:bug]]
  :abilities [[:anticipation :overcoat]]
  :stats [[60 69 95 69 95 36]]
  :weight [6.5]
  :height [0.5])

(defpokemon :mothim
  :name "Mothim"
  :introduced-in :dp
  :types [[:bug :flying]]
  :egggroups [[:bug]]
  :abilities [[:swarm :tinted-lens]]
  :stats [[70 94 50 94 50 66]]
  :weight [23.3]
  :height [0.9])

(deffamily :burmy [:wormadam :mothim])
