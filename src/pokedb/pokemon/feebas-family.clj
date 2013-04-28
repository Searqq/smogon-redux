
(defpokemon :feebas
  :name "Feebas"
  :introduced-in :rs
  :types [[:water]]
  :egggroups [[:dragon :water-1]]
  :abilities [[:swift-swim]
              :bw [:adaptability :swift-swim]]
  :stats [[20 15 20 10 55 80]]
  :weight [7.4]
  :height [0.6])

(defpokemon :milotic
  :name "Milotic"
  :introduced-in :rs
  :types [[:water]]
  :egggroups [[:dragon :water-1]]
  :abilities [[:marvel-scale]
              :bw [:cute-charm :marvel-scale]]
  :stats [[95 60 79 100 125 81]]
  :weight [162]
  :height [6.2])

(deffamily :feebas :milotic)
