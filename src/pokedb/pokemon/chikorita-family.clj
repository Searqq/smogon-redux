
(defpokemon :chikorita
  :name "Chikorita"
  :introduced-in :gs
  :types [[:grass]]
  :egggroups [[:monster :plant]]
  :abilities [[:overgrow]
              :bw [:leaf-guard :overgrow]]
  :stats [[45 49 65 49 65 45]]
  :weight [6.4]
  :height [0.9])

(defpokemon :bayleef
  :name "Bayleef"
  :introduced-in :gs
  :types [[:grass]]
  :egggroups [[:monster :plant]]
  :abilities [[:overgrow]
              :bw [:leaf-guard :overgrow]]
  :stats [[60 62 80 63 80 60]]
  :weight [15.8]
  :height [1.2])

(defpokemon :meganium
  :name "Meganium"
  :introduced-in :gs
  :types [[:grass]]
  :egggroups [[:monster :plant]]
  :abilities [[:overgrow]
              :bw [:leaf-guard :overgrow]]
  :stats [[80 82 100 83 100 80]]
  :weight [100.5]
  :height [1.8])

(deffamily :chikorita :bayleef :meganium)
