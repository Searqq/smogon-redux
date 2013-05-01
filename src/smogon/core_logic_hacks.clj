
(ns smogon.core-logic-hacks
  "Because core.logic isn't always sane."
  (:require [clojure.core.logic :as l]
            [clojure.tools.macro :as m]))

(defmacro rel
  "Create an anonymous relation.

  This is a ridiculous hack because there is no way to create a relation without
  binding it to a var."
  [& args]
  (let [relsym (gensym "rel")]
    `(do
       (l/defrel ~relsym ~@args)
       ~relsym)))

(defmacro defrel
  "defrel with defonce semantics and docstrings."
  [name & args]
  `(defonce ~name (rel ~@args)))

(defmacro defquery
  [name & args]
  (let [[name [args queryvars & body]] (m/name-with-attributes name args)] 
    `(defn ~name ~args
       (doall (l/run* ~queryvars ~@body)))))

(defmacro defpredicate
  [name & args]
  (let [[name [args & body]] (m/name-with-attributes name args)] 
    `(defn ~name ~args
       ;; Warning: this is not the same as not-empty because Clojure is stupid
       ;; as fuck and thinks returning the list is accetpable answer (hint: its
       ;; not, return true or false please)
       (not (empty? (l/run 1 [q#] ~@body))))))

(defmacro defsingleton
  [name & args]
  (let [[name [args queryvars & body]] (m/name-with-attributes name args)] 
    `(defn ~name ~args
       (first (l/run 1 ~queryvars ~@body)))))
