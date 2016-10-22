(ns nahim.models.posts
  (:refer-clojure :exclude [get])
  (:require [clojure.java.jdbc :as j]
            [clojure.java.jdbc.sql :as s]))

(def mysql-db {:subprotocol "mysql"
               :subname "//localhost:3306/nahim"
               :user "user"
               :pass " "
               :zeroDateTimeBehaviour "convertToNull"})

(def now
  (str (java.sql.Timestamp. (System/currentTimeMillis))))

(defn all []
  (j/query mysql-db
    (s/select * :posts)))
