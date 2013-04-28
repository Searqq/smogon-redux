
(defpokemon :charmander
  :name "Charmander"
  :introduced-in :rb
  :types [[:fire]]
  :egggroups [[:dragon :monster]]
  :abilities [[:blaze]
              :bw [:blaze :solar-power]]
  :stats [[39 52 43 50 65]
          :gs [39 52 43 60 50 65]]
  :weight [8.5]
  :height [0.6])

(defpokemon :charmeleon
  :name "Charmeleon"
  :introduced-in :rb
  :types [[:fire]]
  :egggroups [[:dragon :monster]]
  :abilities [[:blaze]
              :bw [:blaze :solar-power]]
  :stats [[58 64 58 65 80]
          :gs [58 64 58 80 65 80]]
  :weight [19]
  :height [1.1])

(defpokemon :charizard
  :name "Charizard"
  :introduced-in :rb
  :types [[:fire :flying]]
  :egggroups [[:dragon :monster]]
  :abilities [[:blaze]
              :bw [:blaze :solar-power]]
  :stats [[78 84 78 85 100]
          :gs [78 84 78 109 85 100]]
  :weight [90.5]
  :height [1.7])

(deffamily :charmander :charmeleon :charizard)
