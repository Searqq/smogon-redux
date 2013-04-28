
(defpokemon :clamperl
  :name "Clamperl"
  :introduced-in :rs
  :types [[:water]]
  :egggroups [[:water-1]]
  :abilities [[:shell-armor]
              :bw [:rattled :shell-armor]]
  :stats [[35 64 85 74 55 32]]
  :weight [52.5]
  :height [0.4])

(defpokemon :huntail
  :name "Huntail"
  :introduced-in :rs
  :types [[:water]]
  :egggroups [[:water-1]]
  :abilities [[:swift-swim]
              :bw [:swift-swim :water-veil]]
  :stats [[55 104 105 94 75 52]]
  :weight [27]
  :height [1.7])

(defpokemon :gorebyss
  :name "Gorebyss"
  :introduced-in :rs
  :types [[:water]]
  :egggroups [[:water-1]]
  :abilities [[:swift-swim]
              :bw [:hydration :swift-swim]]
  :stats [[55 84 105 114 75 52]]
  :weight [22.6]
  :height [1.8])

(deffamily :clamperl [:huntail :gorebyss])
