
(defpokemon :skitty
  :name "Skitty"
  :introduced-in :rs
  :types [[:normal]]
  :egggroups [[:fairy :ground]]
  :abilities [[:cute-charm]
              :dp [:cute-charm :normalize]
              :bw [:cute-charm :normalize :wonder-skin]]
  :stats [[50 45 45 35 35 50]]
  :weight [11]
  :height [0.6])

(defpokemon :delcatty
  :name "Delcatty"
  :introduced-in :rs
  :types [[:normal]]
  :egggroups [[:fairy :ground]]
  :abilities [[:cute-charm]
              :dp [:cute-charm :normalize]
              :bw [:cute-charm :normalize :wonder-skin]]
  :stats [[70 65 65 55 55 70]]
  :weight [32.6]
  :height [1.1])

(deffamily :skitty :delcatty)
