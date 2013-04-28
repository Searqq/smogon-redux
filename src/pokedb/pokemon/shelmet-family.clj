
(defpokemon :shelmet
  :name "Shelmet"
  :introduced-in :bw
  :types [[:bug]]
  :egggroups [[:bug]]
  :abilities [[:hydration :overcoat :shell-armor]]
  :stats [[50 40 85 40 65 25]]
  :weight [7.7]
  :height [0.4])

(defpokemon :accelgor
  :name "Accelgor"
  :introduced-in :bw
  :types [[:bug]]
  :egggroups [[:bug]]
  :abilities [[:hydration :sticky-hold :unburden]]
  :stats [[80 70 40 100 60 145]]
  :weight [25.3]
  :height [0.8])

(deffamily :shelmet :accelgor)
