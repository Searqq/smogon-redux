
(defproject smogon "0.1.0-SNAPSHOT"
  :description "Pokemon, occasionally on the internet."
  :url "http://www.smogon.com/"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/core.logic "0.8.3"]
                 [org.clojure/tools.trace "0.7.5"]
                 [org.clojure/tools.macro "0.1.2"]
                 [enlive "1.1.1"]
                 [compojure "1.1.5"]
                 [http-kit "2.0.1"]
                 [com.taoensso/timbre "1.5.2"] ;; Logger
                 [ring "1.1.8"]]
  :plugins [[lein-exec "0.3.0"]]
  :repl-options {
                 :init (do
                         ;; Useful libraries
                         (use 'clojure.repl)
                         (require '[clojure.core.logic :as l])
                         (require '[clojure.java.io :as io])
                         (use 'clojure.tools.trace)
                         
                         ;; Smogon stuff
                         (use 'smogon.dex)
                         (use 'smogon.runweb)

                         (load-dex-files))
                 }
  :local-repo ".m2")


