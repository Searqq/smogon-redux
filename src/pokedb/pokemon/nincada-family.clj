
(defpokemon :nincada
  :name "Nincada"
  :introduced-in :rs
  :types [[:bug :ground]]
  :egggroups [[:bug]]
  :abilities [[:compoundeyes]
              :bw [:compoundeyes :run-away]]
  :stats [[31 45 90 30 30 40]]
  :weight [5.5]
  :height [0.5])

(defpokemon :ninjask
  :name "Ninjask"
  :introduced-in :rs
  :types [[:bug :flying]]
  :egggroups [[:bug]]
  :abilities [[:speed-boost]
              :bw [:infiltrator :speed-boost]]
  :stats [[61 90 45 50 50 160]]
  :weight [12]
  :height [0.8])

(defpokemon :shedinja
  :name "Shedinja"
  :introduced-in :rs
  :types [[:bug :ghost]]
  :egggroups [[:mineral]]
  :abilities [[:wonder-guard]
              :bw [:wonder-guard]]
  :stats [[1 90 45 30 30 40]]
  :weight [1.2]
  :height [0.8])

(deffamily :nincada [:ninjask :shedinja])

(deflearnset :rs
  :nincada [:aerial-ace :cut :dig :double-edge :double-team :endure :facade :faint-attack :false-swipe :flash :frustration :fury-cutter :fury-swipes :giga-drain :gust :harden :hidden-power :leech-life :metal-claw :mimic :mind-reader :mud-slap :protect :rest :return :sand-attack :sandstorm :scratch :secret-power :shadow-ball :silver-wind :sleep-talk :snore :solarbeam :substitute :sunny-day :swagger :toxic]
  :ninjask [:agility :attract :baton-pass :hyper-beam :screech :slash :swift :swords-dance :thief]
  :shedinja [:confuse-ray :dream-eater :grudge :nightmare :spite])

(deflearnset :dp
  :nincada [:aerial-ace :bug-bite :bug-buzz :cut :dig :double-team :endure :facade :faint-attack :false-swipe :flash :frustration :fury-cutter :fury-swipes :giga-drain :gust :harden :hidden-power :leech-life :metal-claw :mind-reader :mud-slap :natural-gift :night-slash :protect :rest :return :sand-attack :sandstorm :scratch :secret-power :shadow-ball :silver-wind :sleep-talk :snore :solarbeam :spite :string-shot :substitute :sunny-day :swagger :toxic :x-scissor]
  :ninjask [:agility :air-cutter :attract :baton-pass :captivate :defog :giga-impact :hyper-beam :ominous-wind :roost :screech :slash :swift :swords-dance :thief :u-turn :uproar]
  :shedinja [:confuse-ray :dream-eater :grudge :heal-block :shadow-claw :shadow-sneak :sucker-punch :trick :will-o-wisp])

(deflearnset :bw
  :nincada [:aerial-ace :bug-bite :bug-buzz :cut :dig :double-team :endure :facade :faint-attack :false-swipe :final-gambit :flash :frustration :fury-swipes :giga-drain :gust :harden :hidden-power :hone-claws :leech-life :metal-claw :mind-reader :mud-slap :night-slash :protect :rest :return :round :sand-attack :sandstorm :scratch :shadow-ball :silver-wind :sleep-talk :snore :solarbeam :spite :struggle-bug :substitute :sunny-day :swagger :toxic :x-scissor]
  :ninjask [:agility :attract :baton-pass :fury-cutter :giga-impact :hyper-beam :roost :screech :slash :swords-dance :thief :u-turn :uproar]
  :shedinja [:confuse-ray :dream-eater :grudge :heal-block :shadow-claw :shadow-sneak :telekinesis :trick :will-o-wisp])
