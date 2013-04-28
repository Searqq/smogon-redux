
(defpokemon :chingling
  :name "Chingling"
  :introduced-in :dp
  :types [[:psychic]]
  :egggroups [[]]
  :abilities [[:levitate]]
  :stats [[45 30 50 65 50 45]]
  :weight [0.6]
  :height [0.2])

(defpokemon :chimecho
  :name "Chimecho"
  :introduced-in :rs
  :types [[:psychic]]
  :egggroups [[:indeterminate]]
  :abilities [[:levitate]
              :bw [:levitate]]
  :stats [[65 50 70 95 80 65]]
  :weight [1]
  :height [0.6])

(deffamily :chingling :chimecho)
