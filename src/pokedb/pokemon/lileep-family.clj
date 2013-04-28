
(defpokemon :lileep
  :name "Lileep"
  :introduced-in :rs
  :types [[:grass :rock]]
  :egggroups [[:water-3]]
  :abilities [[:suction-cups]
              :bw [:storm-drain :suction-cups]]
  :stats [[66 41 77 61 87 23]]
  :weight [23.8]
  :height [1])

(defpokemon :cradily
  :name "Cradily"
  :introduced-in :rs
  :types [[:grass :rock]]
  :egggroups [[:water-3]]
  :abilities [[:suction-cups]
              :bw [:storm-drain :suction-cups]]
  :stats [[86 81 97 81 107 43]]
  :weight [60.4]
  :height [1.5])

(deffamily :lileep :cradily)
