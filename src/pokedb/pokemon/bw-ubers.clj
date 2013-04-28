
(defpokemon :reshiram
  :name "Reshiram"
  :introduced-in :bw
  :types [[:dragon :fire]]
  :egggroups [[]]
  :abilities [[:turboblaze]]
  :stats [[100 120 100 150 120 90]]
  :weight [330]
  :height [3.2])

(defpokemon :zekrom
  :name "Zekrom"
  :introduced-in :bw
  :types [[:dragon :electric]]
  :egggroups [[]]
  :abilities [[:teravolt]]
  :stats [[100 150 120 120 100 90]]
  :weight [345]
  :height [2.9])

(defpokemon :kyurem
  :name "Kyurem"
  :introduced-in :bw
  :types [[:dragon :ice]]
  :egggroups [[]]
  :abilities [[:pressure]]
  :stats [[125 130 90 130 90 95]]
  :weight [325]
  :height [3])

(defpokemon :kyurem-b
  :name "Kyurem-Black"
  :introduced-in :bw
  :types [[:dragon :ice]]
  :egggroups [[]]
  :abilities [[:teravolt]]
  :stats [[125 170 100 120 90 95]]
  :weight [325]
  :height [3.3])

(defpokemon :kyurem-w
  :name "Kyurem-White"
  :introduced-in :bw
  :types [[:dragon :ice]]
  :egggroups [[]]
  :abilities [[:turboblaze]]
  :stats [[125 120 90 170 100 95]]
  :weight [325]
  :height [3.6])

(deffamily :kyurem [:kyurem-b :kyurem-w])
(deffamily :zekrom)
(deffamily :reshiram)
