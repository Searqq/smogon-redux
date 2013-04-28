
(defpokemon :shellos
  :name "Shellos"
  :introduced-in :dp
  :types [[:water]]
  :egggroups [[:indeterminate :water-1]]
  :abilities [[:sand-force :sticky-hold :storm-drain]]
  :stats [[76 48 48 57 62 34]]
  :weight [6.3]
  :height [0.3])

(defpokemon :gastrodon
  :name "Gastrodon"
  :introduced-in :dp
  :types [[:ground :water]]
  :egggroups [[:indeterminate :water-1]]
  :abilities [[:sand-force :sticky-hold :storm-drain]]
  :stats [[111 83 68 92 82 39]]
  :weight [29.9]
  :height [0.9])

(deffamily :shellos :gastrodon)
