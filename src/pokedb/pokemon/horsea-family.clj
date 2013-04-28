
(defpokemon :horsea
  :name "Horsea"
  :introduced-in :rb
  :types [[:water]]
  :egggroups [[:dragon :water-1]]
  :abilities [[:swift-swim]
              :dp [:sniper :swift-swim]
              :bw [:damp :sniper :swift-swim]]
  :stats [[30 40 70 70 60]
          :gs [30 40 70 70 25 60]]
  :weight [8]
  :height [0.4])

(defpokemon :seadra
  :name "Seadra"
  :introduced-in :rb
  :types [[:water]]
  :egggroups [[:dragon :water-1]]
  :abilities [[:poison-point]
              :dp [:poison-point :sniper]
              :bw [:damp :poison-point :sniper]]
  :stats [[55 65 95 95 85]
          :gs [55 65 95 95 45 85]]
  :weight [25]
  :height [1.2])

(defpokemon :kingdra
  :name "Kingdra"
  :introduced-in :gs
  :types [[:dragon :water]]
  :egggroups [[:dragon :water-1]]
  :abilities [[:swift-swim]
              :dp [:sniper :swift-swim]
              :bw [:damp :sniper :swift-swim]]
  :stats [[75 95 95 95 95 85]]
  :weight [152]
  :height [1.8])

(deffamily :horsea :seadra :kingdra)
