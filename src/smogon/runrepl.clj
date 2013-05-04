
(ns smogon.runrepl
  (:require [clojure.tools.nrepl.server :as nrepl]))

(defn runrepl []
  (nrepl/start-server :port 1234))

