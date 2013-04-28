
(defpokemon :snubbull
  :name "Snubbull"
  :introduced-in :gs
  :types [[:normal]]
  :egggroups [[:fairy :ground]]
  :abilities [[:intimidate :run-away]
              :bw [:intimidate :rattled :run-away]]
  :stats [[60 80 50 40 40 30]]
  :weight [7.8]
  :height [0.6])

(defpokemon :granbull
  :name "Granbull"
  :introduced-in :gs
  :types [[:normal]]
  :egggroups [[:fairy :ground]]
  :abilities [[:intimidate]
              :dp [:intimidate :quick-feet]
              :bw [:intimidate :quick-feet :rattled]]
  :stats [[90 120 75 60 60 45]]
  :weight [48.7]
  :height [1.4])

(deffamily :snubbull :granbull)
