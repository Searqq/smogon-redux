
(ns smogon.runweb
  (:use org.httpkit.server
        (compojure core route handler)
        (ring.middleware stacktrace reload))
  (:require [taoensso.timbre :as log]
            [smogon.dexweb :as dexweb]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  dexweb/dex-routes
  (compojure.route/not-found "Not Found"))

(def app (-> app-routes site wrap-stacktrace-log))
(def port 9001)

(defn runweb
  "Run the server."
  []
  (run-server app {:port port})
  (log/info "Starting Smogon web server on port" port))

