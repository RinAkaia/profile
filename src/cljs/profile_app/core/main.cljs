(ns profile-app.core.main
  (:require
   [reagent.dom :as rdom]
   [re-frame.core :as rf]
   [profile-app.core.events :as events]
   [profile-app.core.routing :as routing]
   [profile-app.core.subs :as subs]
   [profile-app.core.config :as config]
   :reload-all))

(defn dev-setup "Development environment setup" []
  (when config/debug?
    (println "Dev environment mode activated.")
    (require '[profile-app.lib.devtools :as devtools])
    (devtools/setup)))

(defn root "Application root component" []
  (let [active-route (rf/subscribe [::subs/active-route])]
    [routing/resolver @active-route]))

(defn ^:dev/after-load mount-root []
  (rf/clear-subscription-cache!)
  (let [dom-root (js/document.getElementById "app")]
    (rdom/unmount-component-at-node dom-root)
    (rdom/render [root] dom-root)))

(defn init []
  (dev-setup)
  (routing/subscribe)
  (rf/dispatch-sync [::events/initialize-db])
  (mount-root))
