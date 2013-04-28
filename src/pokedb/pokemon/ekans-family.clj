
(defpokemon :ekans
  :name "Ekans"
  :introduced-in :rb
  :types [[:poison]]
  :egggroups [[:dragon :ground]]
  :abilities [[:intimidate :shed-skin]
              :bw [:intimidate :shed-skin :unnerve]]
  :stats [[35 60 44 40 55]
          :gs [35 60 44 40 54 55]]
  :weight [6.9]
  :height [2])

(defpokemon :arbok
  :name "Arbok"
  :introduced-in :rb
  :types [[:poison]]
  :egggroups [[:dragon :ground]]
  :abilities [[:intimidate :shed-skin]
              :bw [:intimidate :shed-skin :unnerve]]
  :stats [[60 85 69 65 80]
          :gs [60 85 69 65 79 80]]
  :weight [65]
  :height [3.5])

(deffamily :ekans :arbok)
