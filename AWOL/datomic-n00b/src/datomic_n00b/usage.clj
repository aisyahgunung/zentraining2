(ns datomic-n00b.usage)

(use '[datomic.api :only [q db] :as d])

(def uri "datomic:free://localhost:4334/n00b-db")