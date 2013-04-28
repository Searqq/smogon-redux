
(defpokemon :meditite
  :name "Meditite"
  :introduced-in :rs
  :types [[:fighting :psychic]]
  :egggroups [[:humanshape]]
  :abilities [[:pure-power]
              :bw [:pure-power :telepathy]]
  :stats [[30 40 55 40 55 60]]
  :weight [11.2]
  :height [0.6])

(defpokemon :medicham
  :name "Medicham"
  :introduced-in :rs
  :types [[:fighting :psychic]]
  :egggroups [[:humanshape]]
  :abilities [[:pure-power]
              :bw [:pure-power :telepathy]]
  :stats [[60 60 75 60 75 80]]
  :weight [31.5]
  :height [1.3])

(deffamily :meditite :medicham)
