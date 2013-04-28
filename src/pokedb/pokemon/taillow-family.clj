
(defpokemon :taillow
  :name "Taillow"
  :introduced-in :rs
  :types [[:flying :normal]]
  :egggroups [[:flying]]
  :abilities [[:guts]
              :bw [:guts :scrappy]]
  :stats [[40 55 30 30 30 85]]
  :weight [2.3]
  :height [0.3])

(defpokemon :swellow
  :name "Swellow"
  :introduced-in :rs
  :types [[:flying :normal]]
  :egggroups [[:flying]]
  :abilities [[:guts]
              :bw [:guts :scrappy]]
  :stats [[60 85 60 50 50 125]]
  :weight [19.8]
  :height [0.7])

(deffamily :taillow :swellow)
