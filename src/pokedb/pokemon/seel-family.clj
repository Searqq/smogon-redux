
(defpokemon :seel
  :name "Seel"
  :introduced-in :rb
  :types [[:water]]
  :egggroups [[:ground :water-1]]
  :abilities [[:thick-fat]
              :dp [:hydration :thick-fat]
              :bw [:hydration :ice-body :thick-fat]]
  :stats [[65 45 55 70 45]
          :gs [65 45 55 45 70 45]]
  :weight [90]
  :height [1.1])

(defpokemon :dewgong
  :name "Dewgong"
  :introduced-in :rb
  :types [[:ice :water]]
  :egggroups [[:ground :water-1]]
  :abilities [[:thick-fat]
              :dp [:hydration :thick-fat]
              :bw [:hydration :ice-body :thick-fat]]
  :stats [[90 70 80 95 70]
          :gs [90 70 80 70 95 70]]
  :weight [120]
  :height [1.7])

(deffamily :seel :dewgong)
