
(defpokemon :tangela
  :name "Tangela"
  :introduced-in :rb
  :types [[:grass]]
  :egggroups [[:plant]]
  :abilities [[:chlorophyll]
              :dp [:chlorophyll :leaf-guard]
              :bw [:chlorophyll :leaf-guard :regenerator]]
  :stats [[65 55 115 100 60]
          :gs [65 55 115 100 40 60]]
  :weight [35]
  :height [1])

(defpokemon :tangrowth
  :name "Tangrowth"
  :introduced-in :dp
  :types [[:grass]]
  :egggroups [[:plant]]
  :abilities [[:chlorophyll :leaf-guard :regenerator]]
  :stats [[100 100 125 110 50 50]]
  :weight [128.6]
  :height [2])

(deffamily :tangela :tangrowth)
