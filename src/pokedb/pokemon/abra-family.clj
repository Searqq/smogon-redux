
(defpokemon :abra
  :name "Abra"
  :introduced-in :rb
  :types [[:psychic]]
  :egggroups [[:humanshape]]
  :abilities [[:inner-focus :synchronize]
              :bw [:inner-focus :magic-guard :synchronize]]
  :stats [[25 20 15 105 90]
          :gs [25 20 15 105 55 90]]
  :weight [19.5]
  :height [0.9])

(defpokemon :kadabra
  :name "Kadabra"
  :introduced-in :rb
  :types [[:psychic]]
  :egggroups [[:humanshape]]
  :abilities [[:inner-focus :synchronize]
              :bw [:inner-focus :magic-guard :synchronize]]
  :stats [[40 35 30 120 105]
          :gs [40 35 30 120 70 105]]
  :weight [56.5]
  :height [1.3])

(defpokemon :alakazam
  :name "Alakazam"
  :introduced-in :rb
  :types [[:psychic]]
  :egggroups [[:humanshape]]
  :abilities [[:inner-focus :synchronize]
              :bw [:inner-focus :magic-guard :synchronize]]
  :stats [[55 50 45 135 120]
          :gs [55 50 45 135 85 120]]
  :weight [48]
  :height [1.5])

(deffamily :abra :kadabra :alakazam)
