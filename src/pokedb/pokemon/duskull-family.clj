
(defpokemon :duskull
  :name "Duskull"
  :introduced-in :rs
  :types [[:ghost]]
  :egggroups [[:indeterminate]]
  :abilities [[:levitate]
              :bw [:levitate]]
  :stats [[20 40 90 30 90 25]]
  :weight [15]
  :height [0.8])

(defpokemon :dusclops
  :name "Dusclops"
  :introduced-in :rs
  :types [[:ghost]]
  :egggroups [[:indeterminate]]
  :abilities [[:pressure]
              :bw [:pressure]]
  :stats [[40 70 130 60 130 25]]
  :weight [30.6]
  :height [1.6])

(defpokemon :dusknoir
  :name "Dusknoir"
  :introduced-in :dp
  :types [[:ghost]]
  :egggroups [[:indeterminate]]
  :abilities [[:pressure]]
  :stats [[45 100 135 65 135 45]]
  :weight [106.6]
  :height [2.2])

(deffamily :duskull :dusclops :dusknoir)
