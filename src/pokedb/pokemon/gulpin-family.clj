
(defpokemon :gulpin
  :name "Gulpin"
  :introduced-in :rs
  :types [[:poison]]
  :egggroups [[:indeterminate]]
  :abilities [[:liquid-ooze :sticky-hold]
              :bw [:gluttony :liquid-ooze :sticky-hold]]
  :stats [[70 43 53 43 53 40]]
  :weight [10.3]
  :height [0.4])

(defpokemon :swalot
  :name "Swalot"
  :introduced-in :rs
  :types [[:poison]]
  :egggroups [[:indeterminate]]
  :abilities [[:liquid-ooze :sticky-hold]
              :bw [:gluttony :liquid-ooze :sticky-hold]]
  :stats [[100 73 83 73 83 55]]
  :weight [80]
  :height [1.7])

(deffamily :gulpin :swalot)
