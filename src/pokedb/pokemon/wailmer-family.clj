
(defpokemon :wailmer
  :name "Wailmer"
  :introduced-in :rs
  :types [[:water]]
  :egggroups [[:ground :water-2]]
  :abilities [[:oblivious :water-veil]
              :bw [:oblivious :pressure :water-veil]]
  :stats [[130 70 35 70 35 60]]
  :weight [130]
  :height [2])

(defpokemon :wailord
  :name "Wailord"
  :introduced-in :rs
  :types [[:water]]
  :egggroups [[:ground :water-2]]
  :abilities [[:oblivious :water-veil]
              :bw [:oblivious :pressure :water-veil]]
  :stats [[170 90 45 90 45 60]]
  :weight [398]
  :height [14.5])

(deffamily :wailmer :wailord)
