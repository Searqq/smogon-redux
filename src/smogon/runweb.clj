
(ns smogon.runweb
  (:use org.httpkit.server
        (compojure core route handler)
        (ring.middleware stacktrace reload))
  (:require [taoensso.timbre :as log]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (compojure.route/not-found "Not Found"))

(def app (-> app-routes site wrap-stacktrace-log))
(def port 9001)

(defn runweb
  "Run the server."
  []
  (run-server app {:port port})
  (log/info "Starting Smogon web server on port" port))

(defn runweb-dev
  "Run the server."
  []
  ;; The #' lets us dynamically update app-routes.
  (let [app-dev (-> #'app wrap-reload)] 
    (run-server app-dev {:port port})
    (log/info "Starting Smogon web server (DEV!!!) on port" port)))
