
(defpokemon :elekid
  :name "Elekid"
  :introduced-in :gs
  :types [[:electric]]
  :egggroups [[]]
  :abilities [[:static]
              :bw [:static :vital-spirit]]
  :stats [[45 63 37 65 55 95]]
  :weight [23.5]
  :height [0.6])

(defpokemon :electabuzz
  :name "Electabuzz"
  :introduced-in :rb
  :types [[:electric]]
  :egggroups [[:humanshape]]
  :abilities [[:static]
              :bw [:static :vital-spirit]]
  :stats [[65 83 57 85 105]
          :gs [65 83 57 95 85 105]]
  :weight [30]
  :height [1.1])

(defpokemon :electivire
  :name "Electivire"
  :introduced-in :dp
  :types [[:electric]]
  :egggroups [[:humanshape]]
  :abilities [[:motor-drive :vital-spirit]]
  :stats [[75 123 67 95 85 95]]
  :weight [138.6]
  :height [1.8])

(deffamily :elekid :electabuzz :electivire)
