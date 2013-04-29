
(defpokemon :palkia
  :name "Palkia"
  :introduced-in :dp
  :types [[:dragon :water]]
  :egggroups [[]]
  :abilities [[:pressure :telepathy]]
  :stats [[90 120 100 150 120 100]]
  :weight [336]
  :height [4.2])

(defpokemon :dialga
  :name "Dialga"
  :introduced-in :dp
  :types [[:dragon :steel]]
  :egggroups [[]]
  :abilities [[:pressure :telepathy]]
  :stats [[100 120 120 150 100 90]]
  :weight [683]
  :height [5.4])

(defpokemon :giratina
  :name "Giratina"
  :introduced-in :dp
  :types [[:dragon :ghost]]
  :egggroups [[]]
  :abilities [[:pressure :telepathy]]
  :stats [[150 100 120 100 120 90]]
  :weight [750]
  :height [4.5])

(defpokemon :giratina-o
  :name "Giratina-Origin"
  :introduced-in :dp
  :types [[:dragon :ghost]]
  :egggroups [[]]
  :abilities [[:levitate]]
  :stats [[150 120 100 120 100 90]]
  :weight [650]
  :height [6.9])

(deffamily :giratina :giratina-o)
(deffamily :palkia)
(deffamily :dialga)

(deflearnset :dp
  :dialga [:aerial-ace :ancientpower :aura-sphere :blizzard :brick-break :bulk-up :cut :double-team :draco-meteor :dragon-claw :dragon-pulse :dragonbreath :earth-power :earthquake :endure :facade :fire-blast :flamethrower :flash :flash-cannon :frustration :fury-cutter :giga-impact :gravity :headbutt :heal-block :hidden-power :hyper-beam :ice-beam :iron-defense :iron-head :iron-tail :magnet-rise :metal-burst :metal-claw :mud-slap :natural-gift :outrage :overheat :power-gem :protect :psych-up :rain-dance :rest :return :roar :roar-of-time :rock-slide :rock-smash :rock-tomb :safeguard :sandstorm :scary-face :secret-power :shadow-claw :shock-wave :slash :sleep-talk :snore :stealth-rock :stone-edge :strength :substitute :sunny-day :swagger :swift :thunder :thunder-wave :thunderbolt :toxic :trick-room :twister])

(deflearnset :bw
  :dialga [:aerial-ace :ancientpower :aura-sphere :blizzard :brick-break :bulk-up :bulldoze :cut :double-team :draco-meteor :dragon-claw :dragon-pulse :dragon-tail :dragonbreath :earth-power :earthquake :echoed-voice :facade :fire-blast :flamethrower :flash :flash-cannon :frustration :giga-impact :gravity :hidden-power :hone-claws :hyper-beam :hyper-voice :ice-beam :incinerate :iron-defense :iron-head :iron-tail :magnet-rise :metal-burst :metal-claw :outrage :overheat :power-gem :protect :psych-up :rain-dance :rest :return :roar :roar-of-time :rock-slide :rock-smash :rock-tomb :round :safeguard :sandstorm :scary-face :shadow-claw :slash :sleep-talk :snore :stealth-rock :stone-edge :strength :substitute :sunny-day :swagger :thunder :thunder-wave :thunderbolt :toxic :trick-room])




(deflearnset :dp
  :giratina [:aerial-ace :air-cutter :ancientpower :aqua-tail :aura-sphere :calm-mind :charge-beam :cut :dark-pulse :defog :destiny-bond :double-team :draco-meteor :dragon-claw :dragon-pulse :dragonbreath :dream-eater :earth-power :earthquake :endure :energy-ball :facade :fly :frustration :fury-cutter :giga-impact :gravity :headbutt :heal-block :hidden-power :hyper-beam :icy-wind :iron-head :iron-tail :mud-slap :natural-gift :ominous-wind :outrage :pain-split :payback :protect :psych-up :psychic :rain-dance :rest :return :roar :rock-climb :rock-smash :safeguard :scary-face :secret-power :shadow-ball :shadow-claw :shadow-force :shadow-sneak :shock-wave :silver-wind :slash :sleep-talk :snore :spite :steel-wing :stone-edge :strength :substitute :sunny-day :swagger :swift :thunder :thunder-wave :thunderbolt :toxic :twister :will-o-wisp])

(deflearnset :bw
  :giratina [:aerial-ace :ancientpower :aqua-tail :aura-sphere :bulldoze :calm-mind :charge-beam :cut :dark-pulse :destiny-bond :double-team :draco-meteor :dragon-claw :dragon-pulse :dragon-tail :dragonbreath :dream-eater :earth-power :earthquake :echoed-voice :energy-ball :facade :fly :frustration :giga-impact :gravity :hex :hidden-power :hone-claws :hyper-beam :hyper-voice :icy-wind :iron-head :iron-tail :ominous-wind :outrage :pain-split :payback :protect :psych-up :psychic :rain-dance :rest :return :roar :rock-smash :round :safeguard :scary-face :shadow-ball :shadow-claw :shadow-force :shadow-sneak :slash :sleep-talk :snore :spite :stone-edge :strength :substitute :sunny-day :swagger :telekinesis :thunder :thunder-wave :thunderbolt :toxic :will-o-wisp])




(deflearnset :dp
  :palkia [:aerial-ace :ancientpower :aqua-tail :aura-sphere :avalanche :blizzard :brick-break :brine :bulk-up :cut :dive :double-team :draco-meteor :dragon-claw :dragon-pulse :dragonbreath :earth-power :earthquake :endure :facade :fire-blast :flamethrower :fling :focus-blast :focus-punch :frustration :fury-cutter :giga-impact :gravity :hail :headbutt :heal-block :hidden-power :hydro-pump :hyper-beam :ice-beam :mud-slap :natural-gift :outrage :power-gem :protect :psych-up :rain-dance :rest :return :roar :rock-slide :rock-smash :rock-tomb :safeguard :sandstorm :scary-face :secret-power :shadow-claw :shock-wave :slash :sleep-talk :snore :spacial-rend :stone-edge :strength :substitute :sunny-day :surf :swagger :swift :thunder :thunder-wave :thunderbolt :toxic :trick-room :twister :water-pulse :whirlpool])

(deflearnset :bw
  :palkia [:aerial-ace :ancientpower :aqua-tail :aura-sphere :blizzard :brick-break :bulk-up :bulldoze :cut :dive :double-team :draco-meteor :dragon-claw :dragon-pulse :dragon-tail :dragonbreath :earth-power :earthquake :echoed-voice :facade :fire-blast :flamethrower :fling :focus-blast :frustration :giga-impact :gravity :hail :hidden-power :hone-claws :hydro-pump :hyper-beam :hyper-voice :ice-beam :incinerate :outrage :power-gem :protect :psych-up :rain-dance :rest :return :roar :rock-slide :rock-smash :rock-tomb :round :safeguard :sandstorm :scary-face :shadow-claw :slash :sleep-talk :snore :spacial-rend :stone-edge :strength :substitute :sunny-day :surf :swagger :thunder :thunder-wave :thunderbolt :toxic :trick-room :water-pulse])
