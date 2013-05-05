
(ns smogon.dexweb
  "Web interface to the smogdex."
  (:require [smogon.web-helpers :refer :all]
            [smogon.dex :as dex]))

(defn pokemon-table-row [p]
  [:tr 
   [:td (dex/name-of p)] 
   [:td (dex/atk-of p)]
   [:td (dex/def-of p)]
   (if (= dex/*gen* :rb)
     [:td (dex/special-of p)]
     (list [:td (dex/spatk-of p)]
           [:td (dex/spdef-of p)]))
   [:td (dex/speed-of p)]])

(defn list-pokemon
  [pokemon]
  [:table
   [:tr
    [:th "Name"]
    [:th "Atk"]
    [:th "Def"]
    (if (= dex/*gen* :rb)
      [:th "Spc"]
      (list [:th "SpA"]
            [:th "SpD"]))
    [:th "Spd"]]
   (for [p (sort-by dex/name-of pokemon)]
     (pokemon-table-row p))])

(defroutes dex-routes
  (GET "/pokemon" [] (list-pokemon (dex/list-pokemon))))
