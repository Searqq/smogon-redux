
(defpokemon :koffing
  :name "Koffing"
  :introduced-in :rb
  :types [[:poison]]
  :egggroups [[:indeterminate]]
  :abilities [[:levitate]
              :bw [:levitate]]
  :stats [[40 65 95 60 35]
          :gs [40 65 95 60 45 35]]
  :weight [1]
  :height [0.6])

(defpokemon :weezing
  :name "Weezing"
  :introduced-in :rb
  :types [[:poison]]
  :egggroups [[:indeterminate]]
  :abilities [[:levitate]
              :bw [:levitate]]
  :stats [[65 90 120 85 60]
          :gs [65 90 120 85 70 60]]
  :weight [9.5]
  :height [1.2])

(deffamily :koffing :weezing)
