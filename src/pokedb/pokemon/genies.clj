
(defpokemon :tornadus
  :name "Tornadus"
  :introduced-in :bw
  :types [[:flying]]
  :egggroups [[]]
  :abilities [[:defiant :prankster]]
  :stats [[79 115 70 125 80 111]]
  :weight [63]
  :height [1.5])

(defpokemon :tornadus-t
  :name "Tornadus-Therian"
  :introduced-in :bw
  :types [[:flying]]
  :egggroups [[]]
  :abilities [[:regenerator]]
  :stats [[79 100 80 110 90 121]]
  :weight [63]
  :height [1.4])

(defpokemon :thundurus
  :name "Thundurus"
  :introduced-in :bw
  :types [[:electric :flying]]
  :egggroups [[]]
  :abilities [[:defiant :prankster]]
  :stats [[79 115 70 125 80 111]]
  :weight [61]
  :height [1.5])

(defpokemon :thundurus-t
  :name "Thundurus-Therian"
  :introduced-in :bw
  :types [[:electric :flying]]
  :egggroups [[]]
  :abilities [[:volt-absorb]]
  :stats [[79 105 70 145 80 101]]
  :weight [61]
  :height [3])

(defpokemon :landorus
  :name "Landorus"
  :introduced-in :bw
  :types [[:flying :ground]]
  :egggroups [[]]
  :abilities [[:sand-force :sheer-force]]
  :stats [[89 125 90 115 80 101]]
  :weight [68]
  :height [1.5])

(defpokemon :landorus-t
  :name "Landorus-Therian"
  :introduced-in :bw
  :types [[:flying :ground]]
  :egggroups [[]]
  :abilities [[:intimidate]]
  :stats [[89 145 90 105 80 91]]
  :weight [68]
  :height [1.3])

(deffamily :thundurus [:thundurus-t])
(deffamily :tornadus [:tornddaus-t])
(deffamily :landorus [:landorus-t])
