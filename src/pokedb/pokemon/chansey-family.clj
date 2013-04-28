
(defpokemon :happiny
  :name "Happiny"
  :introduced-in :dp
  :types [[:normal]]
  :egggroups [[]]
  :abilities [[:friend-guard :natural-cure :serene-grace]]
  :stats [[100 5 5 15 65 30]]
  :weight [24.4]
  :height [0.6])

(defpokemon :chansey
  :name "Chansey"
  :introduced-in :rb
  :types [[:normal]]
  :egggroups [[:fairy]]
  :abilities [[:natural-cure :serene-grace]
              :bw [:healer :natural-cure :serene-grace]]
  :stats [[250 5 5 105 50]
          :gs [250 5 5 35 105 50]]
  :weight [34.6]
  :height [1.1])

(defpokemon :blissey
  :name "Blissey"
  :introduced-in :gs
  :types [[:normal]]
  :egggroups [[:fairy]]
  :abilities [[:natural-cure :serene-grace]
              :bw [:healer :natural-cure :serene-grace]]
  :stats [[255 10 10 75 135 55]]
  :weight [46.8]
  :height [1.5])

(deffamily :happiny :chansey :blissey)
