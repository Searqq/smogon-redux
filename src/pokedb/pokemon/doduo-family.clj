
(defpokemon :doduo
  :name "Doduo"
  :introduced-in :rb
  :types [[:flying :normal]]
  :egggroups [[:flying]]
  :abilities [[:early-bird :run-away]
              :bw [:early-bird :run-away :tangled-feet]]
  :stats [[35 85 45 35 75]
          :gs [35 85 45 35 35 75]]
  :weight [39.2]
  :height [1.4])

(defpokemon :dodrio
  :name "Dodrio"
  :introduced-in :rb
  :types [[:flying :normal]]
  :egggroups [[:flying]]
  :abilities [[:early-bird :run-away]
              :bw [:early-bird :run-away :tangled-feet]]
  :stats [[60 110 70 60 100]
          :gs [60 110 70 60 60 100]]
  :weight [85.2]
  :height [1.8])

(deffamily :doduo :dodrio)
