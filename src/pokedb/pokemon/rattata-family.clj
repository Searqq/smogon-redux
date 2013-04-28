
(defpokemon :rattata
  :name "Rattata"
  :introduced-in :rb
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:guts :run-away]
              :bw [:guts :hustle :run-away]]
  :stats [[30 56 35 25 72]
          :gs [30 56 35 25 35 72]]
  :weight [3.5]
  :height [0.3])

(defpokemon :raticate
  :name "Raticate"
  :introduced-in :rb
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:guts :run-away]
              :bw [:guts :hustle :run-away]]
  :stats [[55 81 60 50 97]
          :gs [55 81 60 50 70 97]]
  :weight [18.5]
  :height [0.7])

(deffamily :rattata :raticate)
