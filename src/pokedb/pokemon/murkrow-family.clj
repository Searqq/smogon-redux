
(defpokemon :murkrow
  :name "Murkrow"
  :introduced-in :gs
  :types [[:dark :flying]]
  :egggroups [[:flying]]
  :abilities [[:insomnia]
              :dp [:insomnia :super-luck]
              :bw [:insomnia :prankster :super-luck]]
  :stats [[60 85 42 85 42 91]]
  :weight [2.1]
  :height [0.5])

(defpokemon :honchkrow
  :name "Honchkrow"
  :introduced-in :dp
  :types [[:dark :flying]]
  :egggroups [[:flying]]
  :abilities [[:insomnia :moxie :super-luck]]
  :stats [[100 125 52 105 52 71]]
  :weight [27.3]
  :height [0.9])

(deffamily :murkrow :honchkrow)
