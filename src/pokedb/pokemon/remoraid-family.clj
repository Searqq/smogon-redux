
(defpokemon :remoraid
  :name "Remoraid"
  :introduced-in :gs
  :types [[:water]]
  :egggroups [[:water-1 :water-2]]
  :abilities [[:hustle]
              :dp [:hustle :sniper]
              :bw [:hustle :moody :sniper]]
  :stats [[35 65 35 65 35 65]]
  :weight [12]
  :height [0.6])

(defpokemon :octillery
  :name "Octillery"
  :introduced-in :gs
  :types [[:water]]
  :egggroups [[:water-1 :water-2]]
  :abilities [[:suction-cups]
              :dp [:sniper :suction-cups]
              :bw [:moody :sniper :suction-cups]]
  :stats [[75 105 75 105 75 45]]
  :weight [28.5]
  :height [0.9])

(deffamily :remoraid :octillery)
