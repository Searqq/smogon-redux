
(defpokemon :exeggcute
  :name "Exeggcute"
  :introduced-in :rb
  :types [[:grass :psychic]]
  :egggroups [[:plant]]
  :abilities [[:chlorophyll]
              :bw [:chlorophyll :harvest]]
  :stats [[60 40 80 60 40]
          :gs [60 40 80 60 45 40]]
  :weight [2.5]
  :height [0.4])

(defpokemon :exeggutor
  :name "Exeggutor"
  :introduced-in :rb
  :types [[:grass :psychic]]
  :egggroups [[:plant]]
  :abilities [[:chlorophyll]
              :bw [:chlorophyll :harvest]]
  :stats [[95 95 85 125 55]
          :gs [95 95 85 125 65 55]]
  :weight [120]
  :height [2])

(deffamily :exeggcute :exeggutor)
