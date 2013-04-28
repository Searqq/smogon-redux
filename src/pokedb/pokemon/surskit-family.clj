
(defpokemon :surskit
  :name "Surskit"
  :introduced-in :rs
  :types [[:bug :water]]
  :egggroups [[:bug :water-1]]
  :abilities [[:swift-swim]
              :bw [:rain-dish :swift-swim]]
  :stats [[40 30 32 50 52 65]]
  :weight [1.7]
  :height [0.5])

(defpokemon :masquerain
  :name "Masquerain"
  :introduced-in :rs
  :types [[:bug :flying]]
  :egggroups [[:bug :water-1]]
  :abilities [[:intimidate]
              :bw [:intimidate :unnerve]]
  :stats [[70 60 62 80 82 60]]
  :weight [3.6]
  :height [0.8])

(deffamily :surskit :masquerain)
