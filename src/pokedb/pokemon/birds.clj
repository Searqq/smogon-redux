
(defpokemon :articuno
  :name "Articuno"
  :introduced-in :rb
  :types [[:flying :ice]]
  :egggroups [[]]
  :abilities [[:pressure]
              :bw [:pressure :snow-cloak]]
  :stats [[90 85 100 125 85]
          :gs [90 85 100 95 125 85]]
  :weight [55.4]
  :height [1.7])

(defpokemon :zapdos
  :name "Zapdos"
  :introduced-in :rb
  :types [[:electric :flying]]
  :egggroups [[]]
  :abilities [[:pressure]
              :bw [:lightningrod :pressure]]
  :stats [[90 90 85 125 100]
          :gs [90 90 85 125 90 100]]
  :weight [52.6]
  :height [1.6])

(defpokemon :moltres
  :name "Moltres"
  :introduced-in :rb
  :types [[:fire :flying]]
  :egggroups [[]]
  :abilities [[:pressure]
              :bw [:flame-body :pressure]]
  :stats [[90 100 90 125 90]
          :gs [90 100 90 125 85 90]]
  :weight [60]
  :height [2])

(deffamily :articuno)
(deffamily :zapdos)
(deffamily :moltres)

(deflearnset :rb
  :articuno [:agility :bide :blizzard :bubblebeam :double-edge :double-team :fly :hyper-beam :ice-beam :mimic :mist :peck :rage :razor-wind :reflect :rest :sky-attack :substitute :swift :take-down :toxic :water-gun :whirlwind])

(deflearnset :gs
  :articuno [:agility :blizzard :curse :detect :double-team :endure :fly :frustration :gust :hidden-power :hyper-beam :ice-beam :icy-wind :mind-reader :mist :mud-slap :powder-snow :protect :rain-dance :reflect :rest :return :roar :rock-smash :sandstorm :sleep-talk :snore :steel-wing :sunny-day :swagger :swift :toxic])

(deflearnset :rs
  :articuno [:aerial-ace :agility :blizzard :double-edge :double-team :endure :facade :fly :frustration :gust :hail :hidden-power :hyper-beam :ice-beam :icy-wind :mimic :mind-reader :mist :mud-slap :powder-snow :protect :rain-dance :reflect :rest :return :roar :rock-smash :sandstorm :secret-power :sheer-cold :sky-attack :sleep-talk :snore :steel-wing :substitute :sunny-day :swagger :swift :toxic :water-pulse])

(deflearnset :dp
  :articuno [:aerial-ace :agility :air-cutter :ancientpower :avalanche :blizzard :defog :double-team :endure :facade :fly :frustration :giga-impact :gust :hail :hidden-power :hyper-beam :ice-beam :ice-shard :icy-wind :mind-reader :mist :mud-slap :natural-gift :ominous-wind :pluck :powder-snow :protect :rain-dance :reflect :rest :return :roar :rock-smash :roost :sandstorm :secret-power :sheer-cold :signal-beam :sky-attack :sleep-talk :snore :steel-wing :substitute :sunny-day :swagger :swift :tailwind :toxic :twister :u-turn :water-pulse])

(deflearnset :bw
  :articuno [:aerial-ace :agility :ancientpower :blizzard :double-team :facade :fly :frost-breath :frustration :giga-impact :gust :hail :hidden-power :hurricane :hyper-beam :ice-beam :ice-shard :icy-wind :mind-reader :mist :pluck :powder-snow :protect :rain-dance :reflect :rest :return :roar :rock-smash :roost :round :sandstorm :sheer-cold :signal-beam :sky-attack :sky-drop :sleep-talk :snore :substitute :sunny-day :swagger :tailwind :toxic :u-turn])




(deflearnset :rb
  :moltres [:agility :bide :double-edge :double-team :fire-blast :fire-spin :fly :hyper-beam :leer :mimic :peck :rage :razor-wind :reflect :rest :sky-attack :substitute :swift :take-down :toxic :whirlwind])

(deflearnset :gs
  :moltres [:agility :curse :detect :double-team :ember :endure :fire-blast :fire-spin :flamethrower :fly :frustration :hidden-power :hyper-beam :mud-slap :protect :rain-dance :rest :return :roar :rock-smash :safeguard :sandstorm :sky-attack :sleep-talk :snore :steel-wing :sunny-day :swagger :swift :toxic :wing-attack])

(deflearnset :rs
  :moltres [:aerial-ace :agility :double-edge :double-team :ember :endure :facade :fire-blast :fire-spin :flamethrower :fly :frustration :heat-wave :hidden-power :hyper-beam :mimic :mud-slap :overheat :protect :rain-dance :rest :return :roar :rock-smash :safeguard :sandstorm :secret-power :sky-attack :sleep-talk :snore :steel-wing :substitute :sunny-day :swagger :swift :toxic :wing-attack])

(deflearnset :dp
  :moltres [:aerial-ace :agility :air-cutter :air-slash :ancientpower :defog :double-team :ember :endure :facade :fire-blast :fire-spin :flamethrower :fly :frustration :giga-impact :heat-wave :hidden-power :hyper-beam :mud-slap :natural-gift :ominous-wind :overheat :pluck :protect :rain-dance :rest :return :roar :rock-smash :roost :safeguard :sandstorm :secret-power :sky-attack :sleep-talk :snore :solarbeam :steel-wing :substitute :sunny-day :swagger :swift :tailwind :toxic :twister :u-turn :will-o-wisp :wing-attack])

(deflearnset :bw
  :moltres [:aerial-ace :agility :air-slash :ancientpower :double-team :ember :endure :facade :fire-blast :fire-spin :flame-charge :flamethrower :fly :frustration :giga-impact :heat-wave :hidden-power :hurricane :hyper-beam :incinerate :overheat :pluck :protect :rain-dance :rest :return :roar :rock-smash :roost :round :safeguard :sandstorm :sky-attack :sky-drop :sleep-talk :snore :solarbeam :substitute :sunny-day :swagger :tailwind :toxic :u-turn :will-o-wisp :wing-attack])
