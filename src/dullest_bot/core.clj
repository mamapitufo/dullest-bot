(ns dullest-bot.core
  (:require [twitter.oauth :as oauth]
            [twitter.api.restful :as restful])
  (:gen-class))

(defonce app-consumer-key         (System/getenv "DULLEST_BOT_CONSUMER_KEY"))
(defonce app-consumer-secret      (System/getenv "DULLEST_BOT_CONSUMER_SECRET"))
(defonce user-access-token        (System/getenv "DULLEST_BOT_USER_ACCESS_TOKEN"))
(defonce user-access-token-secret (System/getenv "DULLEST_BOT_USER_ACCESS_TOKEN_SECRET"))

(def creds (oauth/make-oauth-creds app-consumer-key
                                   app-consumer-secret
                                   user-access-token
                                   user-access-token-secret))

(defn tweet [status]
  (restful/statuses-update :oauth-creds creds :params {:status status}))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
