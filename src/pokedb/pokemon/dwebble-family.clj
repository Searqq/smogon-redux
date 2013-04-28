
(defpokemon :dwebble
  :name "Dwebble"
  :introduced-in :bw
  :types [[:bug :rock]]
  :egggroups [[:bug :mineral]]
  :abilities [[:shell-armor :sturdy :weak-armor]]
  :stats [[50 65 85 35 35 55]]
  :weight [14.5]
  :height [0.3])

(defpokemon :crustle
  :name "Crustle"
  :introduced-in :bw
  :types [[:bug :rock]]
  :egggroups [[:bug :mineral]]
  :abilities [[:shell-armor :sturdy :weak-armor]]
  :stats [[70 95 125 65 75 45]]
  :weight [200]
  :height [1.4])

(deffamily :dwebble :crustle)
