
(ns smogon.dexweb
  "Web interface to the smogdex."
  (:require [smogon.web-helpers :refer :all]
            [smogon.dex :as dex]))

(defn list-pokemon
  ""
  [pokemon]
  [:div
   (for [p pokemon]
     [:h2 (dex/name-of p)])])

(defroutes dex-routes
  (GET "/pokemon" [] (list-pokemon (dex/list-pokemon))))
