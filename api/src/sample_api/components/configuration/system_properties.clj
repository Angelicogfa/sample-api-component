(ns sample-api.components.configuration.system-properties
  (:require [environ.core :refer [env]]
            [com.stuartsierra.component :as component]
            [sample-api.components.database.database :refer [new-database]]))

(def settings {:environment :prod
               :host        "0.0.0.0"
               :port         8080
               :database {:connection-string (env :connection-string "jdbc:sqlserver://localhost:1433;databaseName=sample_database;user=sa;password=P@ssw0rd1!")}})

(defn base [setting]
  (let [database (:database setting)]
    (component/system-map
     :database (new-database (:connection-string database)))))