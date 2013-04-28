
(defpokemon :groudon
  :name "Groudon"
  :introduced-in :rs
  :types [[:ground]]
  :egggroups [[]]
  :abilities [[:drought]
              :bw [:drought]]
  :stats [[100 150 140 100 90 90]]
  :weight [950]
  :height [3.5])

(defpokemon :kyogre
  :name "Kyogre"
  :introduced-in :rs
  :types [[:water]]
  :egggroups [[]]
  :abilities [[:drizzle]
              :bw [:drizzle]]
  :stats [[100 100 90 150 140 90]]
  :weight [352]
  :height [4.5])

(defpokemon :rayquaza
  :name "Rayquaza"
  :introduced-in :rs
  :types [[:dragon :flying]]
  :egggroups [[]]
  :abilities [[:air-lock]
              :bw [:air-lock]]
  :stats [[105 150 90 150 90 95]]
  :weight [206.5]
  :height [7])

(deffamily :rayquaza)
(deffamily :groudon)
(deffamily :kyogre)
