
(defpokemon :bellsprout
  :name "Bellsprout"
  :introduced-in :rb
  :types [[:grass :poison]]
  :egggroups [[:plant]]
  :abilities [[:chlorophyll]
              :bw [:chlorophyll :gluttony]]
  :stats [[50 75 35 70 40]
          :gs [50 75 35 70 30 40]]
  :weight [4]
  :height [0.7])

(defpokemon :weepinbell
  :name "Weepinbell"
  :introduced-in :rb
  :types [[:grass :poison]]
  :egggroups [[:plant]]
  :abilities [[:chlorophyll]
              :bw [:chlorophyll :gluttony]]
  :stats [[65 90 50 85 55]
          :gs [65 90 50 85 45 55]]
  :weight [6.4]
  :height [1])

(defpokemon :victreebel
  :name "Victreebel"
  :introduced-in :rb
  :types [[:grass :poison]]
  :egggroups [[:plant]]
  :abilities [[:chlorophyll]
              :bw [:chlorophyll :gluttony]]
  :stats [[80 105 65 100 70]
          :gs [80 105 65 100 60 70]]
  :weight [15.5]
  :height [1.7])

(deffamily :bellsprout :weepinbell :victreebel)
