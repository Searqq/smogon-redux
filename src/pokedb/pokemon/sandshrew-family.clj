
(defpokemon :sandshrew
  :name "Sandshrew"
  :introduced-in :rb
  :types [[:ground]]
  :egggroups [[:ground]]
  :abilities [[:sand-veil]
              :bw [:sand-rush :sand-veil]]
  :stats [[50 75 85 30 40]
          :gs [50 75 85 20 30 40]]
  :weight [12]
  :height [0.6])

(defpokemon :sandslash
  :name "Sandslash"
  :introduced-in :rb
  :types [[:ground]]
  :egggroups [[:ground]]
  :abilities [[:sand-veil]
              :bw [:sand-rush :sand-veil]]
  :stats [[75 100 110 55 65]
          :gs [75 100 110 45 55 65]]
  :weight [29.5]
  :height [1])

(deffamily :sandshrew :sandslash)
