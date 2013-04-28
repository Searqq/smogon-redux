
(defpokemon :carvanha
  :name "Carvanha"
  :introduced-in :rs
  :types [[:dark :water]]
  :egggroups [[:water-2]]
  :abilities [[:rough-skin]
              :bw [:rough-skin :speed-boost]]
  :stats [[45 90 20 65 20 65]]
  :weight [20.8]
  :height [0.8])

(defpokemon :sharpedo
  :name "Sharpedo"
  :introduced-in :rs
  :types [[:dark :water]]
  :egggroups [[:water-2]]
  :abilities [[:rough-skin]
              :bw [:rough-skin :speed-boost]]
  :stats [[70 120 40 95 40 95]]
  :weight [88.8]
  :height [1.8])

(deffamily :carvanha :sharpedo)
