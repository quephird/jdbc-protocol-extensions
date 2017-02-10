(defproject jdbc-protocol-extensions "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.slf4j/slf4j-api "1.7.22"]
                 [org.slf4j/slf4j-log4j12 "1.7.22"]
                 [org.postgresql/postgresql "9.4.1212.jre7"]
                 [ragtime "0.6.3"]]
  :plugins [[lein-postgres "0.1.1"]]
  :postgres {:port 12345
             :clean-data-directory true}
  :aliases {"migrate"  ["run" "-m" "quephird.core/migrate"]
            "rollback" ["run" "-m" "quephird.core/rollback"]})
