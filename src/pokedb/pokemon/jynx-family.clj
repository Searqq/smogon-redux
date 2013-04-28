
(defpokemon :smoochum
  :name "Smoochum"
  :introduced-in :gs
  :types [[:ice :psychic]]
  :egggroups [[]]
  :abilities [[:oblivious]
              :dp [:forewarn :oblivious]
              :bw [:forewarn :hydration :oblivious]]
  :stats [[45 30 15 85 65 65]]
  :weight [6]
  :height [0.4])

(defpokemon :jynx
  :name "Jynx"
  :introduced-in :rb
  :types [[:ice :psychic]]
  :egggroups [[:humanshape]]
  :abilities [[:oblivious]
              :dp [:forewarn :oblivious]
              :bw [:dry-skin :forewarn :oblivious]]
  :stats [[65 50 35 95 95]
          :gs [65 50 35 115 95 95]]
  :weight [40.6]
  :height [1.4])

(deffamily :smoochum :jynx)
