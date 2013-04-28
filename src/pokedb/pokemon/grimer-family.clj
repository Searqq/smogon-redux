
(defpokemon :grimer
  :name "Grimer"
  :introduced-in :rb
  :types [[:poison]]
  :egggroups [[:indeterminate]]
  :abilities [[:stench :sticky-hold]
              :bw [:poison-touch :stench :sticky-hold]]
  :stats [[80 80 50 40 25]
          :gs [80 80 50 40 50 25]]
  :weight [30]
  :height [0.9])

(defpokemon :muk
  :name "Muk"
  :introduced-in :rb
  :types [[:poison]]
  :egggroups [[:indeterminate]]
  :abilities [[:stench :sticky-hold]
              :bw [:poison-touch :stench :sticky-hold]]
  :stats [[105 105 75 65 50]
          :gs [105 105 75 65 100 50]]
  :weight [30]
  :height [1.2])

(deffamily :grimer :muk)
