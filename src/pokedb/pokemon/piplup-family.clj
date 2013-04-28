
(defpokemon :piplup
  :name "Piplup"
  :introduced-in :dp
  :types [[:water]]
  :egggroups [[:ground :water-1]]
  :abilities [[:defiant :torrent]]
  :stats [[53 51 53 61 56 40]]
  :weight [5.2]
  :height [0.4])

(defpokemon :prinplup
  :name "Prinplup"
  :introduced-in :dp
  :types [[:water]]
  :egggroups [[:ground :water-1]]
  :abilities [[:defiant :torrent]]
  :stats [[64 66 68 81 76 50]]
  :weight [23]
  :height [0.8])

(defpokemon :empoleon
  :name "Empoleon"
  :introduced-in :dp
  :types [[:steel :water]]
  :egggroups [[:ground :water-1]]
  :abilities [[:defiant :torrent]]
  :stats [[84 86 88 111 101 60]]
  :weight [84.5]
  :height [1.7])

(deffamily :piplup :prinplup :empoleon)
