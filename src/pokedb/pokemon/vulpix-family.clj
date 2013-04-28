
(defpokemon :vulpix
  :name "Vulpix"
  :introduced-in :rb
  :types [[:fire]]
  :egggroups [[:ground]]
  :abilities [[:flash-fire]
              :bw [:drought :flash-fire]]
  :stats [[38 41 40 65 65]
          :gs [38 41 40 50 65 65]]
  :weight [9.9]
  :height [0.6])

(defpokemon :ninetales
  :name "Ninetales"
  :introduced-in :rb
  :types [[:fire]]
  :egggroups [[:ground]]
  :abilities [[:flash-fire]
              :bw [:drought :flash-fire]]
  :stats [[73 76 75 100 100]
          :gs [73 76 75 81 100 100]]
  :weight [19.9]
  :height [1.1])

(deffamily :vulpix :ninetales)
