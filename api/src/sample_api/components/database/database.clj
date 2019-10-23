(ns sample-api.components.database.database
  (:require [clojure.java.jdbc :as jdbc])
  (:gen-class))

(def ^:dynamic *db-config* "jdbc:sqlserver://localhost:1433;databaseName=sample_database;user=sa;password=P@ssw0rd1!;")

(defonce db-conn (delay *db-config*))

(defn db []
  @db-conn)

(defn select [query]
  (jdbc/query (db) query))