
(defpokemon :slugma
  :name "Slugma"
  :introduced-in :gs
  :types [[:fire]]
  :egggroups [[:indeterminate]]
  :abilities [[:flame-body :magma-armor]
              :bw [:flame-body :magma-armor :weak-armor]]
  :stats [[40 40 40 70 40 20]]
  :weight [35]
  :height [0.7])

(defpokemon :magcargo
  :name "Magcargo"
  :introduced-in :gs
  :types [[:fire :rock]]
  :egggroups [[:indeterminate]]
  :abilities [[:flame-body :magma-armor]
              :bw [:flame-body :magma-armor :weak-armor]]
  :stats [[50 50 120 80 80 30]]
  :weight [55]
  :height [0.8])

(deffamily :slugma :magcargo)
