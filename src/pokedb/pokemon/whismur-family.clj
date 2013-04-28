
(defpokemon :whismur
  :name "Whismur"
  :introduced-in :rs
  :types [[:normal]]
  :egggroups [[:ground :monster]]
  :abilities [[:soundproof]
              :bw [:rattled :soundproof]]
  :stats [[64 51 23 51 23 28]]
  :weight [16.3]
  :height [0.6])

(defpokemon :loudred
  :name "Loudred"
  :introduced-in :rs
  :types [[:normal]]
  :egggroups [[:ground :monster]]
  :abilities [[:soundproof]
              :bw [:scrappy :soundproof]]
  :stats [[84 71 43 71 43 48]]
  :weight [40.5]
  :height [1])

(defpokemon :exploud
  :name "Exploud"
  :introduced-in :rs
  :types [[:normal]]
  :egggroups [[:ground :monster]]
  :abilities [[:soundproof]
              :bw [:scrappy :soundproof]]
  :stats [[104 91 63 91 63 68]]
  :weight [84]
  :height [1.5])

(deffamily :whismur :loudred :exploud)
