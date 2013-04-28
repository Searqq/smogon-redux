
(defpokemon :regice
  :name "Regice"
  :introduced-in :rs
  :types [[:ice]]
  :egggroups [[]]
  :abilities [[:clear-body]
              :bw [:clear-body :ice-body]]
  :stats [[80 50 100 100 200 50]]
  :weight [175]
  :height [1.8])

(defpokemon :regigigas
  :name "Regigigas"
  :introduced-in :dp
  :types [[:normal]]
  :egggroups [[]]
  :abilities [[:slow-start]]
  :stats [[110 160 110 80 110 100]]
  :weight [420]
  :height [3.7])

(defpokemon :regirock
  :name "Regirock"
  :introduced-in :rs
  :types [[:rock]]
  :egggroups [[]]
  :abilities [[:clear-body]
              :bw [:clear-body :sturdy]]
  :stats [[80 100 200 50 100 50]]
  :weight [230]
  :height [1.7])

(defpokemon :registeel
  :name "Registeel"
  :introduced-in :rs
  :types [[:steel]]
  :egggroups [[]]
  :abilities [[:clear-body]
              :bw [:clear-body :light-metal]]
  :stats [[80 75 150 75 150 50]]
  :weight [205]
  :height [1.9])

(deffamily :registeel)
(deffamily :regice)
(deffamily :regirock)
(deffamily :regigigas)



(deflearnset :rs
  :regice [:amnesia :ancientpower :blizzard :body-slam :brick-break :counter :curse :defense-curl :double-edge :double-team :dynamicpunch :earthquake :endure :explosion :facade :focus-punch :frustration :hail :hidden-power :hyper-beam :ice-beam :ice-punch :icy-wind :lock-on :mega-kick :mega-punch :mimic :mud-slap :protect :psych-up :rain-dance :rest :return :rock-slide :rock-smash :rollout :safeguard :secret-power :seismic-toss :selfdestruct :shock-wave :sleep-talk :snore :strength :substitute :superpower :swagger :thunder :thunder-wave :thunderbolt :thunderpunch :toxic :zap-cannon])

(deflearnset :dp
  :regice [:amnesia :ancientpower :avalanche :blizzard :block :brick-break :charge-beam :curse :double-team :earthquake :endure :explosion :facade :flash-cannon :fling :focus-blast :focus-punch :frustration :giga-impact :gravity :hail :hammer-arm :headbutt :hidden-power :hyper-beam :ice-beam :ice-punch :icy-wind :iron-head :lock-on :mud-slap :natural-gift :protect :psych-up :rain-dance :rest :return :rock-climb :rock-polish :rock-slide :rock-smash :rock-tomb :rollout :safeguard :secret-power :shock-wave :signal-beam :sleep-talk :snore :stomp :strength :substitute :superpower :swagger :thunder :thunder-wave :thunderbolt :thunderpunch :toxic :zap-cannon])

(deflearnset :bw
  :regice [:amnesia :ancientpower :blizzard :block :brick-break :bulldoze :charge-beam :curse :double-team :earthquake :explosion :facade :flash-cannon :fling :focus-blast :frost-breath :frustration :giga-impact :gravity :hail :hammer-arm :hidden-power :hyper-beam :ice-beam :ice-punch :icy-wind :iron-head :lock-on :protect :psych-up :rain-dance :rest :return :rock-polish :rock-slide :rock-smash :rock-tomb :round :safeguard :signal-beam :sleep-talk :snore :stomp :strength :substitute :superpower :swagger :thunder :thunder-wave :thunderbolt :thunderpunch :toxic :zap-cannon])




(deflearnset :dp
  :regigigas [:aerial-ace :ancientpower :avalanche :block :brick-break :confuse-ray :crush-grip :dizzy-punch :double-team :drain-punch :earth-power :earthquake :endure :facade :fire-punch :fling :focus-blast :focus-punch :foresight :frustration :giga-impact :gravity :headbutt :hidden-power :hyper-beam :ice-punch :icy-wind :iron-head :knock-off :mega-punch :mud-slap :natural-gift :psych-up :rain-dance :return :revenge :rock-climb :rock-polish :rock-slide :rock-smash :rock-tomb :safeguard :secret-power :shock-wave :sleep-talk :snore :stomp :stone-edge :strength :substitute :sunny-day :superpower :swagger :thunder :thunder-wave :thunderbolt :thunderpunch :toxic :zen-headbutt])

(deflearnset :bw
  :regigigas [:aerial-ace :block :brick-break :bulldoze :confuse-ray :crush-grip :dizzy-punch :double-team :drain-punch :earth-power :earthquake :facade :fire-punch :fling :focus-blast :foresight :frustration :giga-impact :gravity :heavy-slam :hidden-power :hyper-beam :ice-punch :icy-wind :iron-head :knock-off :payback :psych-up :rain-dance :retaliate :return :revenge :rock-polish :rock-slide :rock-smash :rock-tomb :round :safeguard :sleep-talk :smack-down :snore :stone-edge :strength :substitute :sunny-day :superpower :swagger :thunder :thunder-wave :thunderbolt :thunderpunch :toxic :wide-guard :zen-headbutt])




(deflearnset :rs
  :regirock [:ancientpower :body-slam :brick-break :counter :curse :defense-curl :dig :double-edge :double-team :dynamicpunch :earthquake :endure :explosion :facade :fire-punch :focus-punch :frustration :hidden-power :hyper-beam :ice-punch :iron-defense :lock-on :mega-kick :mega-punch :mimic :mud-slap :protect :psych-up :rest :return :rock-slide :rock-smash :rock-throw :rock-tomb :rollout :safeguard :sandstorm :secret-power :seismic-toss :selfdestruct :shock-wave :sleep-talk :snore :strength :substitute :sunny-day :superpower :swagger :thunder :thunder-wave :thunderbolt :thunderpunch :toxic :zap-cannon])

(deflearnset :dp
  :regirock [:ancientpower :block :brick-break :charge-beam :curse :dig :double-team :drain-punch :earth-power :earthquake :endure :explosion :facade :fire-punch :fling :focus-blast :focus-punch :frustration :giga-impact :gravity :hammer-arm :headbutt :hidden-power :hyper-beam :ice-punch :iron-defense :iron-head :lock-on :mud-slap :natural-gift :protect :psych-up :rest :return :rock-climb :rock-polish :rock-slide :rock-smash :rock-throw :rock-tomb :rollout :safeguard :sandstorm :secret-power :shock-wave :sleep-talk :snore :stealth-rock :stomp :stone-edge :strength :substitute :sunny-day :superpower :swagger :thunder :thunder-wave :thunderbolt :thunderpunch :toxic :zap-cannon])

(deflearnset :bw
  :regirock [:ancientpower :block :brick-break :bulldoze :charge-beam :curse :dig :double-team :drain-punch :earth-power :earthquake :explosion :facade :fire-punch :fling :focus-blast :frustration :giga-impact :gravity :hammer-arm :hidden-power :hyper-beam :ice-punch :iron-defense :iron-head :lock-on :protect :psych-up :rest :return :rock-polish :rock-slide :rock-smash :rock-throw :rock-tomb :round :safeguard :sandstorm :sleep-talk :smack-down :snore :stealth-rock :stomp :stone-edge :strength :substitute :sunny-day :superpower :swagger :thunder :thunder-wave :thunderbolt :thunderpunch :toxic :zap-cannon])




(deflearnset :rs
  :registeel [:aerial-ace :amnesia :ancientpower :body-slam :brick-break :counter :curse :defense-curl :double-edge :double-team :dynamicpunch :earthquake :endure :explosion :facade :focus-punch :frustration :hidden-power :hyper-beam :ice-punch :iron-defense :lock-on :mega-kick :mega-punch :metal-claw :mimic :mud-slap :protect :psych-up :rain-dance :rest :return :rock-slide :rock-smash :rock-tomb :rollout :safeguard :sandstorm :secret-power :seismic-toss :selfdestruct :shock-wave :sleep-talk :snore :strength :substitute :sunny-day :superpower :swagger :thunder :thunder-wave :thunderbolt :thunderpunch :toxic :zap-cannon])

(deflearnset :dp
  :registeel [:aerial-ace :amnesia :ancientpower :block :brick-break :charge-beam :curse :double-team :earthquake :endure :explosion :facade :flash-cannon :fling :focus-blast :focus-punch :frustration :giga-impact :gravity :hammer-arm :headbutt :hidden-power :hyper-beam :ice-punch :iron-defense :iron-head :lock-on :magnet-rise :metal-claw :mud-slap :natural-gift :protect :psych-up :rain-dance :rest :return :rock-climb :rock-polish :rock-slide :rock-smash :rock-tomb :rollout :safeguard :sandstorm :secret-power :shadow-claw :shock-wave :sleep-talk :snore :stealth-rock :stomp :strength :substitute :sunny-day :superpower :swagger :thunder :thunder-wave :thunderbolt :thunderpunch :toxic :zap-cannon])

(deflearnset :bw
  :registeel [:aerial-ace :amnesia :ancientpower :block :brick-break :bulldoze :charge-beam :curse :double-team :earthquake :explosion :facade :flash-cannon :fling :focus-blast :frustration :giga-impact :gravity :hammer-arm :hidden-power :hone-claws :hyper-beam :ice-punch :iron-defense :iron-head :lock-on :magnet-rise :metal-claw :protect :psych-up :rain-dance :rest :return :rock-polish :rock-slide :rock-smash :rock-tomb :round :safeguard :sandstorm :shadow-claw :sleep-talk :snore :stealth-rock :stomp :strength :substitute :sunny-day :superpower :swagger :thunder :thunder-wave :thunderbolt :thunderpunch :toxic :zap-cannon])

