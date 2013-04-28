
(defpokemon :gastly
  :name "Gastly"
  :introduced-in :rb
  :types [[:ghost :poison]]
  :egggroups [[:indeterminate]]
  :abilities [[:levitate]
              :bw [:levitate]]
  :stats [[30 35 30 100 80]
          :gs [30 35 30 100 35 80]]
  :weight [0.1]
  :height [1.3])

(defpokemon :haunter
  :name "Haunter"
  :introduced-in :rb
  :types [[:ghost :poison]]
  :egggroups [[:indeterminate]]
  :abilities [[:levitate]
              :bw [:levitate]]
  :stats [[45 50 45 115 95]
          :gs [45 50 45 115 55 95]]
  :weight [0.1]
  :height [1.6])

(defpokemon :gengar
  :name "Gengar"
  :introduced-in :rb
  :types [[:ghost :poison]]
  :egggroups [[:indeterminate]]
  :abilities [[:levitate]
              :bw [:levitate]]
  :stats [[60 65 60 130 110]
          :gs [60 65 60 130 75 110]]
  :weight [40.5]
  :height [1.5])

(deffamily :gastly :haunter :gengar)
