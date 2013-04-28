
(defpokemon :magby
  :name "Magby"
  :introduced-in :gs
  :types [[:fire]]
  :egggroups [[]]
  :abilities [[:flame-body]
              :bw [:flame-body :vital-spirit]]
  :stats [[45 75 37 70 55 83]]
  :weight [21.4]
  :height [0.7])

(defpokemon :magmar
  :name "Magmar"
  :introduced-in :rb
  :types [[:fire]]
  :egggroups [[:humanshape]]
  :abilities [[:flame-body]
              :bw [:flame-body :vital-spirit]]
  :stats [[65 95 57 85 93]
          :gs [65 95 57 100 85 93]]
  :weight [44.5]
  :height [1.3])

(defpokemon :magmortar
  :name "Magmortar"
  :introduced-in :dp
  :types [[:fire]]
  :egggroups [[:humanshape]]
  :abilities [[:flame-body :vital-spirit]]
  :stats [[75 95 67 125 95 83]]
  :weight [68]
  :height [1.6])

(deffamily :magby :magmar :magmortar)
