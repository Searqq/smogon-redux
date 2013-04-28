
(defpokemon :wynaut
  :name "Wynaut"
  :introduced-in :rs
  :types [[:psychic]]
  :egggroups [[]]
  :abilities [[:shadow-tag]
              :bw [:shadow-tag :telepathy]]
  :stats [[95 23 48 23 48 23]]
  :weight [14]
  :height [0.6])

(defpokemon :wobbuffet
  :name "Wobbuffet"
  :introduced-in :gs
  :types [[:psychic]]
  :egggroups [[:indeterminate]]
  :abilities [[:shadow-tag]
              :bw [:shadow-tag :telepathy]]
  :stats [[190 33 58 33 58 33]]
  :weight [28.5]
  :height [1.3])

(deffamily :wynaut :wobbuffet)
