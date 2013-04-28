
(defpokemon :rhyhorn
  :name "Rhyhorn"
  :introduced-in :rb
  :types [[:ground :rock]]
  :egggroups [[:ground :monster]]
  :abilities [[:lightningrod :rock-head]
              :bw [:lightningrod :reckless :rock-head]]
  :stats [[80 85 95 30 25]
          :gs [80 85 95 30 30 25]]
  :weight [115]
  :height [1])

(defpokemon :rhydon
  :name "Rhydon"
  :introduced-in :rb
  :types [[:ground :rock]]
  :egggroups [[:ground :monster]]
  :abilities [[:lightningrod :rock-head]
              :bw [:lightningrod :reckless :rock-head]]
  :stats [[105 130 120 45 40]
          :gs [105 130 120 45 45 40]]
  :weight [120]
  :height [1.9])

(defpokemon :rhyperior
  :name "Rhyperior"
  :introduced-in :dp
  :types [[:ground :rock]]
  :egggroups [[:ground :monster]]
  :abilities [[:lightningrod :reckless :solid-rock]]
  :stats [[115 140 130 55 55 40]]
  :weight [282.8]
  :height [2.4])

(deffamily :rhyhorn :rhydon :rhyperior)
