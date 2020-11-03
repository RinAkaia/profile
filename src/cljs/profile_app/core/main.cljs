(ns profile-app.core.main
  (:require
   [reagent.dom :as rdom]
   [re-frame.core :as rf]
   [profile-app.core.events :as events]
   [profile-app.core.routes :as routes]
   [profile-app.core.subs :as subs]
   [profile-app.core.config :as config]))

(defn dev-setup []
  (when config/debug? (println "You are in dev mode")))

(defn root []
  (let [active-route (rf/subscribe [::subs/active-route])]
    [routes/resolve-route @active-route]))

(defn ^:dev/after-load mount-root []
  (rf/clear-subscription-cache!)

  (let [root-el (.getElementById js/document "app")]
    (rdom/unmount-component-at-node root-el)
    (rdom/render [root] root-el)))

(defn init []
  (routes/subscribe)
  (rf/dispatch-sync [::events/initialize-db])
  (dev-setup)
  (mount-root))
