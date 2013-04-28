
(defpokemon :snorunt
  :name "Snorunt"
  :introduced-in :rs
  :types [[:ice]]
  :egggroups [[:fairy :mineral]]
  :abilities [[:inner-focus]
              :dp [:ice-body :inner-focus]
              :bw [:ice-body :inner-focus :moody]]
  :stats [[50 50 50 50 50 50]]
  :weight [16.8]
  :height [0.7])

(defpokemon :glalie
  :name "Glalie"
  :introduced-in :rs
  :types [[:ice]]
  :egggroups [[:fairy :mineral]]
  :abilities [[:inner-focus]
              :dp [:ice-body :inner-focus]
              :bw [:ice-body :inner-focus :moody]]
  :stats [[80 80 80 80 80 80]]
  :weight [256.5]
  :height [1.5])

(defpokemon :froslass
  :name "Froslass"
  :introduced-in :dp
  :types [[:ghost :ice]]
  :egggroups [[:fairy :mineral]]
  :abilities [[:cursed-body :snow-cloak]]
  :stats [[70 80 70 80 70 110]]
  :weight [26.6]
  :height [1.3])

(deffamily :snorunt [:glalie :froslass])
