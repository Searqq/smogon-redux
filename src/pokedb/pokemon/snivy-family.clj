
(defpokemon :snivy
  :name "Snivy"
  :introduced-in :dp
  :types [[:grass]]
  :egggroups [[:ground :plant]]
  :abilities [[:contrary :overgrow]]
  :stats [[45 45 55 45 55 63]]
  :weight [8.1]
  :height [0.6])

(defpokemon :servine
  :name "Servine"
  :introduced-in :dp
  :types [[:grass]]
  :egggroups [[:ground :plant]]
  :abilities [[:contrary :overgrow]]
  :stats [[60 60 75 60 75 83]]
  :weight [16]
  :height [0.8])

(defpokemon :serperior
  :name "Serperior"
  :introduced-in :dp
  :types [[:grass]]
  :egggroups [[:ground :plant]]
  :abilities [[:contrary :overgrow]]
  :stats [[75 75 95 75 95 113]]
  :weight [63]
  :height [3.3])

(deffamily :snivy :servine :serperior)
