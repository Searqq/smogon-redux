
(defpokemon :carnivine
  :name "Carnivine"
  :introduced-in :dp
  :types [[:grass]]
  :egggroups [[:plant]]
  :abilities [[:levitate]]
  :stats [[74 100 72 90 72 46]]
  :weight [27]
  :height [1.4])

(defpokemon :chatot
  :name "Chatot"
  :introduced-in :dp
  :types [[:flying :normal]]
  :egggroups [[:flying]]
  :abilities [[:big-pecks :keen-eye :tangled-feet]]
  :stats [[76 65 45 92 42 91]]
  :weight [1.9]
  :height [0.5])

(defpokemon :cresselia
  :name "Cresselia"
  :introduced-in :dp
  :types [[:psychic]]
  :egggroups [[]]
  :abilities [[:levitate]]
  :stats [[120 70 120 75 130 85]]
  :weight [85.6]
  :height [1.5])

(defpokemon :darkrai
  :name "Darkrai"
  :introduced-in :dp
  :types [[:dark]]
  :egggroups [[]]
  :abilities [[:bad-dreams]]
  :stats [[70 90 90 135 90 125]]
  :weight [50.5]
  :height [1.5])

(defpokemon :heatran
  :name "Heatran"
  :introduced-in :dp
  :types [[:fire :steel]]
  :egggroups [[]]
  :abilities [[:flame-body :flash-fire]]
  :stats [[91 90 106 130 106 77]]
  :weight [430]
  :height [1.7])

(defpokemon :pachirisu
  :name "Pachirisu"
  :introduced-in :dp
  :types [[:electric]]
  :egggroups [[:fairy :ground]]
  :abilities [[:pickup :run-away :volt-absorb]]
  :stats [[60 45 70 45 90 95]]
  :weight [3.9]
  :height [0.4])

(defpokemon :spiritomb
  :name "Spiritomb"
  :introduced-in :dp
  :types [[:dark :ghost]]
  :egggroups [[:indeterminate]]
  :abilities [[:infiltrator :pressure]]
  :stats [[50 92 108 92 108 35]]
  :weight [108]
  :height [1])


(deffamily :carnivine)
(deffamily :chatot)
(deffamily :cresselia)
(deffamily :darkrai)
(deffamily :heatran)
(deffamily :pachirisu)
(deffamily :spiritomb)

(deflearnset :dp
  :carnivine [:attract :bind :bite :bug-bite :bullet-seed :captivate :crunch :cut :double-team :endure :energy-ball :facade :faint-attack :flash :fling :frustration :fury-cutter :gastro-acid :giga-drain :giga-impact :grass-knot :growth :hidden-power :hyper-beam :ingrain :knock-off :leech-seed :magical-leaf :mud-slap :natural-gift :payback :power-whip :protect :razor-leaf :rest :return :secret-power :seed-bomb :slam :sleep-powder :sleep-talk :sludge-bomb :snore :solarbeam :spit-up :stockpile :stun-spore :substitute :sunny-day :swagger :swallow :sweet-scent :swords-dance :synthesis :thief :toxic :vine-whip :worry-seed :wring-out])

(deflearnset :bw
  :carnivine [:attract :bind :bite :bug-bite :crunch :cut :double-team :energy-ball :facade :faint-attack :flash :fling :frustration :gastro-acid :giga-drain :giga-impact :grass-knot :grasswhistle :growth :hidden-power :hyper-beam :ingrain :knock-off :leaf-tornado :leech-seed :magical-leaf :payback :power-whip :protect :rage-powder :razor-leaf :rest :return :round :seed-bomb :slam :sleep-powder :sleep-talk :sludge-bomb :snore :solarbeam :spit-up :stockpile :stun-spore :substitute :sunny-day :swagger :swallow :sweet-scent :swords-dance :synthesis :thief :toxic :vine-whip :worry-seed :wring-out])




(deflearnset :dp
  :chatot [:aerial-ace :agility :air-cutter :attract :captivate :chatter :defog :double-team :encore :endure :facade :featherdance :fly :frustration :fury-attack :growl :heat-wave :hidden-power :hyper-voice :mimic :mirror-move :mud-slap :nasty-plot :natural-gift :night-shade :ominous-wind :peck :pluck :protect :rain-dance :rest :return :role-play :roost :secret-power :sing :sky-attack :sleep-talk :snore :steel-wing :substitute :sunny-day :supersonic :swagger :swift :tailwind :taunt :thief :torment :toxic :twister :u-turn :uproar])

(deflearnset :bw
  :chatot [:aerial-ace :agility :air-cutter :attract :chatter :defog :double-team :echoed-voice :encore :facade :featherdance :fly :frustration :fury-attack :growl :heat-wave :hidden-power :hyper-voice :mimic :mirror-move :nasty-plot :night-shade :peck :pluck :protect :rain-dance :rest :return :role-play :roost :round :sing :sky-attack :sleep-talk :snore :steel-wing :substitute :sunny-day :supersonic :swagger :synchronoise :tailwind :taunt :thief :torment :toxic :u-turn :uproar :work-up])




(deflearnset :dp
  :cresselia [:attract :aurora-beam :calm-mind :captivate :charge-beam :confusion :double-team :dream-eater :endure :energy-ball :facade :flash :frustration :fury-cutter :future-sight :giga-impact :grass-knot :gravity :helping-hand :hidden-power :hyper-beam :ice-beam :icy-wind :light-screen :lunar-dance :magic-coat :mist :moonlight :mud-slap :natural-gift :protect :psych-up :psychic :psycho-cut :psycho-shift :rain-dance :recycle :reflect :rest :return :safeguard :secret-power :shadow-ball :signal-beam :skill-swap :slash :sleep-talk :snore :solarbeam :substitute :sunny-day :swagger :swift :thunder-wave :toxic :trick :trick-room :zen-headbutt])

(deflearnset :bw
  :cresselia [:attract :aurora-beam :calm-mind :charge-beam :confusion :double-team :dream-eater :energy-ball :facade :flash :frustration :future-sight :giga-impact :grass-knot :gravity :helping-hand :hidden-power :hyper-beam :ice-beam :icy-wind :light-screen :lunar-dance :magic-coat :magic-room :mist :moonlight :protect :psych-up :psychic :psycho-cut :psycho-shift :psyshock :rain-dance :recycle :reflect :rest :return :round :safeguard :shadow-ball :signal-beam :skill-swap :slash :sleep-talk :snore :solarbeam :substitute :sunny-day :swagger :telekinesis :thunder-wave :toxic :trick :trick-room :zen-headbutt])




(deflearnset :dp
  :heatran [:ancientpower :attract :bug-bite :captivate :crunch :dark-pulse :dig :double-team :dragon-pulse :earth-power :earthquake :endure :explosion :facade :fire-blast :fire-fang :fire-spin :flamethrower :flash-cannon :frustration :giga-impact :headbutt :heat-wave :hidden-power :hyper-beam :iron-defense :iron-head :lava-plume :leer :magma-storm :metal-sound :mud-slap :natural-gift :overheat :payback :protect :rest :return :roar :rock-climb :rock-slide :rock-smash :rock-tomb :scary-face :secret-power :sleep-talk :snore :solarbeam :stealth-rock :stone-edge :strength :substitute :sunny-day :swagger :taunt :torment :toxic :uproar :will-o-wisp])

(deflearnset :bw
  :heatran [:ancientpower :attract :bug-bite :bulldoze :crunch :dark-pulse :dig :double-team :dragon-pulse :earth-power :earthquake :explosion :facade :fire-blast :fire-fang :fire-spin :flame-charge :flamethrower :flash-cannon :frustration :giga-impact :heat-wave :hidden-power :hyper-beam :incinerate :iron-defense :iron-head :lava-plume :leer :magma-storm :metal-sound :overheat :payback :protect :rest :return :roar :rock-slide :rock-smash :rock-tomb :round :scary-face :sleep-talk :snore :solarbeam :stealth-rock :stone-edge :strength :substitute :sunny-day :swagger :taunt :torment :toxic :uproar :will-o-wisp])




(deflearnset :dp
  :pachirisu [:attract :bide :bite :captivate :charge-beam :charm :covet :cut :defense-curl :dig :discharge :double-team :endure :facade :fake-tears :flail :flash :flatter :fling :frustration :grass-knot :growl :gunk-shot :headbutt :helping-hand :hidden-power :iron-tail :last-resort :light-screen :magnet-rise :mud-slap :natural-gift :protect :quick-attack :rain-dance :rest :return :rollout :secret-power :seed-bomb :shock-wave :sleep-talk :snore :spark :substitute :super-fang :swagger :sweet-kiss :swift :thunder :thunder-wave :thunderbolt :thunderpunch :toxic :u-turn :uproar])

(deflearnset :bw
  :pachirisu [:attract :bestow :bide :bite :charge :charge-beam :charm :covet :cut :defense-curl :dig :discharge :double-team :echoed-voice :electro-ball :endure :facade :fake-tears :flail :flash :flatter :fling :follow-me :frustration :grass-knot :growl :gunk-shot :helping-hand :hidden-power :hyper-fang :iron-tail :last-resort :light-screen :magnet-rise :protect :quick-attack :rain-dance :rest :return :rollout :round :seed-bomb :sleep-talk :snore :spark :substitute :super-fang :swagger :sweet-kiss :swift :tail-whip :thunder :thunder-wave :thunderbolt :thunderpunch :toxic :u-turn :uproar :volt-switch])




(deflearnset :dp
  :shaymin [:aromatherapy :bullet-seed :defense-curl :double-team :earth-power :endeavor :endure :energy-ball :facade :flash :frustration :giga-drain :giga-impact :grass-knot :grasswhistle :growth :headbutt :healing-wish :hidden-power :hyper-beam :last-resort :leech-seed :lucky-chant :magical-leaf :mud-slap :natural-gift :protect :psych-up :psychic :rest :return :safeguard :secret-power :seed-bomb :seed-flare :sleep-talk :snore :solarbeam :substitute :sunny-day :swagger :sweet-kiss :sweet-scent :swift :swords-dance :synthesis :toxic :worry-seed :zen-headbutt])

(deflearnset :bw
  :shaymin [:aromatherapy :covet :double-team :earth-power :endeavor :energy-ball :facade :flash :frustration :giga-drain :giga-impact :grass-knot :growth :healing-wish :hidden-power :hyper-beam :last-resort :leech-seed :magical-leaf :natural-gift :protect :psych-up :psychic :rest :return :round :safeguard :seed-bomb :seed-flare :sleep-talk :snore :solarbeam :substitute :sunny-day :swagger :sweet-kiss :sweet-scent :swords-dance :synthesis :toxic :worry-seed :zen-headbutt])




(deflearnset :dp
  :spiritomb [:attract :calm-mind :captivate :confuse-ray :curse :dark-pulse :destiny-bond :double-team :dream-eater :embargo :endure :facade :faint-attack :flash :frustration :giga-impact :grudge :hidden-power :hyper-beam :hypnosis :icy-wind :imprison :memento :nasty-plot :natural-gift :ominous-wind :pain-split :protect :psych-up :psychic :pursuit :rain-dance :rest :return :rock-tomb :secret-power :shadow-ball :shadow-sneak :shock-wave :silver-wind :sleep-talk :smokescreen :snatch :snore :spite :substitute :sucker-punch :sunny-day :swagger :taunt :thief :torment :toxic :trick :uproar :water-pulse :will-o-wisp])

(deflearnset :bw
  :spiritomb [:attract :calm-mind :captivate :confuse-ray :curse :dark-pulse :destiny-bond :double-team :dream-eater :embargo :facade :faint-attack :flash :foul-play :frustration :giga-impact :grudge :hidden-power :hyper-beam :hypnosis :icy-wind :imprison :memento :nasty-plot :nightmare :ominous-wind :pain-split :protect :psych-up :psychic :pursuit :quash :rain-dance :rest :retaliate :return :rock-tomb :round :shadow-ball :shadow-sneak :sleep-talk :smokescreen :snarl :snatch :snore :spite :substitute :sucker-punch :sunny-day :swagger :taunt :telekinesis :thief :torment :toxic :trick :uproar :will-o-wisp :wonder-room])
