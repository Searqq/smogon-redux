
(defpokemon :scyther
  :name "Scyther"
  :introduced-in :rb
  :types [[:bug :flying]]
  :egggroups [[:bug]]
  :abilities [[:swarm]
              :dp [:swarm :technician]
              :bw [:steadfast :swarm :technician]]
  :stats [[70 110 80 55 105]
          :gs [70 110 80 55 80 105]]
  :weight [56]
  :height [1.5])

(defpokemon :scizor
  :name "Scizor"
  :introduced-in :gs
  :types [[:bug :steel]]
  :egggroups [[:bug]]
  :abilities [[:swarm]
              :dp [:swarm :technician]
              :bw [:light-metal :swarm :technician]]
  :stats [[70 130 100 55 80 65]]
  :weight [118]
  :height [1.8])

(deffamily :scyther :scizor)
