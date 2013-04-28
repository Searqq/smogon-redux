
(defpokemon :bonsly
  :name "Bonsly"
  :introduced-in :dp
  :types [[:rock]]
  :egggroups [[]]
  :abilities [[:rattled :rock-head :sturdy]]
  :stats [[50 80 95 10 45 10]]
  :weight [15]
  :height [0.5])

(defpokemon :sudowoodo
  :name "Sudowoodo"
  :introduced-in :gs
  :types [[:rock]]
  :egggroups [[:mineral]]
  :abilities [[:rock-head :sturdy]
              :bw [:rattled :rock-head :sturdy]]
  :stats [[70 100 115 30 65 30]]
  :weight [38]
  :height [1.2])

(deffamily :bonsly :sudowoodo)
