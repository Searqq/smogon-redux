
(defpokemon :mew
  :name "Mew"
  :introduced-in :rb
  :types [[:psychic]]
  :egggroups [[]]
  :abilities [[:synchronize]
              :bw [:synchronize]]
  :stats [[100 100 100 100 100]
          :gs [100 100 100 100 100 100]]
  :weight [4]
  :height [0.4])

(defpokemon :celebi
  :name "Celebi"
  :introduced-in :gs
  :types [[:grass :psychic]]
  :egggroups [[]]
  :abilities [[:natural-cure]
              :bw [:natural-cure]]
  :stats [[100 100 100 100 100 100]]
  :weight [5]
  :height [0.6])

(defpokemon :jirachi
  :name "Jirachi"
  :introduced-in :rs
  :types [[:psychic :steel]]
  :egggroups [[]]
  :abilities [[:serene-grace]
              :bw [:serene-grace]]
  :stats [[100 100 100 100 100 100]]
  :weight [1.1]
  :height [0.3])

(defpokemon :phione
  :name "Phione"
  :introduced-in :dp
  :types [[:water]]
  :egggroups [[:fairy :water-1]]
  :abilities [[:hydration]]
  :stats [[80 80 80 80 80 80]]
  :weight [3.1]
  :height [0.4])

(defpokemon :manaphy
  :name "Manaphy"
  :introduced-in :dp
  :types [[:water]]
  :egggroups [[:fairy :water-1]]
  :abilities [[:hydration]]
  :stats [[100 100 100 100 100 100]]
  :weight [1.4]
  :height [0.3])

(defpokemon :shaymin
  :name "Shaymin"
  :introduced-in :dp
  :types [[:grass]]
  :egggroups [[]]
  :abilities [[:natural-cure]]
  :stats [[100 100 100 100 100 100]]
  :weight [2.1]
  :height [0.2])

(defpokemon :shaymin-s
  :name "Shaymin-Sky"
  :introduced-in :dp
  :types [[:flying :grass]]
  :egggroups [[]]
  :abilities [[:serene-grace]]
  :stats [[100 103 75 120 75 127]]
  :weight [5.2]
  :height [0.4])

(defpokemon :victini
  :name "Victini"
  :introduced-in :bw
  :types [[:fire :psychic]]
  :egggroups [[]]
  :abilities [[:victory-star]]
  :stats [[100 100 100 100 100 100]]
  :weight [4]
  :height [0.4])

(deffamily :victini)
(deffamily :manaphy)
(deffamily :phione)
(deffamily :shaymin [:shaymin-s])
(deffamily :jirachi)
(deffamily :celebi)
(deffamily :mew)

(deflearnset :gs
  :celebi [:ancientpower :baton-pass :confusion :curse :defense-curl :detect :double-team :dream-eater :endure :flash :frustration :future-sight :giga-drain :heal-bell :hidden-power :hyper-beam :leech-seed :mud-slap :nightmare :perish-song :protect :psych-up :psychic :rain-dance :recover :rest :return :safeguard :sandstorm :shadow-ball :sleep-talk :snore :solarbeam :sunny-day :swagger :sweet-scent :swift :toxic])

(deflearnset :rs
  :celebi [:aerial-ace :ancientpower :baton-pass :calm-mind :confusion :cut :defense-curl :double-edge :double-team :dream-eater :endure :facade :flash :frustration :future-sight :giga-drain :heal-bell :hidden-power :hyper-beam :leech-seed :light-screen :metronome :mimic :mud-slap :nightmare :perish-song :protect :psych-up :psychic :rain-dance :recover :reflect :rest :return :safeguard :sandstorm :secret-power :shadow-ball :shock-wave :skill-swap :sleep-talk :snore :solarbeam :substitute :sunny-day :swagger :swift :swords-dance :toxic :water-pulse])

(deflearnset :dp
  :celebi [:aerial-ace :ancientpower :baton-pass :calm-mind :charge-beam :confusion :cut :double-team :dream-eater :earth-power :endure :energy-ball :facade :flash :fling :frustration :future-sight :giga-drain :giga-impact :grass-knot :heal-bell :heal-block :healing-wish :helping-hand :hidden-power :hyper-beam :last-resort :leaf-storm :leech-seed :light-screen :magic-coat :magical-leaf :mud-slap :natural-gift :perish-song :protect :psych-up :psychic :rain-dance :recover :reflect :rest :return :safeguard :sandstorm :secret-power :seed-bomb :shadow-ball :shock-wave :signal-beam :silver-wind :skill-swap :sleep-talk :snore :solarbeam :stealth-rock :substitute :sucker-punch :sunny-day :swagger :swift :swords-dance :synthesis :thunder-wave :toxic :trick :trick-room :u-turn :uproar :water-pulse :worry-seed :zen-headbutt])

(deflearnset :bw
  :celebi [:aerial-ace :ancientpower :baton-pass :calm-mind :charge-beam :confusion :cut :double-team :dream-eater :earth-power :echoed-voice :energy-ball :facade :flash :fling :frustration :future-sight :giga-drain :giga-impact :grass-knot :heal-bell :heal-block :healing-wish :helping-hand :hidden-power :hyper-beam :last-resort :leaf-storm :leech-seed :light-screen :magic-coat :magic-room :magical-leaf :natural-gift :perish-song :protect :psych-up :psychic :rain-dance :recover :reflect :rest :return :round :safeguard :sandstorm :seed-bomb :shadow-ball :signal-beam :skill-swap :sleep-talk :snore :solarbeam :stealth-rock :substitute :sunny-day :swagger :swords-dance :synthesis :thunder-wave :toxic :trick :trick-room :u-turn :uproar :wonder-room :worry-seed :zen-headbutt])




(deflearnset :rs
  :jirachi [:aerial-ace :body-slam :calm-mind :confusion :cosmic-power :defense-curl :doom-desire :double-edge :double-team :dream-eater :dynamicpunch :endure :facade :fire-punch :flash :frustration :future-sight :helping-hand :hidden-power :hyper-beam :ice-punch :icy-wind :light-screen :metronome :mimic :mud-slap :nightmare :protect :psych-up :psychic :rain-dance :reflect :refresh :rest :return :safeguard :sandstorm :secret-power :shadow-ball :shock-wave :skill-swap :sleep-talk :snore :substitute :sunny-day :swagger :swift :thunder :thunder-wave :thunderbolt :thunderpunch :toxic :water-pulse :wish])

(deflearnset :dp
  :jirachi [:aerial-ace :ancientpower :calm-mind :charge-beam :confusion :cosmic-power :doom-desire :double-edge :double-team :drain-punch :dream-eater :endure :energy-ball :facade :fire-punch :flash :flash-cannon :fling :frustration :future-sight :giga-impact :grass-knot :gravity :headbutt :healing-wish :helping-hand :hidden-power :hyper-beam :ice-punch :icy-wind :iron-defense :iron-head :last-resort :light-screen :magic-coat :mud-slap :natural-gift :protect :psych-up :psychic :rain-dance :recycle :reflect :refresh :rest :return :safeguard :sandstorm :secret-power :shadow-ball :shock-wave :signal-beam :skill-swap :sleep-talk :snore :stealth-rock :substitute :sunny-day :swagger :swift :thunder :thunder-wave :thunderbolt :thunderpunch :toxic :trick :trick-room :u-turn :uproar :water-pulse :wish :zen-headbutt])

(deflearnset :bw
  :jirachi [:aerial-ace :calm-mind :charge-beam :confusion :cosmic-power :doom-desire :double-edge :double-team :drain-punch :dream-eater :energy-ball :facade :fire-punch :flash :flash-cannon :fling :frustration :future-sight :giga-impact :grass-knot :gravity :healing-wish :helping-hand :hidden-power :hyper-beam :ice-punch :icy-wind :iron-defense :iron-head :last-resort :light-screen :magic-coat :magic-room :protect :psych-up :psychic :psyshock :rain-dance :recycle :reflect :refresh :rest :return :round :safeguard :sandstorm :shadow-ball :signal-beam :skill-swap :sleep-talk :snore :stealth-rock :substitute :sunny-day :swagger :swift :telekinesis :thunder :thunder-wave :thunderbolt :thunderpunch :toxic :trick :trick-room :u-turn :uproar :wish :zen-headbutt])




(deflearnset :dp
  :manaphy [:acid-armor :ancientpower :aqua-ring :blizzard :bounce :brine :bubble :bubblebeam :calm-mind :charm :dive :double-team :endure :energy-ball :facade :flash :fling :frustration :giga-impact :grass-knot :hail :heal-bell :heart-swap :helping-hand :hidden-power :hyper-beam :ice-beam :icy-wind :knock-off :last-resort :light-screen :mud-slap :natural-gift :protect :psych-up :psychic :rain-dance :reflect :rest :return :safeguard :secret-power :shadow-ball :signal-beam :skill-swap :sleep-talk :snore :substitute :supersonic :surf :swagger :swift :tail-glow :toxic :u-turn :uproar :water-pulse :water-sport :waterfall :whirlpool])

(deflearnset :bw
  :manaphy [:acid-armor :aqua-ring :blizzard :bounce :bubble :bubblebeam :calm-mind :charm :covet :dive :double-team :energy-ball :facade :flash :fling :frustration :giga-impact :grass-knot :hail :heal-bell :heart-swap :helping-hand :hidden-power :hyper-beam :ice-beam :icy-wind :knock-off :last-resort :light-screen :protect :psych-up :psychic :rain-dance :reflect :rest :return :round :safeguard :scald :shadow-ball :signal-beam :skill-swap :sleep-talk :snore :substitute :supersonic :surf :swagger :tail-glow :toxic :u-turn :uproar :water-pulse :water-sport :waterfall :whirlpool])




(deflearnset :dp
  :phione [:acid-armor :ancientpower :aqua-ring :blizzard :bounce :brine :bubble :bubblebeam :charm :dive :double-team :endure :facade :fling :frustration :grass-knot :hail :heal-bell :helping-hand :hidden-power :ice-beam :icy-wind :knock-off :last-resort :mud-slap :natural-gift :protect :psych-up :rain-dance :rest :return :safeguard :secret-power :signal-beam :sleep-talk :snore :substitute :supersonic :surf :swagger :swift :toxic :u-turn :uproar :water-pulse :water-sport :waterfall :whirlpool])

(deflearnset :bw
  :phione [:acid-armor :aqua-ring :blizzard :bounce :bubble :bubblebeam :charm :covet :dive :double-team :facade :fling :frustration :grass-knot :hail :heal-bell :helping-hand :hidden-power :ice-beam :icy-wind :knock-off :last-resort :protect :psych-up :rain-dance :rest :return :round :safeguard :scald :signal-beam :sleep-talk :snore :substitute :supersonic :surf :swagger :toxic :u-turn :uproar :water-pulse :water-sport :waterfall :whirlpool])




(deflearnset :bw
  :victini [:bounce :brick-break :charge-beam :confusion :double-edge :double-team :embargo :endure :energy-ball :facade :final-gambit :fire-blast :fire-punch :flame-burst :flame-charge :flamethrower :flare-blitz :flash :fling :focus-blast :focus-energy :frustration :giga-impact :grass-knot :headbutt :heat-wave :helping-hand :hidden-power :hyper-beam :incinerate :inferno :last-resort :light-screen :magic-coat :overheat :protect :psych-up :psychic :psyshock :quick-attack :rest :return :reversal :rock-smash :role-play :round :safeguard :searing-shot :shadow-ball :signal-beam :skill-swap :sleep-talk :snore :solarbeam :stored-power :substitute :sunny-day :swagger :taunt :telekinesis :thunder :thunder-wave :thunderbolt :thunderpunch :toxic :trick :trick-room :u-turn :uproar :wild-charge :will-o-wisp :work-up :zen-headbutt])
