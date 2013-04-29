
(defpokemon :corsola
  :name "Corsola"
  :introduced-in :gs
  :types [[:rock :water]]
  :egggroups [[:water-1 :water-3]]
  :abilities [[:hustle :natural-cure]
              :bw [:hustle :natural-cure :regenerator]]
  :stats [[55 55 85 65 85 35]]
  :weight [5]
  :height [0.6])

(defpokemon :delibird
  :name "Delibird"
  :introduced-in :gs   
  :types [[:flying :ice]]
  :egggroups [[:ground :water-1]]
  :abilities [[:hustle :vital-spirit]
              :bw [:hustle :insomnia :vital-spirit]]
  :stats [[45 55 45 65 45 75]]
  :weight [16]
  :height [0.9])

(defpokemon :dunsparce
  :name "Dunsparce"
  :introduced-in :gs
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:run-away :serene-grace]
              :bw [:rattled :run-away :serene-grace]]
  :stats [[100 70 70 65 65 45]]
  :weight [14]
  :height [1.5])

(defpokemon :girafarig
  :name "Girafarig"
  :introduced-in :gs
  :types [[:normal :psychic]]
  :egggroups [[:ground]]
  :abilities [[:early-bird :inner-focus]
              :bw [:early-bird :inner-focus :sap-sipper]]
  :stats [[70 80 65 90 65 85]]
  :weight [41.5]
  :height [1.5])

(defpokemon :heracross
  :name "Heracross"
  :introduced-in :gs
  :types [[:bug :fighting]]
  :egggroups [[:bug]]
  :abilities [[:guts :swarm]
              :bw [:guts :moxie :swarm]]
  :stats [[80 125 75 40 95 85]]
  :weight [54]
  :height [1.5])

(defpokemon :miltank
  :name "Miltank"
  :introduced-in :gs
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:thick-fat]
              :dp [:scrappy :thick-fat]
              :bw [:sap-sipper :scrappy :thick-fat]]
  :stats [[95 80 105 40 70 100]]
  :weight [75.5]
  :height [1.2])

(defpokemon :qwilfish
  :name "Qwilfish"
  :introduced-in :gs
  :types [[:poison :water]]
  :egggroups [[:water-2]]
  :abilities [[:poison-point :swift-swim]
              :bw [:intimidate :poison-point :swift-swim]]
  :stats [[65 95 75 55 55 85]]
  :weight [3.9]
  :height [0.5])

(defpokemon :shuckle
  :name "Shuckle"
  :introduced-in :gs
  :types [[:bug :rock]]
  :egggroups [[:bug]]
  :abilities [[:sturdy]
              :dp [:gluttony :sturdy]
              :bw [:contrary :gluttony :sturdy]]
  :stats [[20 10 230 10 230 5]]
  :weight [20.5]
  :height [0.6])

(defpokemon :skarmory
  :name "Skarmory"
  :introduced-in :gs
  :types [[:flying :steel]]
  :egggroups [[:flying]]
  :abilities [[:keen-eye :sturdy]
              :bw [:keen-eye :sturdy :weak-armor]]
  :stats [[65 80 140 40 70 70]]
  :weight [50.5]
  :height [1.7])

(defpokemon :smeargle
  :name "Smeargle"
  :introduced-in :gs
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:own-tempo]
              :dp [:own-tempo :technician]
              :bw [:moody :own-tempo :technician]]
  :stats [[55 20 35 20 45 75]]
  :weight [58]
  :height [1.2])

(defpokemon :stantler
  :name "Stantler"
  :introduced-in :gs
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:intimidate]
              :dp [:frisk :intimidate]
              :bw [:frisk :intimidate :sap-sipper]]
  :stats [[73 95 62 85 65 85]]
  :weight [71.2]
  :height [1.4])

(defpokemon :unown
  :name "Unown"
  :introduced-in :gs
  :types [[:psychic]]
  :egggroups [[]]
  :abilities [[:levitate]
              :bw [:levitate]]
  :stats [[48 72 48 72 48 48]]
  :weight [5]
  :height [0.5])

(deffamily :corsola)
(deffamily :delibird)
(deffamily :dunsparce)
(deffamily :girafarig)
(deffamily :heracross)
(deffamily :miltank)
(deffamily :qwilfish)
(deffamily :shuckle)
(deffamily :skarmory)
(deffamily :smeargle)
(deffamily :stantler)
(deffamily :unown)

(deflearnset :gs
  :corsola [:amnesia :ancientpower :attract :bubble :bubblebeam :curse :defense-curl :double-team :earthquake :endure :frustration :harden :headbutt :hidden-power :ice-beam :mirror-coat :mist :mud-slap :protect :psychic :rain-dance :recover :rest :return :rock-slide :rock-smash :rollout :safeguard :sandstorm :screech :sleep-talk :snore :spike-cannon :strength :sunny-day :surf :swagger :tackle :toxic :whirlpool])

(deflearnset :rs
  :corsola [:amnesia :ancientpower :attract :barrier :blizzard :body-slam :bubble :bubblebeam :calm-mind :confuse-ray :defense-curl :dig :double-edge :double-team :earthquake :endure :explosion :facade :frustration :hail :harden :hidden-power :ice-beam :icicle-spear :ingrain :light-screen :mimic :mirror-coat :mist :mud-slap :protect :psychic :rain-dance :recover :reflect :refresh :rest :return :rock-blast :rock-slide :rock-smash :rock-tomb :rollout :safeguard :sandstorm :screech :secret-power :selfdestruct :shadow-ball :sleep-talk :snore :spike-cannon :strength :substitute :sunny-day :surf :swagger :tackle :toxic :water-pulse])

(deflearnset :dp
  :corsola [:amnesia :ancientpower :aqua-ring :attract :barrier :blizzard :brine :bubble :bubblebeam :calm-mind :captivate :confuse-ray :curse :dig :double-team :earth-power :earthquake :endeavor :endure :explosion :facade :frustration :hail :harden :headbutt :hidden-power :ice-beam :icicle-spear :icy-wind :ingrain :light-screen :lucky-chant :magic-coat :mirror-coat :mist :mud-slap :natural-gift :nature-power :power-gem :protect :psychic :rain-dance :recover :reflect :refresh :rest :return :rock-blast :rock-polish :rock-slide :rock-smash :rock-tomb :rollout :safeguard :sandstorm :screech :secret-power :shadow-ball :sleep-talk :snore :spike-cannon :stealth-rock :stone-edge :strength :substitute :sucker-punch :sunny-day :surf :swagger :tackle :toxic :water-pulse :whirlpool])

(deflearnset :bw
  :corsola [:amnesia :ancientpower :aqua-ring :attract :barrier :bide :blizzard :bubble :bubblebeam :bulldoze :calm-mind :confuse-ray :curse :dig :double-team :earth-power :earthquake :endeavor :endure :explosion :facade :flail :frustration :hail :harden :head-smash :hidden-power :ice-beam :icicle-spear :icy-wind :ingrain :iron-defense :light-screen :lucky-chant :magic-coat :mirror-coat :mist :nature-power :power-gem :protect :psychic :rain-dance :recover :reflect :refresh :rest :return :rock-blast :rock-polish :rock-slide :rock-smash :rock-tomb :round :safeguard :sandstorm :scald :screech :shadow-ball :sleep-talk :snore :spike-cannon :stealth-rock :stone-edge :strength :substitute :sunny-day :surf :swagger :tackle :toxic :water-pulse])




(deflearnset :gs
  :delibird [:attract :aurora-beam :blizzard :curse :detect :double-team :endure :fly :frustration :future-sight :headbutt :hidden-power :ice-beam :icy-wind :mud-slap :present :protect :quick-attack :rain-dance :rapid-spin :rest :return :sleep-talk :snore :splash :swagger :swift :thief :toxic])

(deflearnset :rs
  :delibird [:aerial-ace :attract :aurora-beam :blizzard :body-slam :counter :double-edge :double-team :endure :facade :fly :focus-punch :frustration :future-sight :hail :hidden-power :ice-ball :ice-beam :icy-wind :mega-kick :mega-punch :mimic :mud-slap :present :protect :quick-attack :rain-dance :rapid-spin :rest :return :secret-power :seismic-toss :sky-attack :sleep-talk :snore :splash :substitute :swagger :swift :thief :toxic :water-pulse])

(deflearnset :dp
  :delibird [:aerial-ace :attract :aurora-beam :avalanche :blizzard :bounce :brick-break :captivate :defog :double-team :endure :facade :fake-out :fling :fly :focus-punch :frustration :future-sight :gunk-shot :hail :headbutt :hidden-power :ice-ball :ice-beam :ice-punch :ice-shard :icy-wind :mud-slap :natural-gift :pluck :present :protect :quick-attack :rain-dance :rapid-spin :recycle :rest :return :rollout :secret-power :seed-bomb :signal-beam :sky-attack :sleep-talk :splash :substitute :swagger :swift :thief :toxic :water-pulse])

(deflearnset :bw
  :delibird [:aerial-ace :attract :aurora-beam :bestow :blizzard :bounce :brick-break :double-team :facade :fake-out :fling :fly :frost-breath :frustration :future-sight :gunk-shot :hail :hidden-power :ice-ball :ice-beam :ice-punch :ice-shard :icy-wind :pluck :present :protect :quick-attack :rain-dance :rapid-spin :recycle :rest :return :round :seed-bomb :signal-beam :sky-attack :sleep-talk :splash :substitute :swagger :thief :toxic])




(deflearnset :gs
  :dunsparce [:ancientpower :attract :bide :bite :curse :defense-curl :dig :double-team :dream-eater :endure :flamethrower :frustration :glare :headbutt :hidden-power :iron-tail :mud-slap :nightmare :protect :psych-up :pursuit :rage :rain-dance :rest :return :rock-slide :rock-smash :rollout :screech :sleep-talk :snore :solarbeam :spite :strength :sunny-day :swagger :take-down :thief :thunder :thunderbolt :toxic :zap-cannon])

(deflearnset :rs
  :dunsparce [:ancientpower :astonish :attract :bide :bite :blizzard :body-slam :calm-mind :counter :curse :defense-curl :dig :double-edge :double-team :dream-eater :earthquake :endeavor :endure :facade :fire-blast :flail :flamethrower :frustration :glare :headbutt :hidden-power :ice-beam :iron-tail :mimic :mud-slap :nightmare :protect :psych-up :pursuit :rage :rain-dance :rest :return :rock-slide :rock-smash :rock-tomb :rollout :screech :secret-power :shadow-ball :shock-wave :sleep-talk :snore :solarbeam :spite :strength :substitute :sunny-day :swagger :take-down :thief :thunder :thunder-wave :thunderbolt :toxic :water-pulse :yawn])

(deflearnset :dp
  :dunsparce [:agility :ancientpower :aqua-tail :astonish :attract :bide :bite :blizzard :calm-mind :captivate :charge-beam :curse :defense-curl :dig :double-team :dream-eater :earthquake :endeavor :endure :facade :fire-blast :flail :flamethrower :frustration :glare :gyro-ball :headbutt :hidden-power :ice-beam :iron-tail :last-resort :magic-coat :mud-slap :natural-gift :pain-split :poison-jab :protect :psych-up :pursuit :rage :rain-dance :rest :return :rock-slide :rock-smash :rock-tomb :rollout :roost :screech :secret-power :shadow-ball :shock-wave :sleep-talk :snore :solarbeam :spite :stealth-rock :strength :substitute :sunny-day :swagger :take-down :thief :thunder :thunder-wave :thunderbolt :toxic :trump-card :water-pulse :yawn :zen-headbutt])

(deflearnset :bw
  :dunsparce [:agility :ancientpower :aqua-tail :astonish :attract :bide :bind :bite :blizzard :bulldoze :calm-mind :charge-beam :coil :curse :defense-curl :dig :double-edge :double-team :dream-eater :drill-run :earthquake :endeavor :endure :facade :fire-blast :flail :flamethrower :frustration :glare :gyro-ball :headbutt :hex :hidden-power :ice-beam :incinerate :iron-tail :last-resort :magic-coat :pain-split :poison-jab :protect :psych-up :pursuit :rage :rain-dance :rest :retaliate :return :rock-slide :rock-smash :rock-tomb :rollout :roost :round :screech :secret-power :shadow-ball :sleep-talk :snore :solarbeam :spite :stealth-rock :strength :substitute :sunny-day :swagger :take-down :thief :thunder :thunder-wave :thunderbolt :toxic :trump-card :wild-charge :yawn :zen-headbutt])




(deflearnset :gs
  :girafarig [:agility :amnesia :attract :baton-pass :beat-up :confusion :crunch :curse :double-team :dream-eater :earthquake :endure :foresight :frustration :future-sight :growl :headbutt :hidden-power :iron-tail :mud-slap :nightmare :protect :psybeam :psych-up :psychic :rest :return :rock-smash :shadow-ball :sleep-talk :snore :stomp :strength :sunny-day :swagger :swift :tackle :take-down :thief :thunder :thunderbolt :toxic :zap-cannon])

(deflearnset :rs
  :girafarig [:agility :amnesia :astonish :attract :baton-pass :beat-up :body-slam :calm-mind :confusion :crunch :double-edge :double-team :dream-eater :earthquake :endure :facade :flash :foresight :frustration :future-sight :growl :hidden-power :iron-tail :light-screen :magic-coat :mimic :mud-slap :nightmare :odor-sleuth :protect :psybeam :psych-up :psychic :rain-dance :reflect :rest :return :rock-smash :secret-power :shadow-ball :shock-wave :skill-swap :sleep-talk :snore :stomp :strength :substitute :sunny-day :swagger :swift :tackle :take-down :thief :thunder :thunder-wave :thunderbolt :toxic :wish])

(deflearnset :dp
  :girafarig [:agility :amnesia :assurance :astonish :attract :baton-pass :beat-up :calm-mind :captivate :charge-beam :confusion :crunch :double-hit :double-kick :double-team :dream-eater :earthquake :endure :energy-ball :facade :flash :foresight :frustration :future-sight :grass-knot :gravity :growl :guard-swap :headbutt :hidden-power :iron-tail :light-screen :magic-coat :mirror-coat :mud-slap :natural-gift :odor-sleuth :power-swap :protect :psybeam :psych-up :psychic :rain-dance :razor-wind :recycle :reflect :rest :return :rock-smash :secret-power :shadow-ball :shock-wave :signal-beam :skill-swap :sleep-talk :snore :stomp :strength :substitute :sucker-punch :sunny-day :swagger :swift :tackle :take-down :thief :thunder :thunder-wave :thunderbolt :toxic :trick :trick-room :uproar :wish :zen-headbutt])

(deflearnset :bw
  :girafarig [:agility :amnesia :assurance :astonish :attract :baton-pass :beat-up :bulldoze :calm-mind :charge-beam :confusion :crunch :double-hit :double-kick :double-team :dream-eater :earthquake :echoed-voice :energy-ball :facade :flash :foresight :foul-play :frustration :future-sight :grass-knot :gravity :growl :guard-swap :hidden-power :hyper-voice :iron-tail :light-screen :magic-coat :mean-look :mirror-coat :odor-sleuth :power-swap :protect :psybeam :psych-up :psychic :psyshock :rain-dance :razor-wind :recycle :reflect :rest :retaliate :return :rock-smash :round :secret-power :shadow-ball :signal-beam :skill-swap :sleep-talk :snore :stomp :strength :substitute :sunny-day :swagger :tackle :take-down :telekinesis :thief :thunder :thunder-wave :thunderbolt :toxic :trick :trick-room :uproar :wish :work-up :zen-headbutt])




(deflearnset :gs
  :heracross [:attract :bide :counter :curse :cut :detect :double-team :earthquake :endure :flail :frustration :fury-attack :fury-cutter :harden :headbutt :hidden-power :horn-attack :leer :megahorn :protect :rest :return :reversal :rock-smash :sleep-talk :snore :strength :sunny-day :swagger :tackle :take-down :thief :toxic])

(deflearnset :rs
  :heracross [:attract :bide :body-slam :brick-break :bulk-up :counter :cut :dig :double-edge :double-team :earthquake :endure :facade :false-swipe :flail :focus-punch :frustration :fury-attack :fury-cutter :harden :hidden-power :horn-attack :hyper-beam :leer :megahorn :mimic :protect :rain-dance :rest :return :reversal :rock-slide :rock-smash :rock-tomb :secret-power :seismic-toss :sleep-talk :snore :strength :substitute :sunny-day :swagger :swords-dance :tackle :take-down :thief :toxic])

(deflearnset :dp
  :heracross [:aerial-ace :attract :bide :brick-break :bug-bite :bulk-up :captivate :close-combat :counter :cut :dig :double-edge :double-team :earthquake :endure :facade :false-swipe :feint :flail :fling :focus-blast :focus-punch :frustration :fury-attack :fury-cutter :giga-impact :harden :headbutt :helping-hand :hidden-power :horn-attack :hyper-beam :iron-defense :knock-off :leer :low-kick :megahorn :natural-gift :night-slash :protect :pursuit :rain-dance :rest :return :revenge :reversal :rock-slide :rock-smash :rock-tomb :secret-power :shadow-claw :sleep-talk :snore :stone-edge :strength :substitute :sunny-day :swagger :swords-dance :tackle :take-down :thief :toxic :vacuum-wave])

(deflearnset :bw
  :heracross [:aerial-ace :attract :bide :brick-break :bug-bite :bulk-up :bulldoze :chip-away :close-combat :counter :cut :dig :double-edge :double-team :earthquake :endure :facade :false-swipe :feint :flail :fling :focus-blast :focus-punch :frustration :fury-attack :giga-impact :harden :helping-hand :hidden-power :horn-attack :hyper-beam :iron-defense :knock-off :leer :low-kick :megahorn :night-slash :protect :pursuit :rain-dance :rest :retaliate :return :revenge :reversal :rock-slide :rock-smash :rock-tomb :round :seismic-toss :shadow-claw :sleep-talk :smack-down :snore :stone-edge :strength :struggle-bug :substitute :sunny-day :swagger :swords-dance :tackle :take-down :thief :toxic :venoshock :work-up])




(deflearnset :gs
  :miltank [:attract :bide :blizzard :body-slam :curse :defense-curl :double-team :dynamicpunch :earthquake :endure :fire-punch :frustration :growl :headbutt :heal-bell :hidden-power :hyper-beam :ice-beam :ice-punch :icy-wind :iron-tail :milk-drink :mud-slap :present :protect :psych-up :rain-dance :rest :return :reversal :rock-smash :rollout :sandstorm :seismic-toss :shadow-ball :sleep-talk :snore :stomp :strength :sunny-day :surf :swagger :sweet-scent :tackle :thunder :thunderbolt :thunderpunch :toxic :zap-cannon])

(deflearnset :rs
  :miltank [:attract :bide :blizzard :body-slam :brick-break :counter :curse :defense-curl :double-edge :double-team :dynamicpunch :earthquake :endure :facade :fire-punch :focus-punch :frustration :growl :heal-bell :helping-hand :hidden-power :hyper-beam :ice-beam :ice-punch :icy-wind :iron-tail :mega-kick :mega-punch :metronome :milk-drink :mimic :mud-slap :present :protect :psych-up :rain-dance :rest :return :reversal :rock-slide :rock-smash :rock-tomb :rollout :sandstorm :secret-power :seismic-toss :shadow-ball :shock-wave :sleep-talk :snore :solarbeam :stomp :strength :substitute :sunny-day :surf :swagger :tackle :thunder :thunder-wave :thunderbolt :thunderpunch :toxic :water-pulse])

(deflearnset :dp
  :miltank [:attract :bide :blizzard :block :body-slam :brick-break :captivate :curse :defense-curl :dizzy-punch :double-edge :double-team :earthquake :endure :facade :fire-punch :fling :focus-blast :focus-punch :frustration :giga-impact :growl :gyro-ball :hammer-arm :headbutt :heal-bell :helping-hand :hidden-power :hyper-beam :ice-beam :ice-punch :icy-wind :iron-head :iron-tail :milk-drink :mud-slap :natural-gift :present :protect :psych-up :punishment :rain-dance :rest :return :reversal :rock-slide :rock-smash :rock-tomb :rollout :sandstorm :secret-power :seismic-toss :shadow-ball :shock-wave :sleep-talk :snore :solarbeam :stealth-rock :stomp :strength :substitute :sunny-day :surf :swagger :tackle :thunder :thunder-wave :thunderbolt :thunderpunch :toxic :wake-up-slap :water-pulse :whirlpool :zen-headbutt])

(deflearnset :bw
  :miltank [:after-you :attract :bide :blizzard :block :body-slam :brick-break :bulldoze :captivate :curse :defense-curl :dizzy-punch :double-edge :double-team :earthquake :echoed-voice :endure :facade :fire-punch :fling :focus-blast :frustration :giga-impact :growl :gyro-ball :hammer-arm :heal-bell :heart-stamp :helping-hand :hidden-power :hyper-beam :ice-beam :ice-punch :icy-wind :iron-head :iron-tail :milk-drink :natural-gift :present :protect :psych-up :punishment :rain-dance :rest :retaliate :return :reversal :rock-slide :rock-smash :rock-tomb :rollout :round :sandstorm :seismic-toss :shadow-ball :sleep-talk :snore :solarbeam :stealth-rock :stomp :strength :substitute :sunny-day :surf :swagger :tackle :thunder :thunder-wave :thunderbolt :thunderpunch :toxic :wake-up-slap :work-up :zen-headbutt])




(deflearnset :gs
  :qwilfish [:attract :blizzard :bubblebeam :curse :defense-curl :double-team :endure :flail :frustration :harden :haze :headbutt :hidden-power :hydro-pump :ice-beam :icy-wind :minimize :pin-missile :poison-sting :protect :rain-dance :rest :return :rollout :sleep-talk :sludge-bomb :snore :spikes :supersonic :surf :swagger :swift :tackle :take-down :toxic :water-gun :waterfall :whirlpool])

(deflearnset :rs
  :qwilfish [:astonish :attract :blizzard :bubblebeam :defense-curl :destiny-bond :dive :double-edge :double-team :endure :facade :flail :frustration :hail :harden :haze :hidden-power :hydro-pump :ice-beam :icy-wind :mimic :minimize :pin-missile :poison-sting :protect :rain-dance :rest :return :revenge :rollout :secret-power :selfdestruct :shadow-ball :shock-wave :sleep-talk :sludge-bomb :snore :spikes :substitute :supersonic :surf :swagger :swift :swords-dance :tackle :take-down :thunder-wave :toxic :water-gun :water-pulse :waterfall])

(deflearnset :dp
  :qwilfish [:aqua-jet :aqua-tail :astonish :attract :blizzard :bounce :brine :bubblebeam :captivate :destiny-bond :dive :double-team :endure :explosion :facade :flail :frustration :gyro-ball :hail :harden :haze :headbutt :hidden-power :hydro-pump :ice-beam :icy-wind :minimize :natural-gift :pain-split :payback :pin-missile :poison-jab :poison-sting :protect :rain-dance :rest :return :revenge :rollout :secret-power :shadow-ball :shock-wave :signal-beam :sleep-talk :sludge-bomb :snore :spikes :spit-up :stockpile :substitute :supersonic :surf :swagger :swift :tackle :take-down :taunt :thunder-wave :toxic :toxic-spikes :water-gun :water-pulse :waterfall :whirlpool])

(deflearnset :bw
  :qwilfish [:acid-spray :aqua-jet :aqua-tail :astonish :attract :blizzard :bounce :brine :bubblebeam :destiny-bond :dive :double-team :explosion :facade :flail :frustration :gyro-ball :hail :harden :haze :hidden-power :hydro-pump :ice-beam :icy-wind :minimize :pain-split :payback :pin-missile :poison-jab :poison-sting :protect :rain-dance :rest :return :revenge :rollout :round :scald :shadow-ball :signal-beam :sleep-talk :sludge-bomb :sludge-wave :snore :spikes :spit-up :stockpile :substitute :supersonic :surf :swagger :tackle :take-down :taunt :thunder-wave :toxic :toxic-spikes :venoshock :water-gun :water-pulse :waterfall])




(deflearnset :gs
  :shuckle [:attract :bide :constrict :curse :defense-curl :dig :double-team :earthquake :encore :endure :flash :frustration :headbutt :hidden-power :mud-slap :protect :rest :return :rock-smash :rollout :safeguard :sandstorm :sleep-talk :sludge-bomb :snore :strength :sunny-day :swagger :sweet-scent :toxic :withdraw :wrap])

(deflearnset :rs
  :shuckle [:attract :bide :body-slam :constrict :defense-curl :dig :double-edge :double-team :earthquake :encore :endure :facade :flash :frustration :hidden-power :mimic :mud-slap :protect :rest :return :rock-slide :rock-smash :rock-tomb :rollout :safeguard :sandstorm :secret-power :sleep-talk :sludge-bomb :snore :strength :substitute :sunny-day :swagger :sweet-scent :toxic :withdraw :wrap])

(deflearnset :dp
  :shuckle [:acupressure :ancientpower :attract :bide :bug-bite :captivate :constrict :dig :double-team :earth-power :earthquake :encore :endure :facade :flash :frustration :gastro-acid :gyro-ball :headbutt :helping-hand :hidden-power :knock-off :mud-slap :natural-gift :power-trick :protect :rest :return :rock-polish :rock-slide :rock-smash :rock-tomb :rollout :safeguard :sand-tomb :sandstorm :secret-power :sleep-talk :sludge-bomb :snore :stealth-rock :stone-edge :strength :string-shot :substitute :sunny-day :swagger :sweet-scent :toxic :withdraw :wrap])

(deflearnset :bw
  :shuckle [:acid :acupressure :after-you :attract :bide :bind :bug-bite :bulldoze :constrict :dig :double-team :earth-power :earthquake :encore :facade :final-gambit :flash :frustration :gastro-acid :guard-split :gyro-ball :helping-hand :hidden-power :knock-off :mud-slap :power-split :power-trick :protect :rest :return :rock-blast :rock-polish :rock-slide :rock-smash :rock-throw :rock-tomb :rollout :round :safeguard :sand-tomb :sandstorm :shell-smash :sleep-talk :sludge-bomb :sludge-wave :smack-down :snore :stealth-rock :stone-edge :strength :struggle-bug :substitute :sunny-day :swagger :sweet-scent :toxic :venoshock :withdraw :wrap])




(deflearnset :gs
  :skarmory [:agility :attract :curse :cut :detect :double-team :drill-peck :endure :fly :frustration :fury-attack :hidden-power :leer :mud-slap :peck :protect :pursuit :rest :return :sand-attack :sandstorm :sky-attack :sleep-talk :snore :steel-wing :sunny-day :swagger :swift :thief :toxic :whirlwind])

(deflearnset :rs
  :skarmory [:aerial-ace :agility :air-cutter :attract :counter :curse :cut :double-edge :double-team :drill-peck :endure :facade :fly :frustration :fury-attack :hidden-power :leer :metal-sound :mimic :mud-slap :peck :protect :pursuit :rest :return :roar :rock-slide :rock-smash :sand-attack :sandstorm :secret-power :sky-attack :sleep-talk :snore :spikes :steel-wing :substitute :sunny-day :swagger :swift :taunt :thief :torment :toxic :whirlwind])

(deflearnset :dp
  :skarmory [:aerial-ace :agility :air-cutter :air-slash :assurance :attract :brave-bird :captivate :curse :cut :dark-pulse :defog :double-team :drill-peck :endure :facade :feint :flash :flash-cannon :fly :frustration :fury-attack :fury-cutter :guard-swap :hidden-power :icy-wind :iron-defense :leer :metal-sound :mud-slap :natural-gift :night-slash :ominous-wind :payback :peck :pluck :protect :pursuit :rest :return :roar :rock-slide :rock-smash :rock-tomb :roost :sand-attack :sandstorm :secret-power :sky-attack :slash :sleep-talk :snore :spikes :stealth-rock :steel-wing :substitute :sunny-day :swagger :swift :swords-dance :tailwind :taunt :thief :torment :toxic :twister :whirlwind :x-scissor])

(deflearnset :bw
  :skarmory [:aerial-ace :agility :air-cutter :air-slash :assurance :attract :autotomize :brave-bird :curse :cut :dark-pulse :double-team :drill-peck :endure :facade :feint :flash :flash-cannon :fly :frustration :fury-attack :guard-swap :hidden-power :icy-wind :iron-defense :iron-head :leer :metal-sound :night-slash :payback :peck :pluck :protect :pursuit :rest :return :roar :rock-slide :rock-smash :rock-tomb :roost :round :sand-attack :sandstorm :sky-attack :sky-drop :slash :sleep-talk :snore :spikes :stealth-rock :steel-wing :substitute :sunny-day :swagger :swift :swords-dance :tailwind :taunt :thief :torment :toxic :whirlwind :x-scissor])




(deflearnset :gs
  :smeargle [:sketch])

(deflearnset :rs
  :smeargle [:sketch])

(deflearnset :dp
  :smeargle [:sketch])

(deflearnset :bw
  :smeargle [:sketch])




(deflearnset :gs
  :stantler [:attract :bite :confuse-ray :curse :detect :disable :double-team :dream-eater :earthquake :endure :flash :frustration :headbutt :hidden-power :hypnosis :leer :light-screen :mud-slap :nightmare :protect :psych-up :psychic :rain-dance :reflect :rest :return :roar :sand-attack :sleep-talk :snore :spite :stomp :sunny-day :swagger :swift :tackle :take-down :thief :toxic])

(deflearnset :rs
  :stantler [:astonish :attract :bite :body-slam :calm-mind :confuse-ray :disable :double-edge :double-team :dream-eater :earthquake :endure :extrasensory :facade :flash :frustration :hidden-power :hypnosis :iron-tail :leer :light-screen :mimic :mud-slap :nightmare :protect :psych-up :psychic :rain-dance :reflect :rest :return :roar :role-play :sand-attack :secret-power :shadow-ball :shock-wave :skill-swap :sleep-talk :snore :solarbeam :spite :stomp :substitute :sunny-day :swagger :swift :tackle :take-down :thief :thunder :thunder-wave :thunderbolt :toxic])

(deflearnset :dp
  :stantler [:astonish :attract :bite :bounce :calm-mind :captivate :charge-beam :confuse-ray :disable :double-kick :double-team :dream-eater :earthquake :endure :energy-ball :extrasensory :facade :flash :frustration :giga-impact :gravity :headbutt :hidden-power :hypnosis :imprison :iron-tail :last-resort :leer :light-screen :me-first :megahorn :mud-slap :natural-gift :protect :psych-up :psychic :rain-dance :reflect :rest :return :roar :role-play :sand-attack :secret-power :shadow-ball :shock-wave :signal-beam :skill-swap :sleep-talk :snore :solarbeam :spite :stomp :substitute :sucker-punch :sunny-day :swagger :swift :tackle :take-down :thief :thrash :thunder :thunder-wave :thunderbolt :toxic :trick-room :uproar :zen-headbutt])

(deflearnset :bw
  :stantler [:astonish :attract :bite :bounce :bulldoze :calm-mind :captivate :charge-beam :confuse-ray :disable :double-kick :double-team :dream-eater :earthquake :energy-ball :extrasensory :facade :flash :frustration :giga-impact :gravity :hidden-power :hypnosis :imprison :iron-tail :jump-kick :last-resort :leer :light-screen :magic-room :me-first :megahorn :mud-sport :protect :psych-up :psychic :psyshock :rage :rain-dance :reflect :rest :retaliate :return :roar :role-play :round :sand-attack :shadow-ball :signal-beam :skill-swap :sleep-talk :snore :solarbeam :spite :stomp :substitute :sunny-day :swagger :tackle :take-down :thief :thrash :thunder :thunder-wave :thunderbolt :toxic :trick-room :uproar :wild-charge :work-up :zen-headbutt])




(deflearnset :gs
  :unown [:hidden-power])

(deflearnset :rs
  :unown [:hidden-power])

(deflearnset :dp
  :unown [:hidden-power])

(deflearnset :bw
  :unown [:hidden-power])
