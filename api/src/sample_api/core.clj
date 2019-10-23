(ns sample-api.core
  (:require [compojure.api.sweet :refer [api context routes]]
            [org.httpkit.server :refer [run-server]]
            [sample-api.controllers.todo-controller :as todo])
  (:gen-class))


(def swagger {:swagger
              {:ui "/"
               :spec "/swagger.json"
               :data {:info {:title "Exemplo de CRUD"
                             :description "Cadastro geral"}
                      :tags [{:name "ToDo" :description "Cadastro de itens"}]}}})

(def app
  (api
   swagger
   (context "/api" []
     :tags ["ToDo"]
     (apply routes todo/routes))))

(defn -main []
  (let [port 8081]
    (run-server app {:port port})
    (println (str "Listning on port: " port))))