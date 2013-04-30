
(deftypechart :bug
  :name "Bug"
  :introduced-in :rb
  :effective-against [{:bug 1 :dragon 1 :electric 1 :fighting 1/2 :fire 1/2
                       :flying 1/2 :ghost 1 :grass 2 :ground 1 :ice 1 :normal 1
                       :poison 2 :psychic 2 :rock 1 :water 1}
                      
                      :gs {:bug 1 :dragon 1 :dark 1 :electric 1 :fighting 1/2
                           :fire 1/2 :flying 1/2 :ghost 1/2 :grass 2 :ground 1
                           :ice 1 :normal 1 :poison 1/2 :psychic 2 :rock 1
                           :steel 1/2 :water 1}])

(deftypechart :dragon
  :name "Dragon"
  :introduced-in :rb
  :effective-against [{:bug 1 :dragon 2 :electric 1 :fighting 1 :fire 1
                       :flying 1 :ghost 1 :grass 1 :ground 1 :ice 1 :normal 1
                       :poison 1 :psychic 1 :rock 1 :water 1}
                      
                      :gs {:bug 1 :dragon 2 :dark 1 :electric 1 :fighting 1
                           :fire 1 :flying 1 :ghost 1 :grass 1 :ground 1 :ice 1
                           :normal 1 :poison 1 :psychic 1 :rock 1 :steel 1/2
                           :water 1}])

(deftypechart :dark
  :name "Dark"
  :introduced-in :gs
  :effective-against [{:bug 1 :dragon 1 :dark 1/2 :electric 1 :fighting 1/2
                       :fire 1 :flying 1 :ghost 1 :grass 1 :ground 1 :ice 1
                       :normal 1 :poison 1 :psychic 2 :rock 1 :steel 1/2
                       :water 1}])


(deftypechart :electric
  :name "Electric"
  :introduced-in :rb
  :effective-against [{:bug 1 :dragon 1/2 :electric 1/2 :fighting 1 :fire 1
                       :flying 2 :ghost 1 :grass 1/2 :ground 0 :ice 1 :normal 1
                       :poison 1 :psychic 1 :rock 1 :water 2}
                      
                      :gs {:bug 1 :dragon 1/2 :dark 1 :electric 1/2 :fighting 1
                           :fire 1 :flying 2 :ghost 1 :grass 1/2 :ground 0
                           :ice 1 :normal 1 :poison 1 :psychic 1 :rock 1
                           :steel 1 :water 2}])

(deftypechart :fighting
  :name "Fighting"
  :introduced-in :rb
  :effective-against [{:bug 1/2 :dragon 1 :electric 1 :fighting 1 :fire 1
                       :flying 1/2 :ghost 0 :grass 1 :ground 1 :ice 2 :normal 2
                       :poison 1/2 :psychic 1/2 :rock 2 :water 1}
                      
                      :gs {:bug 1/2 :dragon 1 :dark 2 :electric 1 :fighting 1
                           :fire 1 :flying 1/2 :ghost 0 :grass 1 :ground 1
                           :ice 2 :normal 2 :poison 1/2 :psychic 1/2 :rock 2
                           :steel 2 :water 1}])

(deftypechart :fire
  :name "Fire"
  :introduced-in :rb
  :effective-against [{:bug 2 :dragon 1/2 :electric 1 :fighting 1 :fire 1/2
                       :flying 1 :ghost 1 :grass 2 :ground 1 :ice 2 :normal 1
                       :poison 1 :psychic 1 :rock 1/2 :water 1/2}
                      
                      :gs {:bug 2 :dragon 1/2 :dark 1 :electric 1 :fighting 1
                           :fire 1/2 :flying 1 :ghost 1 :grass 2 :ground 1
                           :ice 2 :normal 1 :poison 1 :psychic 1 :rock 1/2
                           :steel 2 :water 1/2}])

(deftypechart :flying
  :name "Flying"
  :introduced-in :rb
  :effective-against [{:bug 2 :dragon 1 :electric 1/2 :fighting 2 :fire 1
                       :flying 1 :ghost 1 :grass 2 :ground 1 :ice 1 :normal 1
                       :poison 1 :psychic 1 :rock 1/2 :water 1}
                      
                      :gs {:bug 2 :dragon 1 :dark 1 :electric 1/2 :fighting 2
                           :fire 1 :flying 1 :ghost 1 :grass 2 :ground 1 :ice 1
                           :normal 1 :poison 1 :psychic 1 :rock 1/2 :steel 1/2
                           :water 1}])

(deftypechart :ghost
  :name "Ghost"
  :introduced-in :rb
  :effective-against [{:bug 1 :dragon 1 :electric 1 :fighting 1 :fire 1
                       :flying 1 :ghost 2 :grass 1 :ground 1 :ice 1 :normal 0
                       :poison 1 :psychic 0 :rock 1 :water 1}
                      
                      :gs {:bug 1 :dragon 1 :dark 1 :electric 1 :fighting 1
                           :fire 1 :flying 1 :ghost 2 :grass 1 :ground 1 :ice 1
                           :normal 0 :poison 1 :psychic 2 :rock 1 :steel 1/2
                           :water 1}])

(deftypechart :grass
  :name "Grass"
  :introduced-in :rb
  :effective-against [{:bug 1/2 :dragon 1/2 :electric 1 :fighting 1 :fire 1/2
                       :flying 1/2 :ghost 1 :grass 1/2 :ground 2 :ice 1
                       :normal 1 :poison 1/2 :psychic 1 :rock 2 :water 2}
                      
                      :gs {:bug 1/2 :dragon 1/2 :dark 1 :electric 1 :fighting 1
                           :fire 1/2 :flying 1/2 :ghost 1 :grass 1/2 :ground 2
                           :ice 1 :normal 1 :poison 1/2 :psychic 1 :rock 2
                           :steel 1/2 :water 2}])

(deftypechart :ground
  :name "Ground"
  :introduced-in :rb
  :effective-against [{:bug 1/2 :dragon 1 :electric 2 :fighting 1 :fire 2
                       :flying 0 :ghost 1 :grass 1/2 :ground 1 :ice 1 :normal 1
                       :poison 2 :psychic 1 :rock 2 :water 1}
                      
                      :gs {:bug 1/2 :dragon 1 :dark 1 :electric 2 :fighting 1
                           :fire 2 :flying 0 :ghost 1 :grass 1/2 :ground 1
                           :ice 1 :normal 1 :poison 2 :psychic 1 :rock 2
                           :steel 2 :water 1}])

(deftypechart :ice
  :name "Ice"
  :introduced-in :rb
  :effective-against [{:bug 1 :dragon 2 :electric 1 :fighting 1 :fire 1
                       :flying 2 :ghost 1 :grass 2 :ground 2 :ice 1/2 :normal 1
                       :poison 1 :psychic 1 :rock 1 :water 1/2}
                      
                      :gs {:bug 1 :dragon 2 :dark 2 :electric 1 :fighting 1
                           :fire 1/2 :flying 2 :ghost 1 :grass 2 :ground 2
                           :ice 1/2 :normal 1 :poison 1 :psychic 1 :rock 1
                           :steel 1/2 :water 1/2}])

(deftypechart :normal
  :name "Normal"
  :introduced-in :rb
  :effective-against [{:bug 1 :dragon 1 :electric 1 :fighting 1 :fire 1
                       :flying 1 :ghost 0 :grass 1 :ground 1 :ice 1 :normal 1
                       :poison 1 :psychic 1 :rock 1/2 :water 1}
                      
                      :gs {:bug 1 :dragon 1 :dark 1 :electric 1 :fighting 1
                           :fire 1 :flying 1 :ghost 0 :grass 1 :ground 1 :ice 1
                           :normal 1 :poison 1 :psychic 1 :rock 1/2 :steel 1/2
                           :water 1}])

(deftypechart :poison
  :name "Poison"
  :introduced-in :rb
  :effective-against [{:bug 2 :dragon 1 :electric 1 :fighting 1 :fire 1
                       :flying 1 :ghost 1/2 :grass 2 :ground 1/2 :ice 1
                       :normal 1 :poison 1/2 :psychic 1 :rock 1/2 :water 1}
                      
                      :gs {:bug 1 :dragon 1 :dark 1 :electric 1 :fighting 1
                           :fire 1 :flying 1 :ghost 1/2 :grass 2 :ground 1/2
                           :ice 1 :normal 1 :poison 1/2 :psychic 1 :rock 1/2
                           :steel 0 :water 1}])

(deftypechart :psychic
  :name "Psychic"
  :introduced-in :rb
  :effective-against [{:bug 1 :dragon 1 :electric 1 :fighting 2 :fire 1
                       :flying 1 :ghost 1 :grass 1 :ground 1 :ice 1 :normal 1
                       :poison 2 :psychic 1/2 :rock 1 :water 1}
                      
                      :gs {:bug 1 :dragon 1 :dark 0 :electric 1 :fighting 2
                           :fire 1 :flying 1 :ghost 1 :grass 1 :ground 1 :ice 1
                           :normal 1 :poison 2 :psychic 1/2 :rock 1 :steel 1/2
                           :water 1}])

(deftypechart :rock
  :name "Rock"
  :introduced-in :rb
  :effective-against [{:bug 2 :dragon 1 :electric 1 :fighting 1/2 :fire 2
                       :flying 2 :ghost 1 :grass 1 :ground 1/2 :ice 2
                       :normal 1 :poison 1 :psychic 1 :rock 1 :water 1}
                      
                      :gs {:bug 2 :dragon 1 :dark 1 :electric 1 :fighting 1/2
                           :fire 2 :flying 2 :ghost 1 :grass 1 :ground 1/2
                           :ice 2 :normal 1 :poison 1 :psychic 1 :rock 1
                           :steel 1/2 :water 1}])

(deftypechart :steel
  :name "Steel"
  :introduced-in :gs
  :effective-against [{:bug 1 :dragon 1 :dark 1 :electric 1 :fighting 1
                       :fire 1/2 :flying 1 :ghost 1 :grass 1 :ground 1 :ice 2
                       :normal 1 :poison 1 :psychic 1 :rock 2 :steel 1/2
                       :water 1/2}])

(deftypechart :water
  :name "Water"
  :introduced-in :rb
  :effective-against [{:bug 1 :dragon 1/2 :electric 1 :fighting 1 :fire 2
                       :flying 1 :ghost 1 :grass 1/2 :ground 2 :ice 1
                       :normal 1 :poison 1 :psychic 1 :rock 2 :water 1/2}
                      
                      :gs {:bug 1 :dragon 1/2 :dark 1 :electric 1 :fighting 1
                           :fire 2 :flying 1 :ghost 1 :grass 1/2 :ground 2
                           :ice 1 :normal 1 :poison 1 :psychic 1 :rock 2
                           :steel 1 :water 1/2}])
