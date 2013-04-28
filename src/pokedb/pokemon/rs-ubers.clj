
(defpokemon :groudon
  :name "Groudon"
  :introduced-in :rs
  :types [[:ground]]
  :egggroups [[]]
  :abilities [[:drought]
              :bw [:drought]]
  :stats [[100 150 140 100 90 90]]
  :weight [950]
  :height [3.5])

(defpokemon :kyogre
  :name "Kyogre"
  :introduced-in :rs
  :types [[:water]]
  :egggroups [[]]
  :abilities [[:drizzle]
              :bw [:drizzle]]
  :stats [[100 100 90 150 140 90]]
  :weight [352]
  :height [4.5])

(defpokemon :rayquaza
  :name "Rayquaza"
  :introduced-in :rs
  :types [[:dragon :flying]]
  :egggroups [[]]
  :abilities [[:air-lock]
              :bw [:air-lock]]
  :stats [[105 150 90 150 90 95]]
  :weight [206.5]
  :height [7])

(deffamily :rayquaza)
(deffamily :groudon)
(deffamily :kyogre)



(deflearnset :rs
  :groudon [:aerial-ace :ancientpower :body-slam :brick-break :bulk-up :counter :cut :defense-curl :dig :double-edge :double-team :dragon-claw :dynamicpunch :earthquake :endure :eruption :facade :fire-blast :fire-punch :fissure :flamethrower :frustration :fury-cutter :hidden-power :hyper-beam :iron-tail :mega-kick :mega-punch :mimic :mud-shot :mud-slap :overheat :protect :psych-up :rest :return :roar :rock-slide :rock-smash :rock-tomb :rollout :safeguard :sandstorm :scary-face :secret-power :seismic-toss :shock-wave :slash :sleep-talk :snore :solarbeam :strength :substitute :sunny-day :swagger :swift :swords-dance :thunder :thunder-wave :thunderbolt :thunderpunch :toxic])

(deflearnset :dp
  :groudon [:aerial-ace :ancientpower :block :brick-break :bulk-up :cut :dig :double-team :dragon-claw :dragon-pulse :earth-power :earthquake :endure :eruption :facade :fire-blast :fire-punch :fissure :flamethrower :fling :focus-blast :frustration :fury-cutter :giga-impact :hammer-arm :headbutt :hidden-power :hyper-beam :iron-head :iron-tail :lava-plume :mud-shot :mud-slap :natural-gift :overheat :protect :psych-up :rest :return :roar :rock-climb :rock-polish :rock-slide :rock-smash :rock-tomb :rollout :safeguard :sandstorm :scary-face :secret-power :shadow-claw :shock-wave :slash :sleep-talk :snore :solarbeam :stealth-rock :stone-edge :strength :substitute :sunny-day :swagger :swift :swords-dance :thunder :thunder-wave :thunderbolt :thunderpunch :toxic :uproar])

(deflearnset :bw
  :groudon [:aerial-ace :ancientpower :block :brick-break :bulk-up :bulldoze :cut :dig :double-team :dragon-claw :dragon-pulse :dragon-tail :earth-power :earthquake :eruption :facade :fire-blast :fire-punch :fissure :flamethrower :fling :focus-blast :frustration :giga-impact :hammer-arm :hidden-power :hone-claws :hyper-beam :incinerate :iron-head :iron-tail :lava-plume :mud-shot :overheat :protect :psych-up :rest :return :roar :rock-polish :rock-slide :rock-smash :rock-tomb :round :safeguard :sandstorm :scary-face :shadow-claw :sleep-talk :smack-down :snore :solarbeam :stealth-rock :stone-edge :strength :substitute :sunny-day :swagger :swords-dance :thunder :thunder-wave :thunderbolt :thunderpunch :toxic :uproar])




(deflearnset :rs
  :kyogre [:ancientpower :blizzard :body-slam :brick-break :calm-mind :defense-curl :dive :double-edge :double-team :earthquake :endure :facade :frustration :hail :hidden-power :hydro-pump :hyper-beam :ice-beam :icy-wind :mimic :mud-slap :protect :psych-up :rain-dance :rest :return :roar :rock-slide :rock-smash :rock-tomb :safeguard :scary-face :secret-power :sheer-cold :shock-wave :sleep-talk :snore :strength :substitute :surf :swagger :swift :thunder :thunder-wave :thunderbolt :toxic :water-pulse :water-spout :waterfall])

(deflearnset :dp
  :kyogre [:ancientpower :aqua-ring :aqua-tail :avalanche :blizzard :block :body-slam :brick-break :brine :calm-mind :dive :double-edge :double-team :earthquake :endure :facade :frustration :giga-impact :hail :headbutt :hidden-power :hydro-pump :hyper-beam :ice-beam :icy-wind :iron-head :mud-slap :muddy-water :natural-gift :protect :psych-up :rain-dance :rest :return :roar :rock-slide :rock-smash :rock-tomb :safeguard :scary-face :secret-power :sheer-cold :shock-wave :signal-beam :sleep-talk :snore :strength :substitute :surf :swagger :swift :thunder :thunder-wave :thunderbolt :toxic :uproar :water-pulse :water-spout :waterfall :whirlpool])

(deflearnset :bw
  :kyogre [:ancientpower :aqua-ring :aqua-tail :blizzard :block :body-slam :brick-break :bulldoze :calm-mind :dive :double-edge :double-team :earthquake :facade :frustration :giga-impact :hail :hidden-power :hydro-pump :hyper-beam :ice-beam :icy-wind :iron-head :muddy-water :protect :psych-up :rain-dance :rest :return :roar :rock-slide :rock-smash :rock-tomb :round :safeguard :scald :scary-face :sheer-cold :signal-beam :sleep-talk :snore :strength :substitute :surf :swagger :thunder :thunder-wave :thunderbolt :toxic :uproar :water-pulse :water-spout :waterfall])




(deflearnset :rs
  :rayquaza [:aerial-ace :ancientpower :blizzard :body-slam :brick-break :bulk-up :crunch :dive :double-edge :double-team :dragon-claw :dragon-dance :earthquake :endure :extremespeed :facade :fire-blast :flamethrower :fly :frustration :fury-cutter :hidden-power :hyper-beam :ice-beam :icy-wind :iron-tail :mimic :mud-slap :outrage :overheat :protect :psych-up :rain-dance :rest :return :roar :rock-slide :rock-smash :sandstorm :scary-face :secret-power :shock-wave :sleep-talk :snore :solarbeam :strength :substitute :sunny-day :surf :swagger :swift :thunder :thunder-wave :thunderbolt :toxic :twister :water-pulse :waterfall])

(deflearnset :dp
  :rayquaza [:aerial-ace :air-slash :ancientpower :aqua-tail :avalanche :blizzard :brick-break :bulk-up :crunch :dive :double-team :draco-meteor :dragon-claw :dragon-dance :dragon-pulse :earth-power :earthquake :endure :energy-ball :extremespeed :facade :fire-blast :flamethrower :fling :fly :focus-blast :frustration :fury-cutter :giga-impact :gyro-ball :headbutt :hidden-power :hyper-beam :hyper-voice :ice-beam :icy-wind :iron-head :iron-tail :mud-slap :natural-gift :outrage :overheat :protect :psych-up :rain-dance :rest :return :roar :rock-slide :rock-smash :rock-tomb :sandstorm :scary-face :secret-power :shadow-claw :shock-wave :sleep-talk :snore :solarbeam :stone-edge :strength :substitute :sunny-day :surf :swagger :swift :swords-dance :tailwind :thunder :thunder-wave :thunderbolt :toxic :twister :uproar :water-pulse :waterfall :whirlpool])

(deflearnset :bw
  :rayquaza [:aerial-ace :air-slash :ancientpower :aqua-tail :bind :blizzard :brick-break :bulk-up :bulldoze :crunch :dive :double-team :draco-meteor :dragon-claw :dragon-dance :dragon-pulse :dragon-tail :earth-power :earthquake :echoed-voice :energy-ball :extremespeed :facade :fire-blast :flamethrower :fling :fly :focus-blast :frustration :giga-impact :gyro-ball :hidden-power :hone-claws :hyper-beam :hyper-voice :ice-beam :icy-wind :incinerate :iron-head :iron-tail :outrage :overheat :protect :psych-up :rain-dance :rest :return :roar :rock-slide :rock-smash :rock-tomb :round :sandstorm :scary-face :shadow-claw :sky-drop :sleep-talk :snore :solarbeam :stone-edge :strength :substitute :sunny-day :surf :swagger :swords-dance :tailwind :thunder :thunder-wave :thunderbolt :toxic :twister :uproar :waterfall])

