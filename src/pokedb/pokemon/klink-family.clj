
(defpokemon :klink
  :name "Klink"
  :introduced-in :bw
  :types [[:steel]]
  :egggroups [[:mineral]]
  :abilities [[:clear-body :minus :plus]]
  :stats [[40 55 70 45 60 30]]
  :weight [21]
  :height [0.3])

(defpokemon :klang
  :name "Klang"
  :introduced-in :bw
  :types [[:steel]]
  :egggroups [[:mineral]]
  :abilities [[:clear-body :minus :plus]]
  :stats [[60 80 95 70 85 50]]
  :weight [51]
  :height [0.6])

(defpokemon :klinklang
  :name "Klinklang"
  :introduced-in :bw
  :types [[:steel]]
  :egggroups [[:mineral]]
  :abilities [[:clear-body :minus :plus]]
  :stats [[60 100 115 70 85 90]]
  :weight [81]
  :height [0.6])

(deffamily :klink :klang :klinklang)
