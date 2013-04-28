
(defpokemon :tynamo
  :name "Tynamo"
  :introduced-in :bw
  :types [[:electric]]
  :egggroups [[:indeterminate]]
  :abilities [[:levitate]]
  :stats [[35 55 40 45 40 60]]
  :weight [0.3]
  :height [0.2])

(defpokemon :eelektrik
  :name "Eelektrik"
  :introduced-in :bw
  :types [[:electric]]
  :egggroups [[:indeterminate]]
  :abilities [[:levitate]]
  :stats [[65 85 70 75 70 40]]
  :weight [22]
  :height [1.2])

(defpokemon :eelektross
  :name "Eelektross"
  :introduced-in :bw
  :types [[:electric]]
  :egggroups [[:indeterminate]]
  :abilities [[:levitate]]
  :stats [[85 115 80 105 80 50]]
  :weight [80.5]
  :height [2.1])

(deffamily :tynamo :eelektrik :eelektross)
