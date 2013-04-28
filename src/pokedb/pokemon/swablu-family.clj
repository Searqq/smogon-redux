
(defpokemon :swablu
  :name "Swablu"
  :introduced-in :rs
  :types [[:flying :normal]]
  :egggroups [[:dragon :flying]]
  :abilities [[:natural-cure]
              :bw [:cloud-nine :natural-cure]]
  :stats [[45 40 60 40 75 50]]
  :weight [1.2]
  :height [0.4])

(defpokemon :altaria
  :name "Altaria"
  :introduced-in :rs
  :types [[:dragon :flying]]
  :egggroups [[:dragon :flying]]
  :abilities [[:natural-cure]
              :bw [:cloud-nine :natural-cure]]
  :stats [[75 70 90 70 105 80]]
  :weight [20.6]
  :height [1.1])

(deffamily :swablu :altaria)
