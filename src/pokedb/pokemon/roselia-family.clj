
(defpokemon :budew
  :name "Budew"
  :introduced-in :dp
  :types [[:grass :poison]]
  :egggroups [[]]
  :abilities [[:leaf-guard :natural-cure :poison-point]]
  :stats [[40 30 35 50 70 55]]
  :weight [1.2]
  :height [0.2])

(defpokemon :roselia
  :name "Roselia"
  :introduced-in :rs
  :types [[:grass :poison]]
  :egggroups [[:fairy :plant]]
  :abilities [[:natural-cure :poison-point]
              :bw [:leaf-guard :natural-cure :poison-point]]
  :stats [[50 60 45 100 80 65]]
  :weight [2]
  :height [0.3])

(defpokemon :roserade
  :name "Roserade"
  :introduced-in :dp
  :types [[:grass :poison]]
  :egggroups [[:fairy :plant]]
  :abilities [[:natural-cure :poison-point :technician]]
  :stats [[60 70 55 125 105 90]]
  :weight [14.5]
  :height [0.9])

(deffamily :budew :roselia :roserade)
