
(defpokemon :porygon
  :name "Porygon"
  :introduced-in :rb
  :types [[:normal]]
  :egggroups [[:mineral]]
  :abilities [[:trace]
              :bw [:analytic :download :trace]]
  :stats [[65 60 70 75 40]
          :gs [65 60 70 85 75 40]]
  :weight [36.5]
  :height [0.8])

(defpokemon :porygon2
  :name "Porygon2"
  :introduced-in :gs
  :types [[:normal]]
  :egggroups [[:mineral]]
  :abilities [[:trace]
              :dp [:download :trace]
              :bw [:analytic :download :trace]]
  :stats [[85 80 90 105 95 60]]
  :weight [32.5]
  :height [0.6])

(defpokemon :porygon-z
  :name "Porygon-Z"
  :introduced-in :dp
  :types [[:normal]]
  :egggroups [[:mineral]]
  :abilities [[:download :trace]
              :bw [:adaptability :analytic :download]]
  :stats [[85 80 70 135 75 90]]
  :weight [34]
  :height [0.9])



(deffamily :porygon :porygon2 :porygon-z)
