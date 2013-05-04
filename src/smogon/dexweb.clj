
(ns smogon.dexweb
  "Web interface to the smogdex."
  (:use compojure.core)
  (:require [smogon.dex :as dex]))

(defroutes dex-routes
  (GET "/dex" [] "hello world from dex"))
