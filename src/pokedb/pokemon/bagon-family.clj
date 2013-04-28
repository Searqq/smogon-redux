
(defpokemon :bagon
  :name "Bagon"
  :introduced-in :rs
  :types [[:dragon]]
  :egggroups [[:dragon]]
  :abilities [[:rock-head]
              :bw [:rock-head :sheer-force]]
  :stats [[45 75 60 40 30 50]]
  :weight [42.1]
  :height [0.6])

(defpokemon :shelgon
  :name "Shelgon"
  :introduced-in :rs
  :types [[:dragon]]
  :egggroups [[:dragon]]
  :abilities [[:rock-head]
              :bw [:overcoat :rock-head]]
  :stats [[65 95 100 60 50 50]]
  :weight [110.5]
  :height [1.1])

(defpokemon :salamence
  :name "Salamence"
  :introduced-in :rs
  :types [[:dragon :flying]]
  :egggroups [[:dragon]]
  :abilities [[:intimidate]
              :bw [:intimidate :moxie]]
  :stats [[95 135 80 110 80 100]]
  :weight [102.6]
  :height [1.5])

(deffamily :bagon :shelgon :salamence)
