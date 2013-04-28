
(defpokemon :psyduck
  :name "Psyduck"
  :introduced-in :rb
  :types [[:water]]
  :egggroups [[:ground :water-1]]
  :abilities [[:cloud-nine :damp]
              :bw [:cloud-nine :damp :swift-swim]]
  :stats [[50 52 48 50 55]
          :gs [50 52 48 65 50 55]]
  :weight [19.6]
  :height [0.8])

(defpokemon :golduck
  :name "Golduck"
  :introduced-in :rb
  :types [[:water]]
  :egggroups [[:ground :water-1]]
  :abilities [[:cloud-nine :damp]
              :bw [:cloud-nine :damp :swift-swim]]
  :stats [[80 82 78 80 85]
          :gs [80 82 78 95 80 85]]
  :weight [76.6]
  :height [1.7])

(deffamily :psyduck :golduck)
