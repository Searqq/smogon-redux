
(defpokemon :hoppip
  :name "Hoppip"
  :introduced-in :gs
  :types [[:flying :grass]]
  :egggroups [[:fairy :plant]]
  :abilities [[:chlorophyll]
              :dp [:chlorophyll :leaf-guard]
              :bw [:chlorophyll :infiltrator :leaf-guard]]
  :stats [[35 35 40 35 55 50]]
  :weight [0.5]
  :height [0.4])

(defpokemon :skiploom
  :name "Skiploom"
  :introduced-in :gs
  :types [[:flying :grass]]
  :egggroups [[:fairy :plant]]
  :abilities [[:chlorophyll]
              :dp [:chlorophyll :leaf-guard]
              :bw [:chlorophyll :infiltrator :leaf-guard]]
  :stats [[55 45 50 45 65 80]]
  :weight [1]
  :height [0.6])

(defpokemon :jumpluff
  :name "Jumpluff"
  :introduced-in :gs
  :types [[:flying :grass]]
  :egggroups [[:fairy :plant]]
  :abilities [[:chlorophyll]
              :dp [:chlorophyll :leaf-guard]
              :bw [:chlorophyll :infiltrator :leaf-guard]]
  :stats [[75 55 70 55 85 110]]
  :weight [3]
  :height [0.8])

(deffamily :hoppip :skiploom :jumpluff)
