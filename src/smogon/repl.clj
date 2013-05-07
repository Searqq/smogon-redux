
(ns smogon.repl
  (:require [taoensso.timbre :as log]
            [clojure.tools.nrepl.server :as nrepl.server]))

(defn start-repl [& {:keys [port], :or {port 1234}}]
  (nrepl.server/start-server :port port)
  (log/info "Starting Smogon nREPL on port" port))
