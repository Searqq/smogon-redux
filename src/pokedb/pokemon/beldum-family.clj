
(defpokemon :beldum
  :name "Beldum"
  :introduced-in :rs
  :types [[:psychic :steel]]
  :egggroups [[:mineral]]
  :abilities [[:clear-body]
              :bw [:clear-body :light-metal]]
  :stats [[40 55 80 35 60 30]]
  :weight [95.2]
  :height [0.6])

(defpokemon :metang
  :name "Metang"
  :introduced-in :rs
  :types [[:psychic :steel]]
  :egggroups [[:mineral]]
  :abilities [[:clear-body]
              :bw [:clear-body :light-metal]]
  :stats [[60 75 100 55 80 50]]
  :weight [202.5]
  :height [1.2])

(defpokemon :metagross
  :name "Metagross"
  :introduced-in :rs
  :types [[:psychic :steel]]
  :egggroups [[:mineral]]
  :abilities [[:clear-body]
              :bw [:clear-body :light-metal]]
  :stats [[80 135 130 95 90 70]]
  :weight [550]
  :height [1.6])

(deffamily :beldum :metang :metagross)

(deflearnset :rs
  :beldum [:take-down]
  :metang [:aerial-ace :agility :body-slam :brick-break :confusion :cut :defense-curl :double-edge :double-team :dynamicpunch :earthquake :endure :explosion :facade :flash :frustration :fury-cutter :hidden-power :hyper-beam :ice-punch :icy-wind :iron-defense :light-screen :metal-claw :meteor-mash :mimic :mud-slap :protect :psych-up :psychic :pursuit :rain-dance :reflect :rest :return :rock-slide :rock-smash :rock-tomb :rollout :sandstorm :scary-face :secret-power :selfdestruct :shadow-ball :sleep-talk :sludge-bomb :snore :strength :substitute :sunny-day :swagger :swift :thunderpunch :toxic])

(deflearnset :dp
  :beldum [:headbutt :iron-defense :iron-head :take-down :zen-headbutt]
  :metang [:aerial-ace :agility :brick-break :bullet-punch :confusion :cut :double-team :earthquake :endure :explosion :facade :flash :flash-cannon :frustration :fury-cutter :grass-knot :gravity :gyro-ball :hidden-power :hyper-beam :ice-punch :icy-wind :light-screen :magnet-rise :metal-claw :meteor-mash :mud-slap :natural-gift :protect :psych-up :psychic :pursuit :rain-dance :reflect :rest :return :rock-polish :rock-slide :rock-smash :rock-tomb :rollout :sandstorm :scary-face :secret-power :shadow-ball :signal-beam :sleep-talk :sludge-bomb :snore :stealth-rock :strength :substitute :sunny-day :swagger :swift :thunderpunch :toxic :trick]
  :metagross [:block :giga-impact :hammer-arm])

(deflearnset :bw
  :beldum [:iron-defense :iron-head :take-down :zen-headbutt]
  :metang [:aerial-ace :agility :brick-break :bulldoze :bullet-punch :confusion :cut :double-team :earthquake :explosion :facade :flash :flash-cannon :frustration :grass-knot :gravity :gyro-ball :hidden-power :hone-claws :hyper-beam :ice-punch :icy-wind :light-screen :magnet-rise :metal-claw :meteor-mash :miracle-eye :protect :psych-up :psychic :psyshock :pursuit :rain-dance :reflect :rest :return :rock-polish :rock-slide :rock-smash :rock-tomb :round :sandstorm :scary-face :shadow-ball :signal-beam :sleep-talk :sludge-bomb :snore :stealth-rock :strength :substitute :sunny-day :swagger :telekinesis :thunderpunch :toxic :trick]
  :metagross [:block :giga-impact :hammer-arm])
