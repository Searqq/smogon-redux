
(defpokemon :aerodactyl
  :name "Aerodactyl"
  :introduced-in :rb
  :types [[:flying :rock]]
  :egggroups [[:flying]]
  :abilities [[:pressure :rock-head]
              :bw [:pressure :rock-head :unnerve]]
  :stats [[80 105 65 60 130]
          :gs [80 105 65 60 75 130]]
  :weight [59]
  :height [1.8])

(defpokemon :ditto
  :name "Ditto"
  :introduced-in :rb
  :types [[:normal]]
  :egggroups [[:ditto]]
  :abilities [[:limber]
              :bw [:imposter :limber]]
  :stats [[48 48 48 48 48]
          :gs [48 48 48 48 48 48]]
  :weight [4]
  :height [0.3])

(defpokemon :farfetchd
  :name "Farfetch'd"
  :introduced-in :rb
  :types [[:flying :normal]]
  :egggroups [[:flying :ground]]
  :abilities [[:inner-focus :keen-eye]
              :bw [:defiant :inner-focus :keen-eye]]
  :stats [[52 65 55 58 60]
          :gs [52 65 55 58 62 60]]
  :weight [15]
  :height [0.8])

(defpokemon :kangaskhan
  :name "Kangaskhan"
  :introduced-in :rb
  :types [[:normal]]
  :egggroups [[:monster]]
  :abilities [[:early-bird]
              :dp [:early-bird :scrappy]
              :bw [:early-bird :inner-focus :scrappy]]
  :stats [[105 95 80 40 90]
          :gs [105 95 80 40 80 90]]
  :weight [80]
  :height [2.2])

(defpokemon :lapras
  :name "Lapras"
  :introduced-in :rb
  :types [[:ice :water]]
  :egggroups [[:monster :water-1]]
  :abilities [[:shell-armor :water-absorb]
              :bw [:hydration :shell-armor :water-absorb]]
  :stats [[130 85 80 95 60]
          :gs [130 85 80 85 95 60]]
  :weight [220]
  :height [2.5])

(defpokemon :pinsir
  :name "Pinsir"
  :introduced-in :rb
  :types [[:bug]]
  :egggroups [[:bug]]
  :abilities [[:hyper-cutter]
              :dp [:hyper-cutter :mold-breaker]
              :bw [:hyper-cutter :mold-breaker :moxie]]
  :stats [[65 125 100 55 85]
          :gs [65 125 100 55 70 85]]
  :weight [55]
  :height [1.5])

(defpokemon :tauros
  :name "Tauros"
  :introduced-in :rb
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:intimidate]
              :dp [:anger-point :intimidate]
              :bw [:anger-point :intimidate :sheer-force]]
  :stats [[75 100 95 70 110]
          :gs [75 100 95 40 70 110]]
  :weight [88.4]
  :height [1.4])

;; lol sorry mewtwo

(defpokemon :mewtwo
  :name "Mewtwo"
  :introduced-in :rb
  :types [[:psychic]]
  :egggroups [[]]
  :abilities [[:pressure]
              :bw [:pressure :unnerve]]
  :stats [[106 110 90 154 130]
          :gs [106 110 90 154 90 130]]
  :weight [122]
  :height [2])

(deffamily :aerodactyl)
(deffamily :ditto)
(deffamily :farfetchd)
(deffamily :kangaskhan)
(deffamily :lapras)
(deffamily :mewtwo)
(deffamily :pinsir)
(deffamily :tauros)

(deflearnset :rb
  :aerodactyl [:agility :bide :bite :double-edge :double-team :dragon-rage :fire-blast :fly :hyper-beam :mimic :rage :razor-wind :reflect :rest :sky-attack :substitute :supersonic :swift :take-down :toxic :whirlwind :wing-attack])

(deflearnset :gs
  :aerodactyl [:agility :ancientpower :attract :bite :curse :detect :double-team :dragonbreath :earthquake :endure :fire-blast :flamethrower :fly :foresight :frustration :headbutt :hidden-power :hyper-beam :iron-tail :protect :pursuit :rain-dance :rest :return :roar :rock-smash :sandstorm :scary-face :sleep-talk :snore :steel-wing :supersonic :swagger :swift :take-down :toxic :whirlwind :wing-attack])

(deflearnset :rs
  :aerodactyl [:aerial-ace :agility :ancientpower :attract :bite :curse :double-edge :double-team :dragon-claw :dragonbreath :earthquake :endure :facade :fire-blast :flamethrower :fly :foresight :frustration :hidden-power :hyper-beam :iron-tail :mimic :protect :pursuit :rain-dance :rest :return :roar :rock-slide :rock-smash :rock-tomb :sandstorm :scary-face :secret-power :sky-attack :sleep-talk :snore :steel-wing :strength :substitute :sunny-day :supersonic :swagger :swift :take-down :taunt :thief :torment :toxic :whirlwind :wing-attack])

(deflearnset :dp
  :aerodactyl [:aerial-ace :agility :air-cutter :ancientpower :aqua-tail :assurance :attract :bite :captivate :crunch :curse :defog :double-team :dragon-claw :dragon-pulse :dragonbreath :earth-power :earthquake :endure :facade :fire-blast :fire-fang :flamethrower :fly :foresight :frustration :giga-impact :headbutt :heat-wave :hidden-power :hyper-beam :ice-fang :iron-head :iron-tail :natural-gift :ominous-wind :payback :protect :pursuit :rain-dance :rest :return :roar :rock-polish :rock-slide :rock-smash :rock-tomb :roost :sandstorm :scary-face :secret-power :sky-attack :sleep-talk :snore :stealth-rock :steel-wing :stone-edge :strength :substitute :sunny-day :supersonic :swagger :swift :tailwind :take-down :taunt :thief :thunder-fang :torment :toxic :twister :whirlwind :wing-attack])

(deflearnset :bw
  :aerodactyl [:aerial-ace :agility :ancientpower :aqua-tail :assurance :attract :bite :bulldoze :crunch :curse :double-team :dragon-claw :dragon-pulse :dragonbreath :earth-power :earthquake :facade :fire-blast :fire-fang :flamethrower :fly :foresight :frustration :giga-impact :heat-wave :hidden-power :hone-claws :hyper-beam :ice-fang :incinerate :iron-head :iron-tail :payback :protect :pursuit :rain-dance :rest :return :roar :rock-polish :rock-slide :rock-smash :rock-tomb :roost :round :sandstorm :scary-face :sky-attack :sky-drop :sleep-talk :smack-down :snore :stealth-rock :steel-wing :stone-edge :strength :substitute :sunny-day :supersonic :swagger :tailwind :take-down :taunt :thief :thunder-fang :torment :toxic :whirlwind :wing-attack])




(deflearnset :rb
  :ditto [:transform])

(deflearnset :gs
  :ditto [:transform])

(deflearnset :rs
  :ditto [:transform])

(deflearnset :dp
  :ditto [:transform])

(deflearnset :bw
  :ditto [:transform])




(deflearnset :rb
  :farfetchd [:agility :bide :body-slam :cut :double-edge :double-team :fly :fury-attack :leer :mimic :peck :rage :razor-wind :reflect :rest :sand-attack :skull-bash :slash :substitute :swift :swords-dance :take-down :toxic :whirlwind])

(deflearnset :gs
  :farfetchd [:agility :attract :curse :cut :detect :double-team :endure :false-swipe :flail :fly :foresight :frustration :fury-attack :gust :headbutt :hidden-power :iron-tail :leer :mirror-move :mud-slap :peck :protect :psych-up :quick-attack :rest :return :sand-attack :slash :sleep-talk :snore :steel-wing :sunny-day :swagger :swift :swords-dance :thief :toxic])

(deflearnset :rs
  :farfetchd [:aerial-ace :agility :attract :body-slam :curse :cut :double-edge :double-team :endure :facade :false-swipe :featherdance :flail :fly :foresight :frustration :fury-attack :fury-cutter :gust :hidden-power :iron-tail :knock-off :leer :mimic :mirror-move :mud-slap :peck :protect :psych-up :quick-attack :rest :return :sand-attack :secret-power :slash :sleep-talk :snore :steel-wing :substitute :sunny-day :swagger :swift :swords-dance :thief :toxic])

(deflearnset :dp
  :farfetchd [:aerial-ace :agility :air-cutter :air-slash :attract :captivate :covet :curse :cut :defog :double-team :endure :facade :false-swipe :featherdance :feint :flail :fly :foresight :frustration :fury-attack :fury-cutter :gust :headbutt :heat-wave :hidden-power :iron-tail :knock-off :last-resort :leaf-blade :leer :mirror-move :mud-slap :natural-gift :night-slash :ominous-wind :peck :pluck :poison-jab :protect :psych-up :quick-attack :rest :return :roost :sand-attack :secret-power :slash :sleep-talk :snore :steel-wing :substitute :sunny-day :swagger :swift :swords-dance :thief :toxic :twister :u-turn :uproar])

(deflearnset :bw
  :farfetchd [:acrobatics :aerial-ace :agility :air-cutter :air-slash :attract :brave-bird :covet :curse :cut :double-team :facade :false-swipe :featherdance :feint :flail :fly :foresight :frustration :fury-attack :fury-cutter :gust :heat-wave :helping-hand :hidden-power :iron-tail :knock-off :last-resort :leaf-blade :leer :mirror-move :mud-slap :night-slash :peck :pluck :poison-jab :protect :psych-up :quick-attack :rest :retaliate :return :revenge :roost :round :sand-attack :sky-attack :slash :sleep-talk :snore :steel-wing :substitute :sunny-day :swagger :swords-dance :tailwind :thief :toxic :trump-card :u-turn :uproar :work-up])




(deflearnset :rb
  :kangaskhan [:bide :bite :blizzard :body-slam :bubblebeam :comet-punch :counter :dizzy-punch :double-edge :double-team :earthquake :fire-blast :fissure :hyper-beam :ice-beam :leer :mega-kick :mega-punch :mimic :rage :rest :rock-slide :seismic-toss :skull-bash :strength :submission :substitute :surf :tail-whip :take-down :thunder :thunderbolt :toxic :water-gun])

(deflearnset :gs
  :kangaskhan [:attract :bite :blizzard :comet-punch :curse :disable :dizzy-punch :double-team :dynamicpunch :earthquake :endure :fire-blast :fire-punch :flamethrower :focus-energy :foresight :frustration :fury-cutter :headbutt :hidden-power :hyper-beam :ice-beam :ice-punch :icy-wind :iron-tail :leer :mega-punch :mud-slap :protect :rage :rain-dance :rest :return :reversal :roar :rock-smash :safeguard :sandstorm :shadow-ball :sleep-talk :snore :stomp :strength :sunny-day :surf :swagger :tail-whip :thunder :thunderbolt :thunderpunch :toxic :zap-cannon])

(deflearnset :rs
  :kangaskhan [:aerial-ace :attract :bite :blizzard :body-slam :brick-break :comet-punch :counter :crush-claw :cut :dig :disable :dizzy-punch :double-edge :double-team :dynamicpunch :earthquake :endure :facade :fake-out :fire-blast :fire-punch :flamethrower :focus-energy :focus-punch :foresight :frustration :fury-cutter :hail :hidden-power :hyper-beam :ice-beam :ice-punch :icy-wind :iron-tail :leer :mega-kick :mega-punch :mimic :mud-slap :protect :rage :rain-dance :rest :return :reversal :roar :rock-slide :rock-smash :rock-tomb :safeguard :sandstorm :secret-power :seismic-toss :shadow-ball :shock-wave :sleep-talk :snore :solarbeam :stomp :strength :substitute :sunny-day :surf :swagger :tail-whip :thief :thunder :thunderbolt :thunderpunch :toxic :water-pulse])

(deflearnset :dp
  :kangaskhan [:aerial-ace :aqua-tail :attract :avalanche :bite :blizzard :brick-break :captivate :comet-punch :counter :crunch :crush-claw :cut :dig :disable :dizzy-punch :double-edge :double-hit :double-team :drain-punch :earthquake :endeavor :endure :facade :fake-out :fire-blast :fire-punch :flamethrower :fling :focus-blast :focus-energy :focus-punch :foresight :frustration :fury-cutter :giga-impact :hail :hammer-arm :headbutt :helping-hand :hidden-power :hyper-beam :ice-beam :ice-punch :icy-wind :iron-tail :leer :low-kick :mega-punch :mud-slap :natural-gift :outrage :protect :rage :rain-dance :rest :return :reversal :roar :rock-climb :rock-slide :rock-smash :rock-tomb :safeguard :sandstorm :secret-power :shadow-ball :shadow-claw :shock-wave :sleep-talk :snore :solarbeam :spite :stomp :strength :substitute :sucker-punch :sunny-day :surf :swagger :tail-whip :thief :thunder :thunderbolt :thunderpunch :toxic :uproar :water-pulse :whirlpool])

(deflearnset :bw
  :kangaskhan [:aerial-ace :aqua-tail :attract :bite :blizzard :brick-break :bulldoze :chip-away :circle-throw :comet-punch :counter :covet :crunch :crush-claw :cut :dig :disable :dizzy-punch :double-edge :double-hit :double-team :drain-punch :earthquake :endeavor :endure :facade :fake-out :fire-blast :fire-punch :flamethrower :fling :focus-blast :focus-energy :focus-punch :foresight :frustration :giga-impact :hail :hammer-arm :helping-hand :hidden-power :hyper-beam :ice-beam :ice-punch :icy-wind :incinerate :iron-tail :leer :low-kick :mega-punch :outrage :protect :rage :rain-dance :rest :retaliate :return :reversal :roar :rock-slide :rock-smash :rock-tomb :round :safeguard :sandstorm :shadow-ball :shadow-claw :sleep-talk :snore :solarbeam :spite :stomp :strength :substitute :sucker-punch :sunny-day :surf :swagger :tail-whip :thief :thunder :thunderbolt :thunderpunch :toxic :trump-card :uproar :work-up])




(deflearnset :rb
  :lapras [:bide :blizzard :body-slam :bubblebeam :confuse-ray :double-edge :double-team :dragon-rage :growl :horn-drill :hydro-pump :hyper-beam :ice-beam :mimic :mist :psychic :psywave :rage :reflect :rest :sing :skull-bash :solarbeam :strength :substitute :surf :take-down :thunder :thunderbolt :toxic :water-gun])

(deflearnset :gs
  :lapras [:attract :aurora-beam :blizzard :body-slam :confuse-ray :curse :double-team :dragonbreath :dream-eater :endure :foresight :frustration :growl :headbutt :hidden-power :hydro-pump :hyper-beam :ice-beam :icy-wind :iron-tail :mist :nightmare :perish-song :protect :psychic :rain-dance :rest :return :rock-smash :safeguard :sing :sleep-talk :snore :strength :surf :swagger :thunder :thunderbolt :toxic :water-gun :whirlpool :zap-cannon])

(deflearnset :rs
  :lapras [:attract :blizzard :body-slam :confuse-ray :curse :dive :double-edge :double-team :dragon-dance :dream-eater :endure :facade :foresight :frustration :growl :hail :hidden-power :horn-drill :hydro-pump :hyper-beam :ice-beam :icy-wind :iron-tail :mimic :mist :nightmare :perish-song :protect :psychic :rain-dance :refresh :rest :return :roar :rock-smash :safeguard :secret-power :sheer-cold :shock-wave :sing :sleep-talk :snore :strength :substitute :surf :swagger :thunder :thunderbolt :tickle :toxic :water-gun :water-pulse :waterfall])

(deflearnset :dp
  :lapras [:ancientpower :aqua-tail :attract :avalanche :blizzard :block :body-slam :brine :captivate :confuse-ray :curse :dive :double-team :dragon-dance :dragon-pulse :dream-eater :endure :facade :fissure :foresight :frustration :giga-impact :growl :hail :headbutt :heal-bell :hidden-power :horn-drill :hydro-pump :hyper-beam :ice-beam :ice-shard :icy-wind :iron-head :iron-tail :mist :natural-gift :outrage :perish-song :protect :psychic :rain-dance :refresh :rest :return :roar :rock-smash :safeguard :secret-power :sheer-cold :shock-wave :signal-beam :sing :sleep-talk :snore :strength :substitute :surf :swagger :thunder :thunderbolt :tickle :toxic :water-gun :water-pulse :waterfall :whirlpool :zen-headbutt])

(deflearnset :bw
  :lapras [:ancientpower :aqua-tail :attract :avalanche :blizzard :block :body-slam :brine :bulldoze :confuse-ray :curse :dive :double-team :dragon-dance :dragon-pulse :dream-eater :drill-run :echoed-voice :facade :fissure :foresight :frost-breath :frustration :future-sight :giga-impact :growl :hail :heal-bell :hidden-power :horn-drill :hydro-pump :hyper-beam :hyper-voice :ice-beam :ice-shard :icy-wind :iron-head :iron-tail :mist :outrage :perish-song :protect :psychic :rain-dance :refresh :rest :return :roar :rock-smash :round :safeguard :sheer-cold :signal-beam :sing :sleep-talk :snore :strength :substitute :surf :swagger :thunder :thunderbolt :tickle :toxic :water-gun :water-pulse :waterfall :whirlpool :zen-headbutt])




(deflearnset :rb
  :mew [:bide :blizzard :body-slam :bubblebeam :counter :cut :dig :double-edge :double-team :dragon-rage :dream-eater :earthquake :egg-bomb :explosion :fire-blast :fissure :flash :fly :horn-drill :hyper-beam :ice-beam :mega-drain :mega-kick :mega-punch :metronome :mimic :pay-day :pound :psychic :psywave :rage :razor-wind :reflect :rest :rock-slide :seismic-toss :selfdestruct :skull-bash :sky-attack :softboiled :solarbeam :strength :submission :substitute :surf :swift :swords-dance :take-down :teleport :thunder :thunder-wave :thunderbolt :toxic :transform :tri-attack :water-gun :whirlwind])

(deflearnset :gs
  :mew [:ancientpower :attract :blizzard :curse :cut :defense-curl :detect :dig :double-team :dragonbreath :dream-eater :dynamicpunch :earthquake :endure :fire-blast :fire-punch :flamethrower :flash :fly :frustration :fury-cutter :giga-drain :headbutt :hidden-power :hyper-beam :ice-beam :ice-punch :icy-wind :iron-tail :mega-punch :metronome :mud-slap :nightmare :pound :protect :psych-up :psychic :rain-dance :rest :return :roar :rock-smash :rollout :sandstorm :shadow-ball :sleep-talk :sludge-bomb :snore :solarbeam :steel-wing :strength :sunny-day :surf :swagger :sweet-scent :swift :thief :thunder :thunderbolt :thunderpunch :toxic :transform :waterfall :whirlpool :zap-cannon])

(deflearnset :rs
  :mew [:aerial-ace :ancientpower :attract :blizzard :body-slam :brick-break :bulk-up :bullet-seed :calm-mind :counter :cut :defense-curl :dig :dive :double-edge :double-team :dragon-claw :dream-eater :dynamicpunch :earthquake :endure :explosion :facade :faint-attack :fake-out :fire-blast :fire-punch :flamethrower :flash :fly :focus-punch :frustration :fury-cutter :giga-drain :hail :hidden-power :hyper-beam :hypnosis :ice-beam :ice-punch :icy-wind :iron-tail :light-screen :mega-kick :mega-punch :metronome :mimic :mud-slap :night-shade :nightmare :overheat :pound :protect :psych-up :psychic :rain-dance :reflect :rest :return :roar :rock-slide :rock-smash :rock-tomb :role-play :rollout :safeguard :sandstorm :secret-power :seismic-toss :selfdestruct :shadow-ball :shock-wave :skill-swap :sky-attack :sleep-talk :sludge-bomb :snatch :snore :softboiled :solarbeam :steel-wing :strength :substitute :sunny-day :surf :swagger :swift :swords-dance :taunt :thief :thunder :thunder-wave :thunderbolt :thunderpunch :torment :toxic :transform :water-pulse :waterfall :zap-cannon])

(deflearnset :dp
  :mew [:aerial-ace :air-cutter :amnesia :ancientpower :aqua-tail :attract :aura-sphere :avalanche :barrier :baton-pass :blizzard :block :bounce :brick-break :brine :bug-bite :bulk-up :bullet-seed :calm-mind :captivate :charge-beam :cut :dark-pulse :defog :dig :dive :double-team :dragon-claw :dragon-pulse :drain-punch :dream-eater :earth-power :earthquake :embargo :endeavor :endure :energy-ball :explosion :facade :false-swipe :fire-blast :fire-punch :flamethrower :flash :flash-cannon :fling :fly :focus-blast :focus-punch :frustration :fury-cutter :gastro-acid :giga-drain :giga-impact :grass-knot :gravity :gunk-shot :gyro-ball :hail :headbutt :heal-bell :heat-wave :helping-hand :hidden-power :hyper-beam :ice-beam :ice-punch :icy-wind :iron-defense :iron-head :iron-tail :knock-off :last-resort :light-screen :low-kick :magic-coat :magnet-rise :me-first :mega-punch :metronome :mud-slap :nasty-plot :natural-gift :ominous-wind :outrage :overheat :pain-split :payback :pluck :poison-jab :pound :protect :psych-up :psychic :rain-dance :recycle :reflect :rest :return :roar :rock-climb :rock-polish :rock-slide :rock-smash :rock-tomb :role-play :rollout :roost :safeguard :sandstorm :secret-power :seed-bomb :shadow-ball :shadow-claw :shock-wave :signal-beam :silver-wind :skill-swap :sky-attack :sleep-talk :sludge-bomb :snatch :snore :solarbeam :spite :stealth-rock :steel-wing :stone-edge :strength :string-shot :substitute :sucker-punch :sunny-day :super-fang :superpower :surf :swagger :swift :swords-dance :synthesis :tailwind :taunt :thief :thunder :thunder-wave :thunderbolt :thunderpunch :torment :toxic :transform :trick :trick-room :twister :u-turn :uproar :vacuum-wave :water-pulse :waterfall :whirlpool :will-o-wisp :worry-seed :x-scissor :zen-headbutt])

(deflearnset :bw
  :mew [:acrobatics :aerial-ace :after-you :ally-switch :amnesia :ancientpower :aqua-tail :attract :aura-sphere :barrier :baton-pass :bind :blizzard :block :bounce :brick-break :bug-bite :bulk-up :bulldoze :calm-mind :charge-beam :covet :cut :dark-pulse :dig :dive :double-team :dragon-claw :dragon-pulse :dragon-tail :drain-punch :dream-eater :drill-run :dual-chop :earth-power :earthquake :echoed-voice :electroweb :embargo :endeavor :energy-ball :explosion :facade :false-swipe :fire-blast :fire-punch :flame-charge :flamethrower :flash :flash-cannon :fling :fly :focus-blast :foul-play :frost-breath :frustration :gastro-acid :giga-drain :giga-impact :grass-knot :gravity :gunk-shot :gyro-ball :hail :heal-bell :heat-wave :helping-hand :hidden-power :hone-claws :hyper-beam :hyper-voice :ice-beam :ice-punch :icy-wind :incinerate :iron-defense :iron-head :iron-tail :knock-off :last-resort :light-screen :low-kick :low-sweep :magic-coat :magic-room :magnet-rise :me-first :mega-punch :metronome :nasty-plot :outrage :overheat :pain-split :payback :pluck :poison-jab :pound :protect :psych-up :psychic :psyshock :quash :rain-dance :recycle :reflect :reflect-type :rest :retaliate :return :roar :rock-polish :rock-slide :rock-smash :rock-tomb :role-play :roost :round :safeguard :sandstorm :scald :seed-bomb :shadow-ball :shadow-claw :signal-beam :skill-swap :sky-attack :sky-drop :sleep-talk :sludge-bomb :sludge-wave :smack-down :snarl :snatch :snore :solarbeam :spite :stealth-rock :stone-edge :strength :struggle-bug :substitute :sunny-day :super-fang :superpower :surf :swagger :swords-dance :synthesis :tailwind :taunt :telekinesis :thief :thunder :thunder-wave :thunderbolt :thunderpunch :torment :toxic :transform :trick :trick-room :u-turn :uproar :venoshock :volt-switch :waterfall :wild-charge :will-o-wisp :wonder-room :work-up :worry-seed :x-scissor :zen-headbutt])




(deflearnset :rb
  :mewtwo [:amnesia :barrier :bide :blizzard :body-slam :bubblebeam :confusion :counter :disable :double-edge :double-team :fire-blast :flash :hyper-beam :ice-beam :mega-kick :mega-punch :metronome :mimic :mist :pay-day :psychic :psywave :rage :recover :reflect :rest :seismic-toss :selfdestruct :skull-bash :solarbeam :strength :submission :substitute :swift :take-down :teleport :thunder :thunder-wave :thunderbolt :toxic :tri-attack :water-gun])

(deflearnset :gs
  :mewtwo [:amnesia :barrier :blizzard :confusion :curse :detect :disable :double-team :dream-eater :dynamicpunch :endure :fire-blast :fire-punch :flamethrower :flash :frustration :future-sight :headbutt :hidden-power :hyper-beam :ice-beam :ice-punch :icy-wind :iron-tail :mist :mud-slap :nightmare :protect :psych-up :psychic :rain-dance :recover :rest :return :rock-smash :safeguard :shadow-ball :sleep-talk :snore :solarbeam :strength :sunny-day :swagger :swift :thunder :thunderbolt :thunderpunch :toxic :zap-cannon])

(deflearnset :rs
  :mewtwo [:aerial-ace :amnesia :barrier :blizzard :body-slam :brick-break :bulk-up :calm-mind :confusion :counter :disable :double-edge :double-team :dream-eater :dynamicpunch :earthquake :endure :facade :fire-blast :fire-punch :flamethrower :flash :focus-punch :frustration :future-sight :hail :hidden-power :hyper-beam :ice-beam :ice-punch :icy-wind :iron-tail :light-screen :mega-kick :mega-punch :metronome :mimic :mist :mud-slap :nightmare :protect :psych-up :psychic :rain-dance :recover :reflect :rest :return :rock-smash :rock-tomb :safeguard :sandstorm :secret-power :seismic-toss :selfdestruct :shadow-ball :shock-wave :skill-swap :sleep-talk :snatch :snore :solarbeam :strength :substitute :sunny-day :swagger :swift :taunt :thunder :thunder-wave :thunderbolt :thunderpunch :torment :toxic :water-pulse])

(deflearnset :dp
  :mewtwo [:aerial-ace :amnesia :aqua-tail :aura-sphere :avalanche :barrier :blizzard :brick-break :bulk-up :calm-mind :charge-beam :confusion :disable :double-team :drain-punch :dream-eater :earthquake :embargo :endure :energy-ball :facade :fire-blast :fire-punch :flamethrower :flash :fling :focus-blast :focus-punch :frustration :future-sight :giga-impact :grass-knot :gravity :guard-swap :hail :headbutt :hidden-power :hyper-beam :ice-beam :ice-punch :icy-wind :iron-tail :light-screen :low-kick :magic-coat :me-first :miracle-eye :mist :mud-slap :natural-gift :poison-jab :power-swap :protect :psych-up :psychic :psycho-cut :rain-dance :recover :recycle :reflect :rest :return :rock-climb :rock-slide :rock-smash :rock-tomb :role-play :safeguard :sandstorm :secret-power :shadow-ball :shock-wave :signal-beam :skill-swap :sleep-talk :snatch :snore :solarbeam :stone-edge :strength :substitute :sunny-day :swagger :swift :taunt :thunder :thunder-wave :thunderbolt :thunderpunch :torment :toxic :trick :trick-room :water-pulse :will-o-wisp :zen-headbutt])

(deflearnset :bw
  :mewtwo [:aerial-ace :amnesia :aqua-tail :aura-sphere :barrier :blizzard :brick-break :bulk-up :bulldoze :calm-mind :charge-beam :confusion :disable :double-team :drain-punch :dream-eater :earthquake :embargo :energy-ball :facade :fire-blast :fire-punch :flamethrower :flash :fling :focus-blast :foul-play :frustration :future-sight :giga-impact :grass-knot :gravity :guard-swap :hail :hidden-power :hyper-beam :ice-beam :ice-punch :icy-wind :incinerate :iron-tail :light-screen :low-kick :low-sweep :magic-coat :magic-room :me-first :miracle-eye :mist :poison-jab :power-swap :protect :psych-up :psychic :psycho-cut :psyshock :psystrike :rain-dance :recover :recycle :reflect :rest :return :rock-slide :rock-smash :rock-tomb :role-play :round :safeguard :sandstorm :shadow-ball :signal-beam :skill-swap :sleep-talk :snatch :snore :solarbeam :stone-edge :strength :substitute :sunny-day :swagger :swift :taunt :telekinesis :thunder :thunder-wave :thunderbolt :thunderpunch :torment :toxic :trick :trick-room :will-o-wisp :wonder-room :zen-headbutt])

(deflearnset :rb
  :pinsir [:bide :bind :body-slam :cut :double-edge :double-team :focus-energy :guillotine :harden :hyper-beam :mimic :rage :rest :seismic-toss :slash :strength :submission :substitute :swords-dance :take-down :toxic :vicegrip])

(deflearnset :gs
  :pinsir [:attract :bind :curse :cut :double-team :endure :flail :focus-energy :frustration :fury-attack :fury-cutter :guillotine :harden :headbutt :hidden-power :hyper-beam :protect :rest :return :rock-smash :seismic-toss :sleep-talk :snore :strength :submission :sunny-day :swagger :swords-dance :thief :toxic :vicegrip])

(deflearnset :rs
  :pinsir [:attract :bind :body-slam :brick-break :bulk-up :cut :dig :double-edge :double-team :earthquake :endure :facade :faint-attack :false-swipe :flail :focus-energy :focus-punch :frustration :fury-attack :fury-cutter :guillotine :harden :hidden-power :hyper-beam :mimic :protect :rain-dance :rest :return :revenge :rock-slide :rock-smash :rock-tomb :secret-power :seismic-toss :sleep-talk :snore :strength :submission :substitute :sunny-day :swagger :swords-dance :thief :toxic :vicegrip])

(deflearnset :dp
  :pinsir [:attract :bind :brick-break :bulk-up :captivate :close-combat :cut :dig :double-team :earthquake :endure :facade :faint-attack :false-swipe :feint :flail :fling :focus-blast :focus-energy :focus-punch :frustration :fury-attack :fury-cutter :giga-impact :guillotine :harden :headbutt :hidden-power :hyper-beam :iron-defense :knock-off :natural-gift :protect :quick-attack :rain-dance :rest :return :revenge :rock-climb :rock-slide :rock-smash :rock-tomb :secret-power :seismic-toss :sleep-talk :snore :stealth-rock :stone-edge :strength :string-shot :submission :substitute :sunny-day :superpower :swagger :swords-dance :thief :thrash :toxic :vicegrip :vital-throw :x-scissor])

(deflearnset :bw
  :pinsir [:attract :bind :brick-break :bug-bite :bulk-up :bulldoze :close-combat :cut :dig :double-team :earthquake :facade :faint-attack :false-swipe :feint :flail :fling :focus-blast :focus-energy :frustration :fury-attack :giga-impact :guillotine :harden :hidden-power :hyper-beam :iron-defense :knock-off :me-first :protect :quick-attack :rain-dance :rest :return :revenge :rock-slide :rock-smash :rock-tomb :round :seismic-toss :sleep-talk :smack-down :snore :stealth-rock :stone-edge :storm-throw :strength :struggle-bug :submission :substitute :sunny-day :superpower :swagger :swords-dance :thief :thrash :toxic :vicegrip :vital-throw :x-scissor])

(deflearnset :rb
  :tauros [:bide :blizzard :body-slam :double-edge :double-team :earthquake :fire-blast :fissure :horn-drill :hyper-beam :ice-beam :leer :mimic :rage :rest :skull-bash :stomp :strength :substitute :tackle :tail-whip :take-down :thunder :thunderbolt :toxic])

(deflearnset :gs
  :tauros [:attract :blizzard :curse :double-team :earthquake :endure :fire-blast :flamethrower :frustration :headbutt :hidden-power :horn-attack :hyper-beam :ice-beam :icy-wind :iron-tail :protect :pursuit :rage :rest :return :rock-smash :scary-face :sleep-talk :snore :strength :sunny-day :surf :swagger :tackle :tail-whip :take-down :thrash :thunder :thunderbolt :toxic :zap-cannon])

(deflearnset :rs
  :tauros [:attract :blizzard :body-slam :double-edge :double-team :earthquake :endure :facade :fire-blast :flamethrower :frustration :hidden-power :horn-attack :hyper-beam :ice-beam :icy-wind :iron-tail :mimic :protect :pursuit :rage :rain-dance :rest :return :rock-smash :rock-tomb :sandstorm :scary-face :secret-power :shock-wave :sleep-talk :snore :solarbeam :strength :substitute :sunny-day :surf :swagger :tackle :tail-whip :take-down :thrash :thunder :thunderbolt :toxic :water-pulse])

(deflearnset :dp
  :tauros [:attract :blizzard :captivate :double-team :earthquake :endeavor :endure :facade :fire-blast :flamethrower :frustration :giga-impact :headbutt :helping-hand :hidden-power :horn-attack :hyper-beam :ice-beam :icy-wind :iron-head :iron-tail :natural-gift :outrage :payback :protect :pursuit :rage :rain-dance :rest :return :rock-climb :rock-slide :rock-smash :rock-tomb :role-play :sandstorm :scary-face :secret-power :shock-wave :sleep-talk :snore :solarbeam :spite :stone-edge :strength :substitute :sunny-day :surf :swagger :tackle :tail-whip :take-down :thrash :thunder :thunderbolt :toxic :uproar :water-pulse :whirlpool :zen-headbutt])

(deflearnset :bw
  :tauros [:attract :blizzard :bulldoze :double-team :earthquake :endeavor :facade :fire-blast :flamethrower :frustration :giga-impact :helping-hand :hidden-power :horn-attack :hyper-beam :ice-beam :icy-wind :incinerate :iron-head :iron-tail :outrage :payback :protect :pursuit :rage :rain-dance :rest :retaliate :return :rock-slide :rock-smash :rock-tomb :role-play :round :sandstorm :scary-face :sleep-talk :snore :solarbeam :spite :stone-edge :strength :substitute :sunny-day :surf :swagger :tackle :tail-whip :take-down :thrash :thunder :thunderbolt :toxic :uproar :wild-charge :work-up :zen-headbutt])

(deflearnset :rb
  :zapdos [:agility :bide :double-edge :double-team :drill-peck :flash :fly :hyper-beam :light-screen :mimic :rage :razor-wind :reflect :rest :sky-attack :substitute :swift :take-down :thunder :thunder-wave :thunderbolt :thundershock :toxic :whirlwind])

(deflearnset :gs
  :zapdos [:agility :curse :detect :double-team :drill-peck :endure :flash :fly :frustration :hidden-power :hyper-beam :light-screen :mud-slap :peck :protect :rain-dance :rest :return :roar :rock-smash :sandstorm :sleep-talk :snore :steel-wing :sunny-day :swagger :swift :thunder :thunder-wave :thunderbolt :thundershock :toxic :zap-cannon])

(deflearnset :rs
  :zapdos [:aerial-ace :agility :charge :detect :double-edge :double-team :drill-peck :endure :facade :flash :fly :frustration :hidden-power :hyper-beam :light-screen :mimic :mud-slap :peck :protect :rain-dance :rest :return :roar :rock-smash :sandstorm :secret-power :shock-wave :sky-attack :sleep-talk :snore :steel-wing :substitute :sunny-day :swagger :swift :thunder :thunder-wave :thunderbolt :thundershock :toxic])

(deflearnset :dp
  :zapdos [:aerial-ace :agility :air-cutter :ancientpower :charge :charge-beam :defog :detect :discharge :double-team :drill-peck :endure :facade :flash :fly :frustration :giga-impact :heat-wave :hidden-power :hyper-beam :light-screen :mud-slap :natural-gift :ominous-wind :peck :pluck :protect :rain-dance :rest :return :roar :rock-smash :roost :sandstorm :secret-power :shock-wave :signal-beam :sky-attack :sleep-talk :snore :steel-wing :substitute :sunny-day :swagger :swift :tailwind :thunder :thunder-wave :thunderbolt :thundershock :toxic :twister :u-turn])

(deflearnset :bw
  :zapdos [:aerial-ace :agility :ancientpower :charge :charge-beam :detect :discharge :double-team :drill-peck :facade :flash :fly :frustration :giga-impact :heat-wave :hidden-power :hyper-beam :light-screen :peck :pluck :protect :rain-dance :rest :return :roar :rock-smash :roost :round :sandstorm :signal-beam :sky-attack :sky-drop :sleep-talk :snore :substitute :sunny-day :swagger :tailwind :thunder :thunder-wave :thunderbolt :thundershock :toxic :u-turn :volt-switch :wild-charge :zap-cannon])
