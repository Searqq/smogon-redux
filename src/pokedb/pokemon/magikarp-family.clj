
(defpokemon :magikarp
  :name "Magikarp"
  :introduced-in :rb
  :types [[:water]]
  :egggroups [[:dragon :water-2]]
  :abilities [[:swift-swim]
              :bw [:rattled :swift-swim]]
  :stats [[20 10 55 20 80]
          :gs [20 10 55 15 20 80]]
  :weight [10]
  :height [0.9])

(defpokemon :gyarados
  :name "Gyarados"
  :introduced-in :rb
  :types [[:flying :water]]
  :egggroups [[:dragon :water-2]]
  :abilities [[:intimidate]
              :bw [:intimidate :moxie]]
  :stats [[95 125 79 100 81]
          :gs [95 125 79 60 100 81]]
  :weight [235]
  :height [6.5])

(deffamily :magikarp :gyarados)
