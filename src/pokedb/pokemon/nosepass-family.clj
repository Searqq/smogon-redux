
(defpokemon :nosepass
  :name "Nosepass"
  :introduced-in :rs
  :types [[:rock]]
  :egggroups [[:mineral]]
  :abilities [[:magnet-pull :sturdy]
              :bw [:magnet-pull :sand-force :sturdy]]
  :stats [[30 45 135 45 90 30]]
  :weight [97]
  :height [1])

(defpokemon :probopass
  :name "Probopass"
  :introduced-in :dp
  :types [[:rock :steel]]
  :egggroups [[:mineral]]
  :abilities [[:magnet-pull :sand-force :sturdy]]
  :stats [[60 55 145 75 150 40]]
  :weight [340]
  :height [1.4])

(deffamily :nosepass :probopass)
