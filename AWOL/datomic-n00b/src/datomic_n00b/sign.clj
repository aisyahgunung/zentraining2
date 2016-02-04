(ns datomic-n00b.sign
  (:require
  (:require
    [datomic.api :as d]))

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
