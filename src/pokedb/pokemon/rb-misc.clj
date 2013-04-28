
(defpokemon :aerodactyl
  :name "Aerodactyl"
  :introduced-in :rb
  :types [[:flying :rock]]
  :egggroups [[:flying]]
  :abilities [[:pressure :rock-head]
              :bw [:pressure :rock-head :unnerve]]
  :stats [[80 105 65 60 130]
          :gs [80 105 65 60 75 130]]
  :weight [59]
  :height [1.8])

(defpokemon :ditto
  :name "Ditto"
  :introduced-in :rb
  :types [[:normal]]
  :egggroups [[:ditto]]
  :abilities [[:limber]
              :bw [:imposter :limber]]
  :stats [[48 48 48 48 48]
          :gs [48 48 48 48 48 48]]
  :weight [4]
  :height [0.3])

(defpokemon :farfetchd
  :name "Farfetch'd"
  :introduced-in :rb
  :types [[:flying :normal]]
  :egggroups [[:flying :ground]]
  :abilities [[:inner-focus :keen-eye]
              :bw [:defiant :inner-focus :keen-eye]]
  :stats [[52 65 55 58 60]
          :gs [52 65 55 58 62 60]]
  :weight [15]
  :height [0.8])

(defpokemon :kangaskhan
  :name "Kangaskhan"
  :introduced-in :rb
  :types [[:normal]]
  :egggroups [[:monster]]
  :abilities [[:early-bird]
              :dp [:early-bird :scrappy]
              :bw [:early-bird :inner-focus :scrappy]]
  :stats [[105 95 80 40 90]
          :gs [105 95 80 40 80 90]]
  :weight [80]
  :height [2.2])

(defpokemon :lapras
  :name "Lapras"
  :introduced-in :rb
  :types [[:ice :water]]
  :egggroups [[:monster :water-1]]
  :abilities [[:shell-armor :water-absorb]
              :bw [:hydration :shell-armor :water-absorb]]
  :stats [[130 85 80 95 60]
          :gs [130 85 80 85 95 60]]
  :weight [220]
  :height [2.5])

(defpokemon :pinsir
  :name "Pinsir"
  :introduced-in :rb
  :types [[:bug]]
  :egggroups [[:bug]]
  :abilities [[:hyper-cutter]
              :dp [:hyper-cutter :mold-breaker]
              :bw [:hyper-cutter :mold-breaker :moxie]]
  :stats [[65 125 100 55 85]
          :gs [65 125 100 55 70 85]]
  :weight [55]
  :height [1.5])

(defpokemon :tauros
  :name "Tauros"
  :introduced-in :rb
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:intimidate]
              :dp [:anger-point :intimidate]
              :bw [:anger-point :intimidate :sheer-force]]
  :stats [[75 100 95 70 110]
          :gs [75 100 95 40 70 110]]
  :weight [88.4]
  :height [1.4])

;; lol sorry mewtwo

(defpokemon :mewtwo
  :name "Mewtwo"
  :introduced-in :rb
  :types [[:psychic]]
  :egggroups [[]]
  :abilities [[:pressure]
              :bw [:pressure :unnerve]]
  :stats [[106 110 90 154 130]
          :gs [106 110 90 154 90 130]]
  :weight [122]
  :height [2])

(deffamily :aerodactyl)
(deffamily :ditto)
(deffamily :farfetchd)
(deffamily :kangaskhan)
(deffamily :lapras)
(deffamily :mewtwo)
(deffamily :pinsir)
(deffamily :tauros)
