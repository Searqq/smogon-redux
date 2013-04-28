
(defpokemon :spinarak
  :name "Spinarak"
  :introduced-in :gs
  :types [[:bug :poison]]
  :egggroups [[:bug]]
  :abilities [[:insomnia :swarm]
              :bw [:insomnia :sniper :swarm]]
  :stats [[40 60 40 40 40 30]]
  :weight [8.5]
  :height [0.5])

(defpokemon :ariados
  :name "Ariados"
  :introduced-in :gs
  :types [[:bug :poison]]
  :egggroups [[:bug]]
  :abilities [[:insomnia :swarm]
              :bw [:insomnia :sniper :swarm]]
  :stats [[70 90 70 60 60 40]]
  :weight [33.5]
  :height [1.1])

(deffamily :spinarak :ariados)
