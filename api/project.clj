(defproject sample-api "0.0.1"
  :description "Uma api de teste para componentes"
  :dependencies [[org.clojure/clojure "1.10.0"]

                  ;; Compojure
                 [metosin/compojure-api "2.0.0-alpha30"]
                 [http-kit "2.3.0"]

                  ;; Banco de dados
                 [org.clojure/java.jdbc "0.7.10"]
                 [com.microsoft.sqlserver/mssql-jdbc "7.4.1.jre8"]

                 ;; Variaveis
                 [environ "1.1.0"]

                 ;; Component
                 [com.stuartsierra/component "0.4.0"]

                 ;; Logs
                 [ch.qos.logback/logback-classic "1.2.3" :exclusions [org.slf4j/slf4j-api]]
                 [org.slf4j/jul-to-slf4j "1.7.25"]
                 [org.slf4j/jcl-over-slf4j "1.7.25"]
                 [org.slf4j/log4j-over-slf4j "1.7.25"]]
  :main ^:skip-aot sample-api.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})