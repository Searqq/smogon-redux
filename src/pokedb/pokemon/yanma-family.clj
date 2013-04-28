
(defpokemon :yanma
  :name "Yanma"
  :introduced-in :gs
  :types [[:bug :flying]]
  :egggroups [[:bug]]
  :abilities [[:compoundeyes :speed-boost]
              :bw [:compoundeyes :frisk :speed-boost]]
  :stats [[65 65 45 75 45 95]]
  :weight [38]
  :height [1.2])

(defpokemon :yanmega
  :name "Yanmega"
  :introduced-in :dp
  :types [[:bug :flying]]
  :egggroups [[:bug]]
  :abilities [[:frisk :speed-boost :tinted-lens]]
  :stats [[86 76 86 116 56 95]]
  :weight [51.5]
  :height [1.9])

(deffamily :yanma :yanmega)
