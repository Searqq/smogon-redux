
(defpokemon :lotad
  :name "Lotad"
  :introduced-in :rs
  :types [[:grass :water]]
  :egggroups [[:plant :water-1]]
  :abilities [[:rain-dish :swift-swim]
              :bw [:own-tempo :rain-dish :swift-swim]]
  :stats [[40 30 30 40 50 30]]
  :weight [2.6]
  :height [0.5])

(defpokemon :lombre
  :name "Lombre"
  :introduced-in :rs
  :types [[:grass :water]]
  :egggroups [[:plant :water-1]]
  :abilities [[:rain-dish :swift-swim]
              :bw [:own-tempo :rain-dish :swift-swim]]
  :stats [[60 50 50 60 70 50]]
  :weight [32.5]
  :height [1.2])

(defpokemon :ludicolo
  :name "Ludicolo"
  :introduced-in :rs
  :types [[:grass :water]]
  :egggroups [[:plant :water-1]]
  :abilities [[:rain-dish :swift-swim]
              :bw [:own-tempo :rain-dish :swift-swim]]
  :stats [[80 70 70 90 100 70]]
  :weight [55]
  :height [1.5])

(deffamily :lotad :lombre :ludicolo)
