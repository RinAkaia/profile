(ns profile-app.core
  (:require
   [reagent.dom :as rdom]
   [re-frame.core :as re-frame]
   [profile-app.events :as events]
   [profile-app.routes :as routes]
   [profile-app.views :as views]
   [profile-app.config :as config]))


(defn dev-setup []
  (when config/debug?
    (println "dev mode")))

(defn ^:dev/after-load mount-root []
  (re-frame/clear-subscription-cache!)
  (let [root-el (.getElementById js/document "app")]
    (rdom/unmount-component-at-node root-el)
    (rdom/render [views/main-panel] root-el)))

(defn init []
  (routes/app-routes)
  (re-frame/dispatch-sync [::events/initialize-db])
  (dev-setup)
  (mount-root))
