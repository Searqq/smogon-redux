
(defpokemon :eevee
  :name "Eevee"
  :introduced-in :rb
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:run-away]
              :dp [:adaptability :run-away]
              :bw [:adaptability :anticipation :run-away]]
  :stats [[55 55 50 65 55]
          :gs [55 55 50 45 65 55]]
  :weight [6.5]
  :height [0.3])

(defpokemon :flareon
  :name "Flareon"
  :introduced-in :rb
  :types [[:fire]]
  :egggroups [[:ground]]
  :abilities [[:flash-fire]
              :bw [:flash-fire :guts]]
  :stats [[65 130 60 110 65]
          :gs [65 130 60 95 110 65]]
  :weight [25]
  :height [0.9])

(defpokemon :jolteon
  :name "Jolteon"
  :introduced-in :rb
  :types [[:electric]]
  :egggroups [[:ground]]
  :abilities [[:volt-absorb]
              :bw [:quick-feet :volt-absorb]]
  :stats [[65 65 60 110 130]
          :gs [65 65 60 110 95 130]]
  :weight [24.5]
  :height [0.8])

(defpokemon :vaporeon
  :name "Vaporeon"
  :introduced-in :rb
  :types [[:water]]
  :egggroups [[:ground]]
  :abilities [[:water-absorb]
              :bw [:hydration :water-absorb]]
  :stats [[130 65 60 110 65]
          :gs [130 65 60 110 95 65]]
  :weight [29]
  :height [1])

(defpokemon :espeon
  :name "Espeon"
  :introduced-in :gs
  :types [[:psychic]]
  :egggroups [[:ground]]
  :abilities [[:synchronize]
              :bw [:magic-bounce :synchronize]]
  :stats [[65 65 60 130 95 110]]
  :weight [26.5]
  :height [0.9])

(defpokemon :umbreon
  :name "Umbreon"
  :introduced-in :gs
  :types [[:dark]]
  :egggroups [[:ground]]
  :abilities [[:synchronize]
              :bw [:inner-focus :synchronize]]
  :stats [[95 65 110 60 130 65]]
  :weight [27]
  :height [1])

(defpokemon :leafeon
  :name "Leafeon"
  :introduced-in :dp
  :types [[:grass]]
  :egggroups [[:ground]]
  :abilities [[:chlorophyll :leaf-guard]]
  :stats [[65 110 130 60 65 95]]
  :weight [25.5]
  :height [1])

(defpokemon :glaceon
  :name "Glaceon"
  :introduced-in :dp
  :types [[:ice]]
  :egggroups [[:ground]]
  :abilities [[:snow-cloak]
              :bw [:ice-body :snow-cloak]]
  :stats [[65 60 110 130 95 65]]
  :weight [25.9]
  :height [0.8])

(deffamily :eevee [:vaporeon :jolteon :flareon :espeon :umbreon :leafeon :glaceon])
