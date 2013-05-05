
(ns smogon.repl
  (:require [taoensso.timbre :as log]
            [clojure.tools.nrepl.server :as nrepl.server]))

(defn start-repl []
  (let [port 1234] 
    (nrepl.server/start-server :port port)
    (log/info "Starting Smogon nrepl on port" port)))
