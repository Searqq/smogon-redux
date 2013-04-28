
(defpokemon :onix
  :name "Onix"
  :introduced-in :rb
  :types [[:ground :rock]]
  :egggroups [[:mineral]]
  :abilities [[:rock-head :sturdy]
              :bw [:rock-head :sturdy :weak-armor]]
  :stats [[35 45 160 30 70]
          :gs [35 45 160 30 45 70]]
  :weight [210]
  :height [8.8])

(defpokemon :steelix
  :name "Steelix"
  :introduced-in :gs
  :types [[:ground :steel]]
  :egggroups [[:mineral]]
  :abilities [[:rock-head :sturdy]
              :bw [:rock-head :sheer-force :sturdy]]
  :stats [[75 85 200 55 65 30]]
  :weight [400]
  :height [9.2])

(deffamily :onix :steelix)
