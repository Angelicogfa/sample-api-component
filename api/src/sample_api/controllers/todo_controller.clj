(ns sample-api.controllers.todo-controller
  (:gen-class)
  (:require [compojure.api.sweet :refer [GET PUT DELETE POST]]
            [ring.util.http-response :refer [ok bad-request]]
            [sample-api.components.database.database :as db]))

(def routes
  [(GET "/to-do/" []
     (let [result (db/select "select * from TODO")]
       (ok result)))])