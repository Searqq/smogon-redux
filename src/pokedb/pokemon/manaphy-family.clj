
(in-ns 'smogon.dex)



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

(deffamily :manaphy)
(deffamily :phione)

(deflearnset :dp
  :manaphy [:acid-armor :ancientpower :aqua-ring :blizzard :bounce :brine :bubble :bubblebeam :calm-mind :charm :dive :double-team :endure :energy-ball :facade :flash :fling :frustration :giga-impact :grass-knot :hail :heal-bell :heart-swap :helping-hand :hidden-power :hyper-beam :ice-beam :icy-wind :knock-off :last-resort :light-screen :mud-slap :natural-gift :protect :psych-up :psychic :rain-dance :reflect :rest :return :safeguard :secret-power :shadow-ball :signal-beam :skill-swap :sleep-talk :snore :substitute :supersonic :surf :swagger :swift :tail-glow :toxic :u-turn :uproar :water-pulse :water-sport :waterfall :whirlpool])

(deflearnset :bw
  :manaphy [:acid-armor :aqua-ring :blizzard :bounce :bubble :bubblebeam :calm-mind :charm :covet :dive :double-team :energy-ball :facade :flash :fling :frustration :giga-impact :grass-knot :hail :heal-bell :heart-swap :helping-hand :hidden-power :hyper-beam :ice-beam :icy-wind :knock-off :last-resort :light-screen :protect :psych-up :psychic :rain-dance :reflect :rest :return :round :safeguard :scald :shadow-ball :signal-beam :skill-swap :sleep-talk :snore :substitute :supersonic :surf :swagger :tail-glow :toxic :u-turn :uproar :water-pulse :water-sport :waterfall :whirlpool])

(deflearnset :dp
  :phione [:acid-armor :ancientpower :aqua-ring :blizzard :bounce :brine :bubble :bubblebeam :charm :dive :double-team :endure :facade :fling :frustration :grass-knot :hail :heal-bell :helping-hand :hidden-power :ice-beam :icy-wind :knock-off :last-resort :mud-slap :natural-gift :protect :psych-up :rain-dance :rest :return :safeguard :secret-power :signal-beam :sleep-talk :snore :substitute :supersonic :surf :swagger :swift :toxic :u-turn :uproar :water-pulse :water-sport :waterfall :whirlpool])

(deflearnset :bw
  :phione [:acid-armor :aqua-ring :blizzard :bounce :bubble :bubblebeam :charm :covet :dive :double-team :facade :fling :frustration :grass-knot :hail :heal-bell :helping-hand :hidden-power :ice-beam :icy-wind :knock-off :last-resort :protect :psych-up :rain-dance :rest :return :round :safeguard :scald :signal-beam :sleep-talk :snore :substitute :supersonic :surf :swagger :toxic :u-turn :uproar :water-pulse :water-sport :waterfall :whirlpool])
















