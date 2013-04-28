
(defpokemon :munchlax
  :name "Munchlax"
  :introduced-in :dp
  :types [[:normal]]
  :egggroups [[]]
  :abilities [[:gluttony :pickup :thick-fat]]
  :stats [[135 85 40 40 85 5]]
  :weight [105]
  :height [0.6])

(defpokemon :snorlax
  :name "Snorlax"
  :introduced-in :rb
  :types [[:normal]]
  :egggroups [[:monster]]
  :abilities [[:immunity :thick-fat]
              :bw [:gluttony :immunity :thick-fat]]
  :stats [[160 110 65 65 30]
          :gs [160 110 65 65 110 30]]
  :weight [460]
  :height [2.1])

(deffamily :munchlax :snorlax)
