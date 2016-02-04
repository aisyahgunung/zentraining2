(ns user
  (:require
    [datomic.api :as d]))

(def uri "datomic:mem://n00b")
(def conn (d/connect uri))
(def schema-1 (read-string
                (slurp "resources/schema.edn")))


(defn starting []
  (d/create-database uri)
  (println "In-mem started !!!"))

(starting)


(defn make-schema []
  @(d/transact conn schema-1)
  (println "Schema created !!!"))

(make-schema)