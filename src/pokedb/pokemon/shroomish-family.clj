
(defpokemon :shroomish
  :name "Shroomish"
  :introduced-in :rs
  :types [[:grass]]
  :egggroups [[:fairy :plant]]
  :abilities [[:effect-spore]
              :dp [:effect-spore :poison-heal]
              :bw [:effect-spore :poison-heal :quick-feet]]
  :stats [[60 40 60 40 60 35]]
  :weight [4.5]
  :height [0.4])

(defpokemon :breloom
  :name "Breloom"
  :introduced-in :rs
  :types [[:fighting :grass]]
  :egggroups [[:fairy :plant]]
  :abilities [[:effect-spore]
              :dp [:effect-spore :poison-heal]
              :bw [:effect-spore :poison-heal :technician]]
  :stats [[60 130 80 60 60 70]]
  :weight [39.2]
  :height [1.2])

(deffamily :shroomish :breloom)
