
(defpokemon :growlithe
  :name "Growlithe"
  :introduced-in :rb
  :types [[:fire]]
  :egggroups [[:ground]]
  :abilities [[:flash-fire :intimidate]
              :bw [:flash-fire :intimidate :justified]]
  :stats [[55 70 45 50 60]
          :gs [55 70 45 70 50 60]]
  :weight [19]
  :height [0.7])

(defpokemon :arcanine
  :name "Arcanine"
  :introduced-in :rb
  :types [[:fire]]
  :egggroups [[:ground]]
  :abilities [[:flash-fire :intimidate]
              :bw [:flash-fire :intimidate :justified]]
  :stats [[90 110 80 80 95]
          :gs [90 110 80 100 80 95]]
  :weight [155]
  :height [1.9])

(deffamily :growlithe :arcanine)
