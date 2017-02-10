(ns quephird.core
  (:require [ragtime.jdbc :as jdbc]
            [ragtime.repl :as repl]))

(defn load-config []
  {:datastore  (jdbc/sql-database "jdbc:postgresql://localhost:12345/postgres?user=postgres")
   :migrations (jdbc/load-resources "migrations")})

(defn migrate []
  (repl/migrate (load-config)))

(defn rollback []
  (repl/rollback (load-config)))
