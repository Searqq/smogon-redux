
(defpokemon :trapinch
  :name "Trapinch"
  :introduced-in :rs
  :types [[:ground]]
  :egggroups [[:bug]]
  :abilities [[:arena-trap :hyper-cutter]
              :bw [:arena-trap :hyper-cutter :sheer-force]]
  :stats [[45 100 45 45 45 10]]
  :weight [15]
  :height [0.7])

(defpokemon :vibrava
  :name "Vibrava"
  :introduced-in :rs
  :types [[:dragon :ground]]
  :egggroups [[:bug]]
  :abilities [[:levitate]
              :bw [:levitate]]
  :stats [[50 70 50 50 50 70]]
  :weight [15.3]
  :height [1.1])

(defpokemon :flygon
  :name "Flygon"
  :introduced-in :rs
  :types [[:dragon :ground]]
  :egggroups [[:bug]]
  :abilities [[:levitate]
              :bw [:levitate]]
  :stats [[80 100 80 80 80 100]]
  :weight [82]
  :height [2])

(deffamily :trapinch :vibrava :flygon)
