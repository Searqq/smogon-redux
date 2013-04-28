
(defpokemon :makuhita
  :name "Makuhita"
  :introduced-in :rs
  :types [[:fighting]]
  :egggroups [[:humanshape]]
  :abilities [[:guts :thick-fat]
              :bw [:guts :sheer-force :thick-fat]]
  :stats [[72 60 30 20 30 25]]
  :weight [86.4]
  :height [1])

(defpokemon :hariyama
  :name "Hariyama"
  :introduced-in :rs
  :types [[:fighting]]
  :egggroups [[:humanshape]]
  :abilities [[:guts :thick-fat]
              :bw [:guts :sheer-force :thick-fat]]
  :stats [[144 120 60 40 60 50]]
  :weight [253.8]
  :height [2.3])

(deffamily :makuhita :hariyama)
