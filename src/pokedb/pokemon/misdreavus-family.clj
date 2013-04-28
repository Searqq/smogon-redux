
(defpokemon :misdreavus
  :name "Misdreavus"
  :introduced-in :gs
  :types [[:ghost]]
  :egggroups [[:indeterminate]]
  :abilities [[:levitate]
              :bw [:levitate]]
  :stats [[60 60 60 85 85 85]]
  :weight [1]
  :height [0.7])

(defpokemon :mismagius
  :name "Mismagius"
  :introduced-in :dp
  :types [[:ghost]]
  :egggroups [[:indeterminate]]
  :abilities [[:levitate]]
  :stats [[60 60 60 105 105 105]]
  :weight [4.4]
  :height [0.9])

(deffamily :misdreavus :mismagius)
