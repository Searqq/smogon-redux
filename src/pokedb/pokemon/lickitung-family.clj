
(defpokemon :lickitung
  :name "Lickitung"
  :introduced-in :rb
  :types [[:normal]]
  :egggroups [[:monster]]
  :abilities [[:oblivious :own-tempo]
              :bw [:cloud-nine :oblivious :own-tempo]]
  :stats [[90 55 75 60 30]
          :gs [90 55 75 60 75 30]]
  :weight [65.5]
  :height [1.2])

(defpokemon :lickilicky
  :name "Lickilicky"
  :introduced-in :dp
  :types [[:normal]]
  :egggroups [[:monster]]
  :abilities [[:cloud-nine :oblivious :own-tempo]]
  :stats [[110 85 95 80 95 50]]
  :weight [140]
  :height [1.7])


(deffamily :lickitung :lickilicky)
