
(defpokemon :baltoy
  :name "Baltoy"
  :introduced-in :rs
  :types [[:ground :psychic]]
  :egggroups [[:mineral]]
  :abilities [[:levitate]
              :bw [:levitate]]
  :stats [[40 40 55 40 70 55]]
  :weight [21.5]
  :height [0.5])

(defpokemon :claydol
  :name "Claydol"
  :introduced-in :rs
  :types [[:ground :psychic]]
  :egggroups [[:mineral]]
  :abilities [[:levitate]
              :bw [:levitate]]
  :stats [[60 70 105 70 120 75]]
  :weight [108]
  :height [1.5])

(deffamily :baltoy :claydol)
