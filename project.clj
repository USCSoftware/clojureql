(defproject clojureql "1.1.0-SNAPSHOT"
  :description      "Superior SQL integration for Clojure"
  :dependencies     [[org.clojure/clojure         "1.2.0"]
                     [org.clojure/clojure-contrib "1.2.0"]
                     [org.clojars.gfrlog/java.jdbc "0.0.5-SNAPSHOT"]]
  :dev-dependencies [[swank-clojure               "1.3.0-SNAPSHOT"]
                     [mysql/mysql-connector-java  "5.1.6"]
                     [org.xerial/sqlite-jdbc      "3.6.20.1"]
                     [postgresql/postgresql       "8.4-701.jdbc4"]])
