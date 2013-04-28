
(defpokemon :staryu
  :name "Staryu"
  :introduced-in :rb
  :types [[:water]]
  :egggroups [[:water-3]]
  :abilities [[:illuminate :natural-cure]
              :bw [:analytic :illuminate :natural-cure]]
  :stats [[30 45 55 70 85]
          :gs [30 45 55 70 55 85]]
  :weight [34.5]
  :height [0.8])

(defpokemon :starmie
  :name "Starmie"
  :introduced-in :rb
  :types [[:psychic :water]]
  :egggroups [[:water-3]]
  :abilities [[:illuminate :natural-cure]
              :bw [:analytic :illuminate :natural-cure]]
  :stats [[60 75 85 100 115]
          :gs [60 75 85 100 85 115]]
  :weight [80]
  :height [1.1])

(deffamily :staryu :starmie)
