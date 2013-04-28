
(defpokemon :treecko
  :name "Treecko"
  :introduced-in :rs
  :types [[:grass]]
  :egggroups [[:dragon :monster]]
  :abilities [[:overgrow]
              :bw [:overgrow :unburden]]
  :stats [[40 45 35 65 55 70]]
  :weight [5]
  :height [0.5])

(defpokemon :grovyle
  :name "Grovyle"
  :introduced-in :rs
  :types [[:grass]]
  :egggroups [[:dragon :monster]]
  :abilities [[:overgrow]
              :bw [:overgrow :unburden]]
  :stats [[50 65 45 85 65 95]]
  :weight [21.6]
  :height [0.9])

(defpokemon :sceptile
  :name "Sceptile"
  :introduced-in :rs
  :types [[:grass]]
  :egggroups [[:dragon :monster]]
  :abilities [[:overgrow]
              :bw [:overgrow :unburden]]
  :stats [[70 85 65 105 85 120]]
  :weight [52.2]
  :height [1.7])

(deffamily :treecko :grovyle :sceptile)
