(ns datomic-n00b.usage)

;1
; (use '[datomic.api :only [q db] :as d])
;2
; (def uri "datomic:mem://n00b")
;3
; (d/create-database uri)
;4
; (def conn (d/connect uri))

;5
;(def schema-1 (read-string (slurp "resources/schema.edn")))

;6
; @(d/transact conn schema-1)


;adding entities
;@(d/transact conn [{:db/id #db/id[:db.part/user] :user/name "adam" :user/email "adam@junkey.com" :user/password "qwerty"}])

;query to retreive the records
; (d/q '[:find ?e ?name ?email ?pw
; :where
; [?e :user/email "adam@junkey.com"]
; [?e :user/name ?name]
; [?e :user/email ?email]
; [?e :user/password ?pw]]
; (d/db (d/connect uri)))