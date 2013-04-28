
(defpokemon :aron
  :name "Aron"
  :introduced-in :rs
  :types [[:rock :steel]]
  :egggroups [[:monster]]
  :abilities [[:rock-head :sturdy]
              :bw [:heavy-metal :rock-head :sturdy]]
  :stats [[50 70 100 40 40 30]]
  :weight [60]
  :height [0.4])

(defpokemon :lairon
  :name "Lairon"
  :introduced-in :rs
  :types [[:rock :steel]]
  :egggroups [[:monster]]
  :abilities [[:rock-head :sturdy]
              :bw [:heavy-metal :rock-head :sturdy]]
  :stats [[60 90 140 50 50 40]]
  :weight [120]
  :height [0.9])

(defpokemon :aggron
  :name "Aggron"
  :introduced-in :rs
  :types [[:rock :steel]]
  :egggroups [[:monster]]
  :abilities [[:rock-head :sturdy]
              :bw [:heavy-metal :rock-head :sturdy]]
  :stats [[70 110 180 60 60 50]]
  :weight [360]
  :height [2.1])

(deffamily :aron :lairon :aggron)
