
(defpokemon :krabby
  :name "Krabby"
  :introduced-in :rb
  :types [[:water]]
  :egggroups [[:water-3]]
  :abilities [[:hyper-cutter :shell-armor]
              :bw [:hyper-cutter :sheer-force :shell-armor]]
  :stats [[30 105 90 25 50]
          :gs [30 105 90 25 25 50]]
  :weight [6.5]
  :height [0.4])

(defpokemon :kingler
  :name "Kingler"
  :introduced-in :rb
  :types [[:water]]
  :egggroups [[:water-3]]
  :abilities [[:hyper-cutter :shell-armor]
              :bw [:hyper-cutter :sheer-force :shell-armor]]
  :stats [[55 130 115 50 75]
          :gs [55 130 115 50 50 75]]
  :weight [60]
  :height [1.3])

(deffamily :krabby :kingler)
