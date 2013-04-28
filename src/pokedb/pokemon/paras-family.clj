
(defpokemon :paras
  :name "Paras"
  :introduced-in :rb
  :types [[:bug :grass]]
  :egggroups [[:bug :plant]]
  :abilities [[:effect-spore]
              :dp [:dry-skin :effect-spore]
              :bw [:damp :dry-skin :effect-spore]]
  :stats [[35 70 55 55 25]
          :gs [35 70 55 45 55 25]]
  :weight [5.4]
  :height [0.3])

(defpokemon :parasect
  :name "Parasect"
  :introduced-in :rb
  :types [[:bug :grass]]
  :egggroups [[:bug :plant]]
  :abilities [[:effect-spore]
              :dp [:dry-skin :effect-spore]
              :bw [:damp :dry-skin :effect-spore]]
  :stats [[60 95 80 80 30]
          :gs [60 95 80 60 80 30]]
  :weight [29.5]
  :height [1])

(deffamily :paras :parasect)
