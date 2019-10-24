(ns sample-api.components.database.database
  (:require [clojure.java.jdbc :as jdbc]
            [com.stuartsierra.component :as component])
  (:gen-class))

; (def ^:dynamic *db-config* (or (System/getenv "CONEXAO") "jdbc:sqlserver://localhost:1433;databaseName=sample_database;user=sa;password=P@ssw0rd1!;"))

; (defonce db-conn (delay *db-config*))

; (defn db []
;   @db-conn)

; (defn select [query]
;   (jdbc/query (db) query))

(defrecord Database [config]
  component/Lifecycle
  (start [this]
    (->> (:connection-string config)
         (assoc this :conn)))
  (stop [this]
    (assoc this :conn nil)))

(defn new-database [config]
  (-> Database config))