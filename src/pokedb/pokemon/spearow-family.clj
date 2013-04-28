
(defpokemon :spearow
  :name "Spearow"
  :introduced-in :rb
  :types [[:flying :normal]]
  :egggroups [[:flying]]
  :abilities [[:keen-eye]
              :bw [:keen-eye :sniper]]
  :stats [[40 60 30 31 70]
          :gs [40 60 30 31 31 70]]
  :weight [2]
  :height [0.3])

(defpokemon :fearow
  :name "Fearow"
  :introduced-in :rb
  :types [[:flying :normal]]
  :egggroups [[:flying]]
  :abilities [[:keen-eye]
              :bw [:keen-eye :sniper]]
  :stats [[65 90 65 61 100]
          :gs [65 90 65 61 61 100]]
  :weight [38]
  :height [1.2])

(deffamily :spearow :fearow)
