
(defpokemon :shuppet
  :name "Shuppet"
  :introduced-in :rs
  :types [[:ghost]]
  :egggroups [[:indeterminate]]
  :abilities [[:insomnia]
              :dp [:frisk :insomnia]
              :bw [:cursed-body :frisk :insomnia]]
  :stats [[44 75 35 63 33 45]]
  :weight [2.3]
  :height [0.6])

(defpokemon :banette
  :name "Banette"
  :introduced-in :rs
  :types [[:ghost]]
  :egggroups [[:indeterminate]]
  :abilities [[:insomnia]
              :dp [:frisk :insomnia]
              :bw [:cursed-body :frisk :insomnia]]
  :stats [[64 115 65 83 63 65]]
  :weight [12.5]
  :height [1.1])

(deffamily :shuppet :banette)
