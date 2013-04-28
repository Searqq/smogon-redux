
(defpokemon :teddiursa
  :name "Teddiursa"
  :introduced-in :gs
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:pickup]
              :dp [:pickup :quick-feet]
              :bw [:honey-gather :pickup :quick-feet]]
  :stats [[60 80 50 50 50 40]]
  :weight [8.8]
  :height [0.6])

(defpokemon :ursaring
  :name "Ursaring"
  :introduced-in :gs
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:guts]
              :dp [:guts :quick-feet]
              :bw [:guts :quick-feet :unnerve]]
  :stats [[90 130 75 75 75 55]]
  :weight [125.8]
  :height [1.8])

(deffamily :teddiursa :ursaring)
