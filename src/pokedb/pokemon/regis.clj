
(defpokemon :regice
  :name "Regice"
  :introduced-in :rs
  :types [[:ice]]
  :egggroups [[]]
  :abilities [[:clear-body]
              :bw [:clear-body :ice-body]]
  :stats [[80 50 100 100 200 50]]
  :weight [175]
  :height [1.8])

(defpokemon :regigigas
  :name "Regigigas"
  :introduced-in :dp
  :types [[:normal]]
  :egggroups [[]]
  :abilities [[:slow-start]]
  :stats [[110 160 110 80 110 100]]
  :weight [420]
  :height [3.7])

(defpokemon :regirock
  :name "Regirock"
  :introduced-in :rs
  :types [[:rock]]
  :egggroups [[]]
  :abilities [[:clear-body]
              :bw [:clear-body :sturdy]]
  :stats [[80 100 200 50 100 50]]
  :weight [230]
  :height [1.7])

(defpokemon :registeel
  :name "Registeel"
  :introduced-in :rs
  :types [[:steel]]
  :egggroups [[]]
  :abilities [[:clear-body]
              :bw [:clear-body :light-metal]]
  :stats [[80 75 150 75 150 50]]
  :weight [205]
  :height [1.9])

(deffamily :registeel)
(deffamily :regice)
(deffamily :regirock)
(deffamily :regigigas)
