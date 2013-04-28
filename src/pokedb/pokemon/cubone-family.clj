
(defpokemon :cubone
  :name "Cubone"
  :introduced-in :rb
  :types [[:ground]]
  :egggroups [[:monster]]
  :abilities [[:lightningrod :rock-head]
              :bw [:battle-armor :lightningrod :rock-head]]
  :stats [[50 50 95 40 35]
          :gs [50 50 95 40 50 35]]
  :weight [6.5]
  :height [0.4])

(defpokemon :marowak
  :name "Marowak"
  :introduced-in :rb
  :types [[:ground]]
  :egggroups [[:monster]]
  :abilities [[:lightningrod :rock-head]
              :bw [:battle-armor :lightningrod :rock-head]]
  :stats [[60 80 110 50 45]
          :gs [60 80 110 50 80 45]]
  :weight [45]
  :height [1])

(deffamily :cubone :marowak)
