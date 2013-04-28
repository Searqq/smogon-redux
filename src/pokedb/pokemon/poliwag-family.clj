
(defpokemon :poliwag
  :name "Poliwag"
  :introduced-in :rb
  :types [[:water]]
  :egggroups [[:water-1]]
  :abilities [[:damp :water-absorb]
              :bw [:damp :swift-swim :water-absorb]]
  :stats [[40 50 40 40 90]
          :gs [40 50 40 40 40 90]]
  :weight [12.4]
  :height [0.6])

(defpokemon :poliwhirl
  :name "Poliwhirl"
  :introduced-in :rb
  :types [[:water]]
  :egggroups [[:water-1]]
  :abilities [[:damp :water-absorb]
              :bw [:damp :swift-swim :water-absorb]]
  :stats [[65 65 65 50 90]
          :gs [65 65 65 50 50 90]]
  :weight [20]
  :height [1])

(defpokemon :poliwrath
  :name "Poliwrath"
  :introduced-in :rb
  :types [[:fighting :water]]
  :egggroups [[:water-1]]
  :abilities [[:damp :water-absorb]
              :bw [:damp :swift-swim :water-absorb]]
  :stats [[90 85 95 70 70]
          :gs [90 85 95 70 90 70]]
  :weight [54]
  :height [1.3])

(defpokemon :politoed
  :name "Politoed"
  :introduced-in :gs
  :types [[:water]]
  :egggroups [[:water-1]]
  :abilities [[:damp :water-absorb]
              :bw [:damp :drizzle :water-absorb]]
  :stats [[90 75 75 90 100 70]]
  :weight [33.9]
  :height [1.1])

(deffamily :poliwag :poliwhirl [:poliwrath :politoed])
