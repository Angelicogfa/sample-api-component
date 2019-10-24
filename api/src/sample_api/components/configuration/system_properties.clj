(ns sample-api.configuration.system-properties
  (:require [environ.core :refer [env]]
            [com.stuartsierra.component :as component]))

(def settings {:environment :prod
               :host        "0.0.0.0"
               :port         8080
               :database {:connection-string (env :connection-string "jdbc:sqlserver://localhost:1433;databaseName=sample_database;user=sa;password=P@ssw0rd1!;")}})


