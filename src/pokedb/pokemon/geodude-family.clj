
(defpokemon :geodude
  :name "Geodude"
  :introduced-in :rb
  :types [[:ground :rock]]
  :egggroups [[:mineral]]
  :abilities [[:rock-head :sturdy]
              :bw [:rock-head :sand-veil :sturdy]]
  :stats [[40 80 100 30 20]
          :gs [40 80 100 30 30 20]]
  :weight [20]
  :height [0.4])

(defpokemon :graveler
  :name "Graveler"
  :introduced-in :rb
  :types [[:ground :rock]]
  :egggroups [[:mineral]]
  :abilities [[:rock-head :sturdy]
              :bw [:rock-head :sand-veil :sturdy]]
  :stats [[55 95 115 45 35]
          :gs [55 95 115 45 45 35]]
  :weight [105]
  :height [1])

(defpokemon :golem
  :name "Golem"
  :introduced-in :rb
  :types [[:ground :rock]]
  :egggroups [[:mineral]]
  :abilities [[:rock-head :sturdy]
              :bw [:rock-head :sand-veil :sturdy]]
  :stats [[80 110 130 55 45]
          :gs [80 110 130 55 65 45]]
  :weight [300]
  :height [1.4])

(deffamily :geodude :graveler :golem)
