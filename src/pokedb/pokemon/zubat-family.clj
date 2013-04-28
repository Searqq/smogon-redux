
(defpokemon :zubat
  :name "Zubat"
  :introduced-in :rb
  :types [[:flying :poison]]
  :egggroups [[:flying]]
  :abilities [[:inner-focus]
              :bw [:infiltrator :inner-focus]]
  :stats [[40 45 35 40 55]
          :gs [40 45 35 30 40 55]]
  :weight [7.5]
  :height [0.8])

(defpokemon :golbat
  :name "Golbat"
  :introduced-in :rb
  :types [[:flying :poison]]
  :egggroups [[:flying]]
  :abilities [[:inner-focus]
              :bw [:infiltrator :inner-focus]]
  :stats [[75 80 70 75 90]
          :gs [75 80 70 65 75 90]]
  :weight [55]
  :height [1.6])

(defpokemon :crobat
  :name "Crobat"
  :introduced-in :gs
  :types [[:flying :poison]]
  :egggroups [[:flying]]
  :abilities [[:inner-focus]
              :bw [:infiltrator :inner-focus]]
  :stats [[85 90 80 70 80 130]]
  :weight [75]
  :height [1.8])

(deffamily :zubat :golbat :crobat)
