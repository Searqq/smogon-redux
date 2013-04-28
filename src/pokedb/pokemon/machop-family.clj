
(defpokemon :machop
  :name "Machop"
  :introduced-in :rb
  :types [[:fighting]]
  :egggroups [[:humanshape]]
  :abilities [[:guts]
              :dp [:guts :no-guard]
              :bw [:guts :no-guard :steadfast]]
  :stats [[70 80 50 35 35]
          :gs [70 80 50 35 35 35]]
  :weight [19.5]
  :height [0.8])

(defpokemon :machoke
  :name "Machoke"
  :introduced-in :rb
  :types [[:fighting]]
  :egggroups [[:humanshape]]
  :abilities [[:guts]
              :dp [:guts :no-guard]
              :bw [:guts :no-guard :steadfast]]
  :stats [[80 100 70 50 45]
          :gs [80 100 70 50 60 45]]
  :weight [70.5]
  :height [1.5])

(defpokemon :machamp
  :name "Machamp"
  :introduced-in :rb
  :types [[:fighting]]
  :egggroups [[:humanshape]]
  :abilities [[:guts]
              :dp [:guts :no-guard]
              :bw [:guts :no-guard :steadfast]]
  :stats [[90 130 80 65 55]
          :gs [90 130 80 65 85 55]]
  :weight [130]
  :height [1.6])

(deffamily :machop :machoke :machamp)
