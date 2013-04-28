
(defpokemon :deino
  :name "Deino"
  :introduced-in :bw
  :types [[:dark :dragon]]
  :egggroups [[:dragon]]
  :abilities [[:hustle]]
  :stats [[52 65 50 45 50 38]]
  :weight [17.3]
  :height [0.8])

(defpokemon :zweilous
  :name "Zweilous"
  :introduced-in :bw
  :types [[:dark :dragon]]
  :egggroups [[:dragon]]
  :abilities [[:hustle]]
  :stats [[72 85 70 65 70 58]]
  :weight [50]
  :height [1.4])

(defpokemon :hydreigon
  :name "Hydreigon"
  :introduced-in :bw
  :types [[:dark :dragon]]
  :egggroups [[:dragon]]
  :abilities [[:levitate]]
  :stats [[92 105 90 125 90 98]]
  :weight [160]
  :height [1.8])

(deffamily :deino :zweilous :hydreigon)
