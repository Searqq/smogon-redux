
(defpokemon :shellder
  :name "Shellder"
  :introduced-in :rb
  :types [[:water]]
  :egggroups [[:water-3]]
  :abilities [[:shell-armor]
              :dp [:shell-armor :skill-link]
              :bw [:overcoat :shell-armor :skill-link]]
  :stats [[30 65 100 45 40]
          :gs [30 65 100 45 25 40]]
  :weight [4]
  :height [0.3])

(defpokemon :cloyster
  :name "Cloyster"
  :introduced-in :rb
  :types [[:ice :water]]
  :egggroups [[:water-3]]
  :abilities [[:shell-armor]
              :dp [:shell-armor :skill-link]
              :bw [:overcoat :shell-armor :skill-link]]
  :stats [[50 95 180 85 70]
          :gs [50 95 180 85 45 70]]
  :weight [132.5]
  :height [1.5])

(deffamily :shellder :cloyster)
