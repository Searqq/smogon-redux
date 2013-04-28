
(defpokemon :togepi
  :name "Togepi"
  :introduced-in :gs
  :types [[:normal]]
  :egggroups [[]]
  :abilities [[:hustle :serene-grace]
              :bw [:hustle :serene-grace :super-luck]]
  :stats [[35 20 65 40 65 20]]
  :weight [1.5]
  :height [0.3])

(defpokemon :togetic
  :name "Togetic"
  :introduced-in :gs
  :types [[:flying :normal]]
  :egggroups [[:fairy :flying]]
  :abilities [[:hustle :serene-grace]
              :bw [:hustle :serene-grace :super-luck]]
  :stats [[55 40 85 80 105 40]]
  :weight [3.2]
  :height [0.6])

(defpokemon :togekiss
  :name "Togekiss"
  :introduced-in :dp
  :types [[:flying :normal]]
  :egggroups [[:fairy :flying]]
  :abilities [[:hustle :serene-grace :super-luck]]
  :stats [[85 50 95 120 115 80]]
  :weight [38]
  :height [1.5])

(deffamily :togepi :togetic :togekiss)
