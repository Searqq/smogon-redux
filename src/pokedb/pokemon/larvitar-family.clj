
(defpokemon :larvitar
  :name "Larvitar"
  :introduced-in :gs
  :types [[:ground :rock]]
  :egggroups [[:monster]]
  :abilities [[:guts]
              :bw [:guts :sand-veil]]
  :stats [[50 64 50 45 50 41]]
  :weight [72]
  :height [0.6])

(defpokemon :pupitar
  :name "Pupitar"
  :introduced-in :gs
  :types [[:ground :rock]]
  :egggroups [[:monster]]
  :abilities [[:shed-skin]]
  :stats [[70 84 70 65 70 51]]
  :weight [152]
  :height [1.2])

(defpokemon :tyranitar
  :name "Tyranitar"
  :introduced-in :gs
  :types [[:dark :rock]]
  :egggroups [[:monster]]
  :abilities [[:sand-stream]
              :bw [:sand-stream :unnerve]]
  :stats [[100 134 110 95 100 61]]
  :weight [202]
  :height [2])

(deffamily :larvitar :pupitar :tyranitar)
