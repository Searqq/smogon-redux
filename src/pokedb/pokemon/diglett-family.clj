
(defpokemon :diglett
  :name "Diglett"
  :introduced-in :rb
  :types [[:ground]]
  :egggroups [[:ground]]
  :abilities [[:arena-trap :sand-veil]
              :bw [:arena-trap :sand-force :sand-veil]]
  :stats [[10 55 25 45 95]
          :gs [10 55 25 35 45 95]]
  :weight [0.8]
  :height [0.2])

(defpokemon :dugtrio
  :name "Dugtrio"
  :introduced-in :rb
  :types [[:ground]]
  :egggroups [[:ground]]
  :abilities [[:arena-trap :sand-veil]
              :bw [:arena-trap :sand-force :sand-veil]]
  :stats [[35 80 50 70 120]
          :gs [35 80 50 50 70 120]]
  :weight [33.3]
  :height [0.7])

(deffamily :diglett :dugtrio)
