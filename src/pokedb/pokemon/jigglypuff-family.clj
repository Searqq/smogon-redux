
(defpokemon :igglybuff
  :name "Igglybuff"
  :introduced-in :gs
  :types [[:normal]]
  :egggroups [[]]
  :abilities [[:cute-charm]
              :bw [:cute-charm :friend-guard]]
  :stats [[90 30 15 40 20 15]]
  :weight [1]
  :height [0.3])

(defpokemon :jigglypuff
  :name "Jigglypuff"
  :introduced-in :rb
  :types [[:normal]]
  :egggroups [[:fairy]]
  :abilities [[:cute-charm]
              :bw [:cute-charm :friend-guard]]
  :stats [[115 45 20 25 20]
          :gs [115 45 20 45 25 20]]
  :weight [5.5]
  :height [0.5])

(defpokemon :wigglytuff
  :name "Wigglytuff"
  :introduced-in :rb
  :types [[:normal]]
  :egggroups [[:fairy]]
  :abilities [[:cute-charm]
              :bw [:cute-charm :frisk]]
  :stats [[140 70 45 50 45]
          :gs [140 70 45 75 50 45]]
  :weight [12]
  :height [1])

(deffamily :igglybuff :jigglypuff :wigglytuff)
