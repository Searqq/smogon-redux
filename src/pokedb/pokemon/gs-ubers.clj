
(defpokemon :lugia
  :name "Lugia"
  :introduced-in :gs
  :types [[:flying :psychic]]
  :egggroups [[]]
  :abilities [[:pressure]
              :bw [:multiscale :pressure]]
  :stats [[106 90 130 90 154 110]]
  :weight [216]
  :height [5.2])

(defpokemon :ho-oh
  :name "Ho-Oh"
  :introduced-in :gs
  :types [[:fire :flying]]
  :egggroups [[]]
  :abilities [[:pressure]
              :bw [:pressure :regenerator]]
  :stats [[106 130 90 110 154 90]]
  :weight [199]
  :height [3.8])

(deffamily :ho-oh)
(deffamily :lugia)

(deflearnset :gs
  :ho-oh [:ancientpower :curse :detect :double-team :dragonbreath :dream-eater :earthquake :endure :fire-blast :flamethrower :flash :fly :frustration :future-sight :giga-drain :gust :hidden-power :hyper-beam :mud-slap :nightmare :protect :psych-up :psychic :rain-dance :recover :rest :return :roar :rock-smash :sacred-fire :safeguard :sandstorm :shadow-ball :sleep-talk :snore :solarbeam :steel-wing :strength :sunny-day :swagger :swift :thunder :thunderbolt :toxic :whirlwind :zap-cannon])

(deflearnset :rs
  :ho-oh [:aerial-ace :ancientpower :calm-mind :double-edge :double-team :dream-eater :earthquake :endure :facade :fire-blast :flamethrower :flash :fly :frustration :future-sight :giga-drain :gust :hidden-power :hyper-beam :light-screen :mimic :mud-slap :nightmare :overheat :protect :psych-up :psychic :rain-dance :recover :reflect :rest :return :roar :rock-smash :sacred-fire :safeguard :sandstorm :secret-power :shadow-ball :shock-wave :sky-attack :sleep-talk :snore :solarbeam :steel-wing :strength :substitute :sunny-day :swagger :swift :thunder :thunder-wave :thunderbolt :toxic :whirlwind])

(deflearnset :dp
  :ho-oh [:aerial-ace :air-cutter :ancientpower :brave-bird :calm-mind :charge-beam :defog :double-team :dream-eater :earth-power :earthquake :endure :extrasensory :facade :fire-blast :flamethrower :flash :fly :frustration :future-sight :giga-drain :giga-impact :gust :heat-wave :hidden-power :hyper-beam :iron-head :light-screen :mud-slap :natural-gift :ominous-wind :overheat :pluck :protect :psych-up :psychic :punishment :rain-dance :recover :reflect :rest :return :roar :rock-smash :roost :sacred-fire :safeguard :sandstorm :secret-power :shadow-ball :shock-wave :signal-beam :sky-attack :sleep-talk :snore :solarbeam :steel-wing :strength :substitute :sunny-day :swagger :swift :tailwind :thunder :thunder-wave :thunderbolt :toxic :twister :weather-ball :whirlwind :will-o-wisp :zen-headbutt])

(deflearnset :bw
  :ho-oh [:aerial-ace :ancientpower :brave-bird :bulldoze :calm-mind :charge-beam :double-team :dream-eater :earth-power :earthquake :echoed-voice :extrasensory :facade :fire-blast :flame-charge :flamethrower :flash :fly :frustration :future-sight :giga-drain :giga-impact :gust :heat-wave :hidden-power :hyper-beam :hyper-voice :incinerate :iron-head :light-screen :natural-gift :overheat :pluck :protect :psych-up :psychic :punishment :rain-dance :recover :reflect :rest :return :roar :rock-smash :roost :round :sacred-fire :safeguard :sandstorm :shadow-ball :signal-beam :sky-attack :sky-drop :sleep-talk :snore :solarbeam :strength :substitute :sunny-day :swagger :tailwind :thunder :thunder-wave :thunderbolt :toxic :weather-ball :whirlwind :will-o-wisp :zen-headbutt])




(deflearnset :gs
  :lugia [:aeroblast :ancientpower :blizzard :curse :detect :double-team :dragonbreath :dream-eater :earthquake :endure :fly :frustration :future-sight :giga-drain :gust :headbutt :hidden-power :hydro-pump :hyper-beam :ice-beam :icy-wind :iron-tail :mud-slap :nightmare :protect :psych-up :psychic :rain-dance :recover :rest :return :roar :rock-smash :safeguard :sandstorm :shadow-ball :sleep-talk :snore :steel-wing :strength :sunny-day :surf :swagger :swift :thunder :thunderbolt :toxic :waterfall :whirlpool :whirlwind :zap-cannon])

(deflearnset :rs
  :lugia [:aerial-ace :aeroblast :ancientpower :blizzard :body-slam :calm-mind :dive :double-edge :double-team :dream-eater :earthquake :endure :facade :fly :frustration :future-sight :giga-drain :gust :hail :hidden-power :hydro-pump :hyper-beam :ice-beam :icy-wind :iron-tail :light-screen :mimic :mud-slap :nightmare :protect :psych-up :psychic :rain-dance :recover :reflect :rest :return :roar :rock-smash :safeguard :sandstorm :secret-power :shadow-ball :shock-wave :skill-swap :sleep-talk :snore :steel-wing :strength :substitute :sunny-day :surf :swagger :swift :thunder :thunder-wave :thunderbolt :toxic :water-pulse :waterfall :whirlwind])

(deflearnset :dp
  :lugia [:aerial-ace :aeroblast :air-cutter :ancientpower :aqua-tail :avalanche :blizzard :brine :calm-mind :charge-beam :defog :dive :double-team :dragon-pulse :dragon-rush :dream-eater :earth-power :earthquake :endure :extrasensory :facade :flash :fly :frustration :future-sight :giga-drain :giga-impact :gust :hail :headbutt :hidden-power :hydro-pump :hyper-beam :ice-beam :icy-wind :iron-head :iron-tail :light-screen :mud-slap :natural-gift :ominous-wind :protect :psych-up :psychic :punishment :rain-dance :recover :reflect :rest :return :roar :rock-smash :roost :safeguard :sandstorm :secret-power :shadow-ball :shock-wave :signal-beam :skill-swap :sky-attack :sleep-talk :snore :steel-wing :strength :substitute :sunny-day :surf :swagger :swift :tailwind :thunder :thunder-wave :thunderbolt :toxic :trick :twister :water-pulse :waterfall :weather-ball :whirlpool :whirlwind :zen-headbutt])

(deflearnset :bw
  :lugia [:aerial-ace :aeroblast :ancientpower :aqua-tail :blizzard :bulldoze :calm-mind :charge-beam :dive :double-team :dragon-pulse :dragon-rush :dragon-tail :dream-eater :earth-power :earthquake :echoed-voice :extrasensory :facade :flash :fly :frustration :future-sight :giga-drain :giga-impact :gust :hail :hidden-power :hydro-pump :hyper-beam :hyper-voice :ice-beam :icy-wind :iron-head :iron-tail :light-screen :natural-gift :protect :psych-up :psychic :psyshock :punishment :rain-dance :recover :reflect :rest :return :roar :rock-smash :roost :round :safeguard :sandstorm :shadow-ball :signal-beam :skill-swap :sky-attack :sky-drop :sleep-talk :snore :strength :substitute :sunny-day :surf :swagger :tailwind :telekinesis :thunder :thunder-wave :thunderbolt :toxic :trick :waterfall :weather-ball :whirlwind :wonder-room :zen-headbutt])
