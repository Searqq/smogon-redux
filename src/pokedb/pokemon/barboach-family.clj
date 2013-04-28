
(defpokemon :barboach
  :name "Barboach"
  :introduced-in :rs
  :types [[:ground :water]]
  :egggroups [[:water-2]]
  :abilities [[:oblivious]
              :dp [:anticipation :oblivious]
              :bw [:anticipation :hydration :oblivious]]
  :stats [[50 48 43 46 41 60]]
  :weight [1.9]
  :height [0.4])

(defpokemon :whiscash
  :name "Whiscash"
  :introduced-in :rs
  :types [[:ground :water]]
  :egggroups [[:water-2]]
  :abilities [[:oblivious]
              :dp [:anticipation :oblivious]
              :bw [:anticipation :hydration :oblivious]]
  :stats [[110 78 73 76 71 60]]
  :weight [23.6]
  :height [0.9])

(deffamily :barboach :whiscash)
