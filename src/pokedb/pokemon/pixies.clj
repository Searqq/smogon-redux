
(defpokemon :mew
  :name "Mew"
  :introduced-in :rb
  :types [[:psychic]]
  :egggroups [[]]
  :abilities [[:synchronize]
              :bw [:synchronize]]
  :stats [[100 100 100 100 100]
          :gs [100 100 100 100 100 100]]
  :weight [4]
  :height [0.4])

(defpokemon :celebi
  :name "Celebi"
  :introduced-in :gs
  :types [[:grass :psychic]]
  :egggroups [[]]
  :abilities [[:natural-cure]
              :bw [:natural-cure]]
  :stats [[100 100 100 100 100 100]]
  :weight [5]
  :height [0.6])

(defpokemon :jirachi
  :name "Jirachi"
  :introduced-in :rs
  :types [[:psychic :steel]]
  :egggroups [[]]
  :abilities [[:serene-grace]
              :bw [:serene-grace]]
  :stats [[100 100 100 100 100 100]]
  :weight [1.1]
  :height [0.3])

(defpokemon :phione
  :name "Phione"
  :introduced-in :dp
  :types [[:water]]
  :egggroups [[:fairy :water-1]]
  :abilities [[:hydration]]
  :stats [[80 80 80 80 80 80]]
  :weight [3.1]
  :height [0.4])

(defpokemon :manaphy
  :name "Manaphy"
  :introduced-in :dp
  :types [[:water]]
  :egggroups [[:fairy :water-1]]
  :abilities [[:hydration]]
  :stats [[100 100 100 100 100 100]]
  :weight [1.4]
  :height [0.3])

(defpokemon :shaymin
  :name "Shaymin"
  :introduced-in :dp
  :types [[:grass]]
  :egggroups [[]]
  :abilities [[:natural-cure]]
  :stats [[100 100 100 100 100 100]]
  :weight [2.1]
  :height [0.2])

(defpokemon :shaymin-s
  :name "Shaymin-Sky"
  :introduced-in :dp
  :types [[:flying :grass]]
  :egggroups [[]]
  :abilities [[:serene-grace]]
  :stats [[100 103 75 120 75 127]]
  :weight [5.2]
  :height [0.4])

(defpokemon :victini
  :name "Victini"
  :introduced-in :bw
  :types [[:fire :psychic]]
  :egggroups [[]]
  :abilities [[:victory-star]]
  :stats [[100 100 100 100 100 100]]
  :weight [4]
  :height [0.4])

(deffamily :victini)
(deffamily :manaphy)
(deffamily :phione)
(deffamily :shaymin [:shaymin-s])
(deffamily :jirachi)
(deffamily :celebi)
(deffamily :mew)
