
(defpokemon :reshiram
  :name "Reshiram"
  :introduced-in :bw
  :types [[:dragon :fire]]
  :egggroups [[]]
  :abilities [[:turboblaze]]
  :stats [[100 120 100 150 120 90]]
  :weight [330]
  :height [3.2])

(defpokemon :zekrom
  :name "Zekrom"
  :introduced-in :bw
  :types [[:dragon :electric]]
  :egggroups [[]]
  :abilities [[:teravolt]]
  :stats [[100 150 120 120 100 90]]
  :weight [345]
  :height [2.9])

(defpokemon :kyurem
  :name "Kyurem"
  :introduced-in :bw
  :types [[:dragon :ice]]
  :egggroups [[]]
  :abilities [[:pressure]]
  :stats [[125 130 90 130 90 95]]
  :weight [325]
  :height [3])

(defpokemon :kyurem-b
  :name "Kyurem-Black"
  :introduced-in :bw
  :types [[:dragon :ice]]
  :egggroups [[]]
  :abilities [[:teravolt]]
  :stats [[125 170 100 120 90 95]]
  :weight [325]
  :height [3.3])

(defpokemon :kyurem-w
  :name "Kyurem-White"
  :introduced-in :bw
  :types [[:dragon :ice]]
  :egggroups [[]]
  :abilities [[:turboblaze]]
  :stats [[125 120 90 170 100 95]]
  :weight [325]
  :height [3.6])

(deffamily :kyurem [:kyurem-b :kyurem-w])
(deffamily :zekrom)
(deffamily :reshiram)



(deflearnset :bw
  :kyurem [:ancientpower :blizzard :cut :double-team :draco-meteor :dragon-claw :dragon-pulse :dragon-rage :dragon-tail :dragonbreath :earth-power :echoed-voice :endeavor :facade :flash-cannon :fling :fly :focus-blast :frustration :giga-impact :glaciate :hail :hidden-power :hone-claws :hyper-beam :hyper-voice :ice-beam :icy-wind :imprison :iron-head :light-screen :outrage :payback :protect :psychic :rain-dance :reflect :rest :return :rock-slide :rock-smash :rock-tomb :roost :round :safeguard :scary-face :shadow-ball :shadow-claw :signal-beam :slash :sleep-talk :snore :stone-edge :strength :substitute :sunny-day :swagger :toxic :zen-headbutt])




(deflearnset :bw
  :reshiram [:ancientpower :blue-flare :crunch :cut :double-team :draco-meteor :dragon-claw :dragon-pulse :dragon-rage :dragon-tail :dragonbreath :earth-power :echoed-voice :extrasensory :facade :fire-blast :fire-fang :flame-charge :flamethrower :fling :fly :focus-blast :frustration :fusion-flare :giga-impact :heat-wave :hidden-power :hone-claws :hyper-beam :hyper-voice :imprison :incinerate :light-screen :outrage :overheat :payback :protect :psychic :reflect :rest :return :rock-slide :rock-smash :rock-tomb :roost :round :safeguard :shadow-ball :shadow-claw :slash :sleep-talk :snore :solarbeam :stone-edge :strength :substitute :sunny-day :swagger :tailwind :toxic :will-o-wisp :zen-headbutt])




(deflearnset :bw
  :zekrom [:ancientpower :bolt-strike :charge-beam :crunch :cut :double-team :draco-meteor :dragon-claw :dragon-pulse :dragon-rage :dragon-tail :dragonbreath :earth-power :echoed-voice :facade :flash :flash-cannon :fling :fly :focus-blast :frustration :fusion-bolt :giga-impact :hidden-power :hone-claws :hyper-beam :hyper-voice :imprison :light-screen :magnet-rise :outrage :payback :protect :psychic :rain-dance :reflect :rest :return :rock-slide :rock-smash :rock-tomb :roost :round :safeguard :shadow-ball :shadow-claw :signal-beam :slash :sleep-talk :snore :stone-edge :strength :substitute :swagger :tailwind :thunder :thunder-fang :thunder-wave :thunderbolt :thunderpunch :toxic :volt-switch :wild-charge :zen-headbutt])

