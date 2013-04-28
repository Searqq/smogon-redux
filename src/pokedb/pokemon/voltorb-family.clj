
(defpokemon :voltorb
  :name "Voltorb"
  :introduced-in :rb
  :types [[:electric]]
  :egggroups [[:mineral]]
  :abilities [[:soundproof :static]
              :bw [:aftermath :soundproof :static]]
  :stats [[40 30 50 55 100]
          :gs [40 30 50 55 55 100]]
  :weight [10.4]
  :height [0.5])

(defpokemon :electrode
  :name "Electrode"
  :introduced-in :rb
  :types [[:electric]]
  :egggroups [[:mineral]]
  :abilities [[:soundproof :static]
              :bw [:aftermath :soundproof :static]]
  :stats [[60 50 70 80 140]
          :gs [60 50 70 80 80 140]]
  :weight [66.6]
  :height [1.2])

(deffamily :voltorb :electrode)
