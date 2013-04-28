
(defpokemon :ledyba
  :name "Ledyba"
  :introduced-in :gs
  :types [[:bug :flying]]
  :egggroups [[:bug]]
  :abilities [[:early-bird :swarm]
              :bw [:early-bird :rattled :swarm]]
  :stats [[40 20 30 40 80 55]]
  :weight [10.8]
  :height [1])

(defpokemon :ledian
  :name "Ledian"
  :introduced-in :gs
  :types [[:bug :flying]]
  :egggroups [[:bug]]
  :abilities [[:early-bird :swarm]
              :bw [:early-bird :iron-fist :swarm]]
  :stats [[55 35 50 55 110 85]]
  :weight [35.6]
  :height [1.4])

(deffamily :ledyba :ledian)
