
(defpokemon :pichu
  :name "Pichu"
  :introduced-in :gs
  :types [[:electric]]
  :egggroups [[]]
  :abilities [[:static]
              :bw [:lightningrod :static]]
  :stats [[20 40 15 35 35 60]]
  :weight [2]
  :height [0.3])

(defpokemon :pikachu
  :name "Pikachu"
  :introduced-in :rb
  :types [[:electric]]
  :egggroups [[:fairy :ground]]
  :abilities [[:static]
              :bw [:lightningrod :static]]
  :stats [[35 55 30 50 90]
          :gs [35 55 30 50 40 90]]
  :weight [6]
  :height [0.4])

(defpokemon :raichu
  :name "Raichu"
  :introduced-in :rb
  :types [[:electric]]
  :egggroups [[:fairy :ground]]
  :abilities [[:static]
              :bw [:lightningrod :static]]
  :stats [[60 90 55 90 100]
          :gs [60 90 55 90 80 100]]
  :weight [30]
  :height [0.8])

(deffamily :pichu :pikachu :raichu)
