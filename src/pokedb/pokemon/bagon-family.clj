(defpokemon :bagon
  :name "Bagon"
  :introduced-in :rs
  :types [[:dragon]]
  :egggroups [[:dragon]]
  :abilities [[:rock-head]
              :bw [:rock-head :sheer-force]]
  :stats [[45 75 60 40 30 50]]
  :weight [42.1]
  :height [0.6])

(defpokemon :shelgon
  :name "Shelgon"
  :introduced-in :rs
  :types [[:dragon]]
  :egggroups [[:dragon]]
  :abilities [[:rock-head]
              :bw [:overcoat :rock-head]]
  :stats [[65 95 100 60 50 50]]
  :weight [110.5]
  :height [1.1])

(defpokemon :salamence
  :name "Salamence"
  :introduced-in :rs
  :types [[:dragon :flying]]
  :egggroups [[:dragon]]
  :abilities [[:intimidate]
              :bw [:intimidate :moxie]]
  :stats [[95 135 80 110 80 100]]
  :weight [102.6]
  :height [1.5])

(deffamily :bagon :shelgon :salamence)

(deflearnset :rs
  :bagon [:aerial-ace :attract :bite :body-slam :brick-break :crunch :cut :double-edge :double-team :dragon-claw :dragon-dance :dragon-rage :dragonbreath :ember :endure :facade :fire-blast :flamethrower :focus-energy :frustration :fury-cutter :headbutt :hidden-power :hydro-pump :leer :mimic :mud-slap :protect :rage :rain-dance :rest :return :roar :rock-slide :rock-smash :rock-tomb :scary-face :secret-power :sleep-talk :snore :strength :substitute :sunny-day :swagger :thrash :toxic :twister]
  :shelgon [:defense-curl :rollout]
  :salamence [:earthquake :fly :hyper-beam :iron-tail :steel-wing :swift])

(deflearnset :dp
  :bagon [:aerial-ace :attract :bite :brick-break :captivate :crunch :cut :double-edge :double-team :draco-meteor :dragon-claw :dragon-dance :dragon-pulse :dragon-rage :dragon-rush :dragonbreath :ember :endure :facade :fire-blast :fire-fang :flamethrower :focus-energy :frustration :fury-cutter :headbutt :hidden-power :hydro-pump :leer :mud-slap :natural-gift :outrage :protect :rage :rain-dance :rest :return :roar :rock-slide :rock-smash :rock-tomb :scary-face :secret-power :shadow-claw :sleep-talk :snore :strength :substitute :sunny-day :swagger :thrash :toxic :twister :zen-headbutt]
  :shelgon [:iron-defense :rollout]
  :salamence [:air-cutter :aqua-tail :defog :earthquake :fly :giga-impact :heat-wave :hyper-beam :iron-tail :ominous-wind :roost :steel-wing :stone-edge :swift :tailwind :thunder-fang])

(deflearnset :bw
  :bagon [:aerial-ace :attract :bite :body-slam :brick-break :crunch :cut :defense-curl :double-edge :double-team :draco-meteor :dragon-claw :dragon-dance :dragon-pulse :dragon-rage :dragon-rush :dragonbreath :ember :endure :facade :fire-blast :fire-fang :flamethrower :focus-energy :frustration :headbutt :hidden-power :hone-claws :hydro-pump :hyper-voice :incinerate :leer :mimic :outrage :protect :rage :rain-dance :rest :return :roar :rock-slide :rock-smash :rock-tomb :round :scary-face :shadow-claw :sleep-talk :snore :strength :substitute :sunny-day :swagger :thrash :toxic :twister :zen-headbutt]
  :shelgon [:iron-defense]
  :salamence [:aqua-tail :bulldoze :dragon-tail :earthquake :fly :giga-impact :heat-wave :hyper-beam :iron-tail :roost :stone-edge :tailwind :thunder-fang])
