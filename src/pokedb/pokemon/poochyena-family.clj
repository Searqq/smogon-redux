
(defpokemon :poochyena
  :name "Poochyena"
  :introduced-in :rs
  :types [[:dark]]
  :egggroups [[:ground]]
  :abilities [[:run-away]
              :dp [:quick-feet :run-away]
              :bw [:quick-feet :rattled :run-away]]
  :stats [[35 55 35 30 30 35]]
  :weight [13.6]
  :height [0.5])

(defpokemon :mightyena
  :name "Mightyena"
  :introduced-in :rs
  :types [[:dark]]
  :egggroups [[:ground]]
  :abilities [[:intimidate]
              :dp [:intimidate :quick-feet]
              :bw [:intimidate :moxie :quick-feet]]
  :stats [[70 90 70 60 60 70]]
  :weight [37]
  :height [1])

(deffamily :poochyena :mightyena)
