(ns datomic-n00b.usage)

(use '[datomic.api :only [q db] :as d])

(def uri "datomic:mem://n00b")