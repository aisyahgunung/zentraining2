(ns user
  (:require
    [datomic.api :as d]))

(def uri "datomic:mem://n00b")


(defn starting []
  (d/create-database uri)
  (println "In-mem started !!!"))

(starting)


(defn make-schema []
  (let [conn (d/connect uri)
        schema-1 (read-string
                   (slurp "resources/schema.edn"))]
    @(d/transact conn schema-1)
    (println "Schema created !!!")))

(make-schema)