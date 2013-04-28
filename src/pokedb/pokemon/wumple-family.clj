
(defpokemon :wurmple
  :name "Wurmple"
  :introduced-in :rs
  :types [[:bug]]
  :egggroups [[:bug]]
  :abilities [[:shield-dust]
              :bw [:run-away :shield-dust]]
  :stats [[45 45 35 20 30 20]]
  :weight [3.6]
  :height [0.3])

(defpokemon :silcoon
  :name "Silcoon"
  :introduced-in :rs
  :types [[:bug]]
  :egggroups [[:bug]]
  :abilities [[:shed-skin]]
  :stats [[50 35 55 25 25 15]]
  :weight [10]
  :height [0.6])

(defpokemon :beautifly
  :name "Beautifly"
  :introduced-in :rs
  :types [[:bug :flying]]
  :egggroups [[:bug]]
  :abilities [[:swarm]
              :bw [:rivalry :swarm]]
  :stats [[60 70 50 90 50 65]]
  :weight [28.4]
  :height [1])

(defpokemon :cascoon
  :name "Cascoon"
  :introduced-in :rs
  :types [[:bug]]
  :egggroups [[:bug]]
  :abilities [[:shed-skin]]
  :stats [[50 35 55 25 25 15]]
  :weight [11.5]
  :height [0.7])

(defpokemon :dustox
  :name "Dustox"
  :introduced-in :rs
  :types [[:bug :poison]]
  :egggroups [[:bug]]
  :abilities [[:shield-dust]
              :bw [:compoundeyes :shield-dust]]
  :stats [[60 50 70 50 90 65]]
  :weight [31.6]
  :height [1.2])

(deffamily :wurmple [:silcoon :beautifly :cascoon :dustox])
