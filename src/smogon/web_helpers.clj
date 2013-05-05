
(ns smogon.web-helpers
  (:require [net.cgrand.enlive-html :as enlive]
            potemkin
            (compojure [core :as compojure])))

(defn emit-maybe-hiccup
  "If hiccup style, compile before emitting."
  [x]
  (enlive/emit* (if (vector? x) ;; hiccup style
                  (enlive/html x)
                  x)))

(defmacro GET
  [path args & body]
  `(compojure/GET ~path ~args 
     (emit-maybe-hiccup ~@body)))

(defmacro POST
  [path args & body]
  `(compojure/POST ~path ~args 
     (emit-maybe-hiccup ~@body)))

(potemkin/import-vars
 [compojure defroutes])
