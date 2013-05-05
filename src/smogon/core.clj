
(ns smogon.core
  "Load all the services!"
  (:require (smogon dex web repl)))

(defn start-all []
  (smogon.dex/start-dex)
  (smogon.web/start-web)
  (smogon.repl/start-repl))
