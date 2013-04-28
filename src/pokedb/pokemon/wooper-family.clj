
(defpokemon :wooper
  :name "Wooper"
  :introduced-in :gs
  :types [[:ground :water]]
  :egggroups [[:ground :water-1]]
  :abilities [[:damp :water-absorb]
              :bw [:damp :unaware :water-absorb]]
  :stats [[55 45 45 25 25 15]]
  :weight [8.5]
  :height [0.4])

(defpokemon :quagsire
  :name "Quagsire"
  :introduced-in :gs
  :types [[:ground :water]]
  :egggroups [[:ground :water-1]]
  :abilities [[:damp :water-absorb]
              :bw [:damp :unaware :water-absorb]]
  :stats [[95 85 85 65 65 35]]
  :weight [75]
  :height [1.4])

(deffamily :wooper :quagsire)
