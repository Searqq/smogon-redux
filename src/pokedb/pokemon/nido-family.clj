
(defpokemon :nidoran-m
  :name "NidoranM"
  :introduced-in :rb
  :types [[:poison]]
  :egggroups [[:ground :monster]]
  :abilities [[:poison-point]
              :dp [:poison-point :rivalry]
              :bw [:hustle :poison-point :rivalry]]
  :stats [[46 57 40 40 50]
          :gs [46 57 40 40 40 50]]
  :weight [9]
  :height [0.5])

(defpokemon :nidorino
  :name "Nidorino"
  :introduced-in :rb
  :types [[:poison]]
  :egggroups [[:ground :monster]]
  :abilities [[:poison-point]
              :dp [:poison-point :rivalry]
              :bw [:hustle :poison-point :rivalry]]
  :stats [[61 72 57 55 65]
          :gs [61 72 57 55 55 65]]
  :weight [19.5]
  :height [0.9])

(defpokemon :nidoking
  :name "Nidoking"
  :introduced-in :rb
  :types [[:ground :poison]]
  :egggroups [[:ground :monster]]
  :abilities [[:poison-point]
              :dp [:poison-point :rivalry]
              :bw [:poison-point :rivalry :sheer-force]]
  :stats [[81 92 77 75 85]
          :gs [81 92 77 85 75 85]]
  :weight [62]
  :height [1.4])

(defpokemon :nidoran-f
  :name "NidoranF"
  :introduced-in :rb
  :types [[:poison]]
  :egggroups [[:ground :monster]]
  :abilities [[:poison-point]
              :dp [:poison-point :rivalry]
              :bw [:hustle :poison-point :rivalry]]
  :stats [[55 47 52 40 41]
          :gs [55 47 52 40 40 41]]
  :weight [7]
  :height [0.4])

(defpokemon :nidorina
  :name "Nidorina"
  :introduced-in :rb
  :types [[:poison]]
  :egggroups [[]]
  :abilities [[:poison-point]
              :dp [:poison-point :rivalry]
              :bw [:hustle :poison-point :rivalry]]
  :stats [[70 62 67 55 56]
          :gs [70 62 67 55 55 56]]
  :weight [20]
  :height [0.8])

(defpokemon :nidoqueen
  :name "Nidoqueen"
  :introduced-in :rb
  :types [[:ground :poison]]
  :egggroups [[]]
  :abilities [[:poison-point]
              :dp [:poison-point :rivalry]
              :bw [:poison-point :rivalry :sheer-force]]
  :stats [[90 82 87 75 76]
          :gs [90 82 87 75 85 76]]
  :weight [60]
  :height [1.3])


(deffamily :nidoran-m :nidorino :nidoking)
(deffamily :nidoran-f :nidorina :nidoqueen)
