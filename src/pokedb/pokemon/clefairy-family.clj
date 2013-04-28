
(defpokemon :cleffa
  :name "Cleffa"
  :introduced-in :gs
  :types [[:normal]]
  :egggroups [[]]
  :abilities [[:cute-charm]
              :dp [:cute-charm :magic-guard]
              :bw [:cute-charm :friend-guard :magic-guard]]
  :stats [[50 25 28 45 55 15]]
  :weight [3]
  :height [0.3])

(defpokemon :clefairy
  :name "Clefairy"
  :introduced-in :rb
  :types [[:normal]]
  :egggroups [[:fairy]]
  :abilities [[:cute-charm]
              :dp [:cute-charm :magic-guard]
              :bw [:cute-charm :friend-guard :magic-guard]]
  :stats [[70 45 48 60 35]
          :gs [70 45 48 60 65 35]]
  :weight [7.5]
  :height [0.6])

(defpokemon :clefable
  :name "Clefable"
  :introduced-in :rb
  :types [[:normal]]
  :egggroups [[:fairy]]
  :abilities [[:cute-charm]
              :dp [:cute-charm :magic-guard]
              :bw [:cute-charm :magic-guard :unaware]]
  :stats [[95 70 73 85 60]
          :gs [95 70 73 85 90 60]]
  :weight [40]
  :height [1.3])

(deffamily :cleffa :clefairy :clefable)
