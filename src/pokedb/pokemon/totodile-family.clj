
(defpokemon :totodile
  :name "Totodile"
  :introduced-in :gs
  :types [[:water]]
  :egggroups [[:monster :water-1]]
  :abilities [[:torrent]
              :bw [:sheer-force :torrent]]
  :stats [[50 65 64 44 48 43]]
  :weight [9.5]
  :height [0.6])

(defpokemon :croconaw
  :name "Croconaw"
  :introduced-in :gs
  :types [[:water]]
  :egggroups [[:monster :water-1]]
  :abilities [[:torrent]
              :bw [:sheer-force :torrent]]
  :stats [[65 80 80 59 63 58]]
  :weight [25]
  :height [1.1])

(defpokemon :feraligatr
  :name "Feraligatr"
  :introduced-in :gs
  :types [[:water]]
  :egggroups [[:monster :water-1]]
  :abilities [[:torrent]
              :bw [:sheer-force :torrent]]
  :stats [[85 105 100 79 83 78]]
  :weight [88.8]
  :height [2.3])

(deffamily :totodile :croconaw :feraligatr)
