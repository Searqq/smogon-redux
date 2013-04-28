
(defpokemon :articuno
  :name "Articuno"
  :introduced-in :rb
  :types [[:flying :ice]]
  :egggroups [[]]
  :abilities [[:pressure]
              :bw [:pressure :snow-cloak]]
  :stats [[90 85 100 125 85]
          :gs [90 85 100 95 125 85]]
  :weight [55.4]
  :height [1.7])

(defpokemon :zapdos
  :name "Zapdos"
  :introduced-in :rb
  :types [[:electric :flying]]
  :egggroups [[]]
  :abilities [[:pressure]
              :bw [:lightningrod :pressure]]
  :stats [[90 90 85 125 100]
          :gs [90 90 85 125 90 100]]
  :weight [52.6]
  :height [1.6])

(defpokemon :moltres
  :name "Moltres"
  :introduced-in :rb
  :types [[:fire :flying]]
  :egggroups [[]]
  :abilities [[:pressure]
              :bw [:flame-body :pressure]]
  :stats [[90 100 90 125 90]
          :gs [90 100 90 125 85 90]]
  :weight [60]
  :height [2])

(deffamily :articuno)
(deffamily :zapdos)
(deffamily :moltres)
