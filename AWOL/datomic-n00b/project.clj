(defproject datomic-n00b "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [com.datomic/datomic-free "0.9.5327"]
                 [expectations "2.1.4"]]
  :profiles {:dev
             {:datomic {:config "resources/transactor.properties"
                        :db-uri "datomic:free://127.0.0.1:4334/n00b-db"}}}
  :datomic {:schemas ["resources" ["schema.edn"]]}
  :jvm-opts ^:replace ["-Xmx1g" "-server"])


