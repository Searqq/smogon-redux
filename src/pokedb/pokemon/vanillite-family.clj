
(defpokemon :vanillish
  :name "Vanillish"
  :introduced-in :bw
  :types [[:ice]]
  :egggroups [[:mineral]]
  :abilities [[:ice-body :weak-armor]]
  :stats [[51 65 65 80 75 59]]
  :weight [41]
  :height [1.1])

(defpokemon :vanillite
  :name "Vanillite"
  :introduced-in :bw
  :types [[:ice]]
  :egggroups [[:mineral]]
  :abilities [[:ice-body :weak-armor]]
  :stats [[36 50 50 65 60 44]]
  :weight [5.7]
  :height [0.4])

(defpokemon :vanilluxe
  :name "Vanilluxe"
  :introduced-in :bw
  :types [[:ice]]
  :egggroups [[:mineral]]
  :abilities [[:ice-body :weak-armor]]
  :stats [[71 95 85 110 95 79]]
  :weight [57.5]
  :height [1.3])

(deffamily :vanillite :vanillish :vanilluxe)
