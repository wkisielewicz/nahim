(ns nahim.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [nahim.controllers.posts :as posts-controller]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] (posts-controller/index))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
