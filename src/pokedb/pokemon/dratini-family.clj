
(defpokemon :dratini
  :name "Dratini"
  :introduced-in :rb
  :types [[:dragon]]
  :egggroups [[:dragon :water-1]]
  :abilities [[:shed-skin]
              :bw [:marvel-scale :shed-skin]]
  :stats [[41 64 45 50 50]
          :gs [41 64 45 50 50 50]]
  :weight [3.3]
  :height [1.8])

(defpokemon :dragonair
  :name "Dragonair"
  :introduced-in :rb
  :types [[:dragon]]
  :egggroups [[:dragon :water-1]]
  :abilities [[:shed-skin]
              :bw [:marvel-scale :shed-skin]]
  :stats [[61 84 65 70 70]
          :gs [61 84 65 70 70 70]]
  :weight [16.5]
  :height [4])

(defpokemon :dragonite
  :name "Dragonite"
  :introduced-in :rb
  :types [[:dragon :flying]]
  :egggroups [[:dragon :water-1]]
  :abilities [[:inner-focus]
              :bw [:inner-focus :multiscale]]
  :stats [[91 134 95 100 80]
          :gs [91 134 95 100 100 80]]
  :weight [210]
  :height [2.2])

(deffamily :dratini :dragonair :dragonite)
