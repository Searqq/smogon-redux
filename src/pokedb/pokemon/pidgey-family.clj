
(defpokemon :pidgey
  :name "Pidgey"
  :introduced-in :rb
  :types [[:flying :normal]]
  :egggroups [[:flying]]
  :abilities [[:keen-eye]
              :dp [:keen-eye :tangled-feet]
              :bw [:big-pecks :keen-eye :tangled-feet]]
  :stats [[40 45 40 35 56]
          :gs [40 45 40 35 35 56]]
  :weight [1.8]
  :height [0.3])

(defpokemon :pidgeotto
  :name "Pidgeotto"
  :introduced-in :rb
  :types [[:flying :normal]]
  :egggroups [[:flying]]
  :abilities [[:keen-eye]
              :dp [:keen-eye :tangled-feet]
              :bw [:big-pecks :keen-eye :tangled-feet]]
  :stats [[63 60 55 50 71]
          :gs [63 60 55 50 50 71]]
  :weight [30]
  :height [1.1])

(defpokemon :pidgeot
  :name "Pidgeot"
  :introduced-in :rb
  :types [[:flying :normal]]
  :egggroups [[:flying]]
  :abilities [[:keen-eye]
              :dp [:keen-eye :tangled-feet]
              :bw [:big-pecks :keen-eye :tangled-feet]]
  :stats [[83 80 75 70 91]
          :gs [83 80 75 70 70 91]]
  :weight [39.5]
  :height [1.5])

(deffamily :pidgey :pidgeotto :pidgeot)
