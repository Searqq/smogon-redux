
(defpokemon :raikou
  :name "Raikou"
  :introduced-in :gs
  :types [[:electric]]
  :egggroups [[]]
  :abilities [[:pressure]
              :bw [:pressure :volt-absorb]]
  :stats [[90 85 75 115 100 115]]
  :weight [178]
  :height [1.9])

(defpokemon :entei
  :name "Entei"
  :introduced-in :gs
  :types [[:fire]]
  :egggroups [[]]
  :abilities [[:pressure]
              :bw [:flash-fire :pressure]]
  :stats [[115 115 85 90 75 100]]
  :weight [198]
  :height [2.1])

(defpokemon :suicune
  :name "Suicune"
  :introduced-in :gs
  :types [[:water]]
  :egggroups [[]]
  :abilities [[:pressure]
              :bw [:pressure :water-absorb]]
  :stats [[100 75 115 90 115 85]]
  :weight [187]
  :height [2])


(deffamily :suicune)
(deffamily :entei)
(deffamily :raikou)



(deflearnset :gs
  :entei [:bite :curse :cut :detect :dig :double-team :ember :endure :fire-blast :fire-spin :flamethrower :flash :frustration :headbutt :hidden-power :hyper-beam :iron-tail :leer :mud-slap :protect :psych-up :rain-dance :rest :return :roar :rock-smash :sandstorm :sleep-talk :snore :solarbeam :stomp :strength :sunny-day :swagger :swift :toxic])

(deflearnset :rs
  :entei [:bite :body-slam :calm-mind :cut :dig :double-edge :double-team :ember :endure :facade :fire-blast :fire-spin :flamethrower :flash :frustration :hidden-power :hyper-beam :iron-tail :leer :mimic :mud-slap :protect :psych-up :rain-dance :reflect :rest :return :roar :rock-smash :sandstorm :secret-power :sleep-talk :snore :solarbeam :stomp :strength :substitute :sunny-day :swagger :swift :toxic])

(deflearnset :dp
  :entei [:bite :calm-mind :cut :dig :double-team :ember :endure :eruption :extrasensory :facade :fire-blast :fire-fang :fire-spin :flamethrower :flash :frustration :giga-impact :headbutt :heat-wave :hidden-power :hyper-beam :iron-head :iron-tail :lava-plume :leer :mud-slap :natural-gift :overheat :protect :psych-up :rain-dance :reflect :rest :return :roar :rock-climb :rock-smash :sandstorm :secret-power :shadow-ball :sleep-talk :snore :solarbeam :stomp :stone-edge :strength :substitute :sunny-day :swagger :swift :toxic :will-o-wisp])

(deflearnset :bw
  :entei [:bite :bulldoze :calm-mind :cut :dig :double-team :ember :eruption :extrasensory :facade :fire-blast :fire-fang :fire-spin :flame-charge :flamethrower :flash :frustration :giga-impact :heat-wave :hidden-power :hyper-beam :incinerate :iron-head :iron-tail :lava-plume :leer :overheat :protect :psych-up :quash :rain-dance :reflect :rest :return :roar :rock-smash :round :sandstorm :shadow-ball :sleep-talk :snarl :snore :solarbeam :stomp :stone-edge :strength :substitute :sunny-day :swagger :toxic :will-o-wisp])




(deflearnset :gs
  :raikou [:bite :crunch :curse :cut :detect :dig :double-team :endure :flash :frustration :headbutt :hidden-power :hyper-beam :iron-tail :leer :mud-slap :protect :psych-up :quick-attack :rain-dance :reflect :rest :return :roar :rock-smash :sandstorm :sleep-talk :snore :spark :strength :sunny-day :swagger :swift :thunder :thunderbolt :thundershock :toxic :zap-cannon])

(deflearnset :rs
  :raikou [:bite :body-slam :calm-mind :crunch :cut :dig :double-edge :double-team :endure :facade :flash :frustration :hidden-power :hyper-beam :iron-tail :leer :mimic :mud-slap :protect :psych-up :quick-attack :rain-dance :reflect :rest :return :roar :rock-smash :sandstorm :secret-power :shock-wave :sleep-talk :snore :spark :strength :substitute :sunny-day :swagger :swift :thunder :thunder-wave :thunderbolt :thundershock :toxic])

(deflearnset :dp
  :raikou [:bite :calm-mind :charge-beam :crunch :cut :dig :discharge :double-team :endure :extrasensory :facade :flash :frustration :giga-impact :headbutt :hidden-power :hyper-beam :iron-head :iron-tail :leer :light-screen :magnet-rise :mud-slap :natural-gift :protect :psych-up :quick-attack :rain-dance :reflect :rest :return :roar :rock-climb :rock-smash :sandstorm :secret-power :shadow-ball :shock-wave :signal-beam :sleep-talk :snore :spark :strength :substitute :sunny-day :swagger :swift :thunder :thunder-fang :thunder-wave :thunderbolt :thundershock :toxic])

(deflearnset :bw
  :raikou [:bite :bulldoze :calm-mind :charge-beam :crunch :cut :dig :discharge :double-team :extrasensory :facade :flash :frustration :giga-impact :hidden-power :hyper-beam :iron-head :iron-tail :leer :light-screen :magnet-rise :protect :psych-up :quash :quick-attack :rain-dance :reflect :rest :return :roar :rock-smash :round :sandstorm :shadow-ball :signal-beam :sleep-talk :snarl :snore :spark :strength :substitute :sunny-day :swagger :thunder :thunder-fang :thunder-wave :thunderbolt :thundershock :toxic :volt-switch :wild-charge])




(deflearnset :gs
  :suicune [:aurora-beam :bite :blizzard :bubblebeam :curse :cut :detect :dig :double-team :endure :frustration :gust :headbutt :hidden-power :hydro-pump :hyper-beam :ice-beam :icy-wind :iron-tail :leer :mirror-coat :mist :mud-slap :protect :psych-up :rain-dance :rest :return :roar :rock-smash :sandstorm :sleep-talk :snore :sunny-day :surf :swagger :swift :toxic :water-gun :waterfall :whirlpool])

(deflearnset :rs
  :suicune [:aurora-beam :bite :blizzard :body-slam :bubblebeam :calm-mind :cut :dig :dive :double-edge :double-team :endure :facade :frustration :gust :hail :hidden-power :hydro-pump :hyper-beam :ice-beam :icy-wind :iron-tail :leer :mimic :mirror-coat :mist :mud-slap :protect :psych-up :rain-dance :reflect :rest :return :roar :rock-smash :sandstorm :secret-power :sleep-talk :snore :substitute :sunny-day :surf :swagger :swift :toxic :water-pulse :waterfall])

(deflearnset :dp
  :suicune [:aurora-beam :avalanche :bite :blizzard :brine :bubblebeam :calm-mind :cut :dig :dive :double-team :endure :extrasensory :facade :frustration :giga-impact :gust :hail :headbutt :hidden-power :hydro-pump :hyper-beam :ice-beam :ice-fang :icy-wind :iron-head :iron-tail :leer :mirror-coat :mist :mud-slap :natural-gift :ominous-wind :protect :psych-up :rain-dance :reflect :rest :return :roar :rock-climb :rock-smash :sandstorm :secret-power :shadow-ball :signal-beam :sleep-talk :snore :substitute :sunny-day :surf :swagger :swift :tailwind :toxic :water-pulse :waterfall :whirlpool])

(deflearnset :bw
  :suicune [:aurora-beam :bite :blizzard :bubblebeam :bulldoze :calm-mind :cut :dig :dive :double-team :extrasensory :facade :frustration :giga-impact :gust :hail :hidden-power :hydro-pump :hyper-beam :ice-beam :ice-fang :icy-wind :iron-head :iron-tail :leer :mirror-coat :mist :protect :psych-up :quash :rain-dance :reflect :rest :return :roar :rock-smash :round :sandstorm :scald :shadow-ball :signal-beam :sleep-talk :snarl :snore :substitute :sunny-day :surf :swagger :tailwind :toxic :waterfall])

