
(defpokemon :venonat
  :name "Venonat"
  :introduced-in :rb
  :types [[:bug :poison]]
  :egggroups [[:bug]]
  :abilities [[:compoundeyes]
              :dp [:compoundeyes :tinted-lens]
              :bw [:compoundeyes :run-away :tinted-lens]]
  :stats [[60 55 50 40 45]
          :gs [60 55 50 40 55 45]]
  :weight [30]
  :height [1])

(defpokemon :venomoth
  :name "Venomoth"
  :introduced-in :rb
  :types [[:bug :poison]]
  :egggroups [[:bug]]
  :abilities [[:shield-dust]
              :dp [:shield-dust :tinted-lens]
              :bw [:shield-dust :tinted-lens :wonder-skin]]
  :stats [[70 65 60 90 90]
          :gs [70 65 60 90 75 90]]
  :weight [12.5]
  :height [1.5])

(deffamily :venonat :venomoth)
