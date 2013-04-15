
(ns smogon.runweb
  (:require [org.httpkit server]
            [compojure route handler]
            [compojure.core :refer :all]
            [ring.middleware.stacktrace :refer :all]
            [taoensso.timbre :as log]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (compojure.route/not-found "Not Found"))

(defn runweb
  "Run the server."
  []
  (let [app (-> app-routes
                compojure.handler/site
                wrap-stacktrace-log)
        port 9001]
    (org.httpkit.server/run-server app {:port port})
    (log/info "Starting Smogon web server on port" port)))

