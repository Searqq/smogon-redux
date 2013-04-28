
(defpokemon :meowth
  :name "Meowth"
  :introduced-in :rb
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:pickup]
              :dp [:pickup :technician]
              :bw [:pickup :technician :unnerve]]
  :stats [[40 45 35 40 90]
          :gs [40 45 35 40 40 90]]
  :weight [4.2]
  :height [0.4])

(defpokemon :persian
  :name "Persian"
  :introduced-in :rb
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:limber]
              :dp [:limber :technician]
              :bw [:limber :technician :unnerve]]
  :stats [[65 70 60 65 115]
          :gs [65 70 60 65 65 115]]
  :weight [32]
  :height [1])

(deffamily :meowth :persian)
