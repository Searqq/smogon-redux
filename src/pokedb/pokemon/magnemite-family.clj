
(defpokemon :magnemite
  :name "Magnemite"
  :introduced-in :rb
  :types [[:electric :steel]]
  :egggroups [[:mineral]]
  :abilities [[:magnet-pull :sturdy]
              :bw [:analytic :magnet-pull :sturdy]]
  :stats [[25 35 70 95 45]
          :gs [25 35 70 95 55 45]]
  :weight [6]
  :height [0.3])

(defpokemon :magneton
  :name "Magneton"
  :introduced-in :rb
  :types [[:electric :steel]]
  :egggroups [[:mineral]]
  :abilities [[:magnet-pull :sturdy]
              :bw [:analytic :magnet-pull :sturdy]]
  :stats [[50 60 95 120 70]
          :gs [50 60 95 120 70 70]]
  :weight [60]
  :height [1])

(defpokemon :magnezone
  :name "Magnezone"
  :introduced-in :dp
  :types [[:electric :steel]]
  :egggroups [[:mineral]]
  :abilities [[:analytic :magnet-pull :sturdy]]
  :stats [[70 70 115 130 90 60]]
  :weight [180]
  :height [1.2])

(deffamily :magnemite :magneton :magnezone)
