
(defpokemon :mime-jr
  :name "Mime Jr."
  :introduced-in :dp
  :types [[:psychic]]
  :egggroups [[]]
  :abilities [[:filter :soundproof :technician]]
  :stats [[20 25 45 70 90 60]]
  :weight [13]
  :height [0.6])

(defpokemon :mr-mime
  :name "Mr. Mime"
  :introduced-in :rb
  :types [[:psychic]]
  :egggroups [[:humanshape]]
  :abilities [[:soundproof]
              :dp [:filter :soundproof]
              :bw [:filter :soundproof :technician]]
  :stats [[40 45 65 100 90]
          :gs [40 45 65 100 120 90]]
  :weight [54.5]
  :height [1.3])

(deffamily :mime-jr :mr-mime)
