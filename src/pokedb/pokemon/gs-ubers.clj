
(defpokemon :lugia
  :name "Lugia"
  :introduced-in :gs
  :types [[:flying :psychic]]
  :egggroups [[]]
  :abilities [[:pressure]
              :bw [:multiscale :pressure]]
  :stats [[106 90 130 90 154 110]]
  :weight [216]
  :height [5.2])

(defpokemon :ho-oh
  :name "Ho-Oh"
  :introduced-in :gs
  :types [[:fire :flying]]
  :egggroups [[]]
  :abilities [[:pressure]
              :bw [:pressure :regenerator]]
  :stats [[106 130 90 110 154 90]]
  :weight [199]
  :height [3.8])

(deffamily :ho-oh)
(deffamily :lugia)
