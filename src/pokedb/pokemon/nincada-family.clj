
(defpokemon :nincada
  :name "Nincada"
  :introduced-in :rs
  :types [[:bug :ground]]
  :egggroups [[:bug]]
  :abilities [[:compoundeyes]
              :bw [:compoundeyes :run-away]]
  :stats [[31 45 90 30 30 40]]
  :weight [5.5]
  :height [0.5])

(defpokemon :ninjask
  :name "Ninjask"
  :introduced-in :rs
  :types [[:bug :flying]]
  :egggroups [[:bug]]
  :abilities [[:speed-boost]
              :bw [:infiltrator :speed-boost]]
  :stats [[61 90 45 50 50 160]]
  :weight [12]
  :height [0.8])

(defpokemon :shedinja
  :name "Shedinja"
  :introduced-in :rs
  :types [[:bug :ghost]]
  :egggroups [[:mineral]]
  :abilities [[:wonder-guard]
              :bw [:wonder-guard]]
  :stats [[1 90 45 30 30 40]]
  :weight [1.2]
  :height [0.8])

(deffamily :nincada [:ninjask :shedinja])
