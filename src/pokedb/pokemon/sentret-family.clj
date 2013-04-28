
(defpokemon :sentret
  :name "Sentret"
  :introduced-in :gs
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:keen-eye :run-away]
              :bw [:frisk :keen-eye :run-away]]
  :stats [[35 46 34 35 45 20]]
  :weight [6]
  :height [0.8])

(defpokemon :furret
  :name "Furret"
  :introduced-in :gs
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:keen-eye :run-away]
              :bw [:frisk :keen-eye :run-away]]
  :stats [[85 76 64 45 55 90]]
  :weight [32.5]
  :height [1.8])

(deffamily :sentret :furret)
