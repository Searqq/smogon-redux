
(defpokemon :tyrogue
  :name "Tyrogue"
  :introduced-in :gs
  :types [[:fighting]]
  :egggroups [[]]
  :abilities [[:guts]
              :dp [:guts :steadfast]
              :bw [:guts :steadfast :vital-spirit]]
  :stats [[35 35 35 35 35 35]]
  :weight [21]
  :height [0.7])

(defpokemon :hitmonchan
  :name "Hitmonchan"
  :introduced-in :rb
  :types [[:fighting]]
  :egggroups [[:humanshape]]
  :abilities [[:keen-eye]
              :dp [:iron-fist :keen-eye]
              :bw [:inner-focus :iron-fist :keen-eye]]
  :stats [[50 105 79 35 76]
          :gs [50 105 79 35 110 76]]
  :weight [50.2]
  :height [1.4])

(defpokemon :hitmonlee
  :name "Hitmonlee"
  :introduced-in :rb
  :types [[:fighting]]
  :egggroups [[:humanshape]]
  :abilities [[:limber]
              :dp [:limber :reckless]
              :bw [:limber :reckless :unburden]]
  :stats [[50 120 53 35 87]
          :gs [50 120 53 35 110 87]]
  :weight [49.8]
  :height [1.5])

(defpokemon :hitmontop
  :name "Hitmontop"
  :introduced-in :gs
  :types [[:fighting]]
  :egggroups [[:humanshape]]
  :abilities [[:intimidate]
              :dp [:intimidate :technician]
              :bw [:intimidate :steadfast :technician]]
  :stats [[50 95 95 35 110 70]]
  :weight [48]
  :height [1.4])

(deffamily :tyrogue [:hitmonlee :hitmonchan :hitmontop])
