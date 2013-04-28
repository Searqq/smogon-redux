
(defpokemon :slowpoke
  :name "Slowpoke"
  :introduced-in :rb
  :types [[:psychic :water]]
  :egggroups [[:monster :water-1]]
  :abilities [[:oblivious :own-tempo]
              :bw [:oblivious :own-tempo :regenerator]]
  :stats [[90 65 65 40 15]
          :gs [90 65 65 40 40 15]]
  :weight [36]
  :height [1.2])

(defpokemon :slowbro
  :name "Slowbro"
  :introduced-in :rb
  :types [[:psychic :water]]
  :egggroups [[:monster :water-1]]
  :abilities [[:oblivious :own-tempo]
              :bw [:oblivious :own-tempo :regenerator]]
  :stats [[95 75 110 80 30]
          :gs [95 75 110 100 80 30]]
  :weight [78.5]
  :height [1.6])

(defpokemon :slowking
  :name "Slowking"
  :introduced-in :gs
  :types [[:psychic :water]]
  :egggroups [[:monster :water-1]]
  :abilities [[:oblivious :own-tempo]
              :bw [:oblivious :own-tempo :regenerator]]
  :stats [[95 75 80 100 110 30]]
  :weight [79.5]
  :height [2])

(deffamily :slowpoke [:slowbro :slowking])
