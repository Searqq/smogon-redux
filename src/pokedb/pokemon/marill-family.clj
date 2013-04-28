
(defpokemon :azurill
  :name "Azurill"
  :introduced-in :rs
  :types [[:normal]]
  :egggroups [[]]
  :abilities [[:huge-power :thick-fat]
              :bw [:huge-power :sap-sipper :thick-fat]]
  :stats [[50 20 40 20 40 20]]
  :weight [2]
  :height [0.2])

(defpokemon :marill
  :name "Marill"
  :introduced-in :gs
  :types [[:water]]
  :egggroups [[:fairy :water-1]]
  :abilities [[:huge-power :thick-fat]
              :bw [:huge-power :sap-sipper :thick-fat]]
  :stats [[70 20 50 20 50 40]]
  :weight [8.5]
  :height [0.4])

(defpokemon :azumarill
  :name "Azumarill"
  :introduced-in :gs
  :types [[:water]]
  :egggroups [[:fairy :water-1]]
  :abilities [[:huge-power :thick-fat]
              :bw [:huge-power :sap-sipper :thick-fat]]
  :stats [[100 50 80 50 80 50]]
  :weight [28.5]
  :height [0.8])

(deffamily :azurill :marill :azumarill)
