
(defpokemon :mudkip
  :name "Mudkip"
  :introduced-in :rs
  :types [[:water]]
  :egggroups [[:monster :water-1]]
  :abilities [[:torrent]
              :bw [:damp :torrent]]
  :stats [[50 70 50 50 50 40]]
  :weight [7.6]
  :height [0.4])

(defpokemon :marshtomp
  :name "Marshtomp"
  :introduced-in :rs
  :types [[:ground :water]]
  :egggroups [[:monster :water-1]]
  :abilities [[:torrent]
              :bw [:damp :torrent]]
  :stats [[70 85 70 60 70 50]]
  :weight [28]
  :height [0.7])

(defpokemon :swampert
  :name "Swampert"
  :introduced-in :rs
  :types [[:ground :water]]
  :egggroups [[:monster :water-1]]
  :abilities [[:torrent]
              :bw [:damp :torrent]]
  :stats [[100 110 90 85 90 60]]
  :weight [81.9]
  :height [1.5])

(deffamily :mudkip :marshtomp :swampert)
