
(defpokemon :ralts
  :name "Ralts"
  :introduced-in :rs
  :types [[:psychic]]
  :egggroups [[:indeterminate]]
  :abilities [[:synchronize :trace]
              :bw [:synchronize :telepathy :trace]]
  :stats [[28 25 25 45 35 40]]
  :weight [6.6]
  :height [0.4])

(defpokemon :kirlia
  :name "Kirlia"
  :introduced-in :rs
  :types [[:psychic]]
  :egggroups [[:indeterminate]]
  :abilities [[:synchronize :trace]
              :bw [:synchronize :telepathy :trace]]
  :stats [[38 35 35 65 55 50]]
  :weight [20.2]
  :height [0.8])

(defpokemon :gardevoir
  :name "Gardevoir"
  :introduced-in :rs
  :types [[:psychic]]
  :egggroups [[:indeterminate]]
  :abilities [[:synchronize :trace]
              :bw [:synchronize :telepathy :trace]]
  :stats [[68 65 65 125 115 80]]
  :weight [48.4]
  :height [1.6])

(defpokemon :gallade
  :name "Gallade"
  :introduced-in :dp
  :types [[:fighting :psychic]]
  :egggroups [[:indeterminate]]
  :abilities [[:justified :steadfast]]
  :stats [[68 125 65 65 115 80]]
  :weight [52]
  :height [1.6])

(deffamily :ralts :kirlia [:gardevoir :gallade])
