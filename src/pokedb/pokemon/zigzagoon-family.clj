
(defpokemon :zigzagoon
  :name "Zigzagoon"
  :introduced-in :rs
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:pickup]
              :bw [:gluttony :pickup :quick-feet]]
  :stats [[38 30 41 30 41 60]]
  :weight [17.5]
  :height [0.4])

(defpokemon :linoone
  :name "Linoone"
  :introduced-in :rs
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:pickup]
              :dp [:gluttony :pickup]
              :bw [:gluttony :pickup :quick-feet]]
  :stats [[78 70 61 50 61 100]]
  :weight [32.5]
  :height [0.5])

(deffamily :zigzagoon :linoone)
