
(ns smogon.dexweb
  "Web interface to the smogdex."
  (:require [smogon.web-helpers :refer :all]
            [smogon.dex :as dex]))

(defn pokemon-table-row [p]
  (let [p (dex/summarize-pokemon p)] 
    [:tr
     [:td (:name p)]
     [:td (clojure.string/join "/" (map dex/name-of (:type p)))]
     [:td (map (fn [x] [:div (dex/name-of x)]) (:abilities p))]
     [:td (:hp p)] 
     [:td (:atk p)]
     [:td (:def p)]
     [:td (:spatk p)]
     [:td (:spdef p)]
     [:td (:speed p)]]))

(defn list-pokemon
  [pokemon]
  [:table
   [:tr
    [:th "Name"]
    [:th "Type"]
    [:th "Abilities"]
    [:th "Atk"]
    [:th "Def"]
    [:th "SpA"]
    [:th "SpD"]
    [:th "Spd"]]
   (for [p (sort-by dex/name-of pokemon)]
     (pokemon-table-row p))])

(defroutes dex-routes
  (GET "/pokemon" [] (list-pokemon (dex/list-pokemon))))
