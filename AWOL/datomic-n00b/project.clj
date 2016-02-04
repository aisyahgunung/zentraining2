(defproject datomic-n00b "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [com.datomic/datomic-free "0.9.5327"]
                 [expectations "2.1.4"]]
  :jvm-opts ^:replace ["-Xmx1g" "-server"]
  :profiles {:dev {:source-paths ["dev"]}})


