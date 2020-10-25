(ns profile-app.core.main
  (:require
   [reagent.dom :as rdom]
   [re-frame.core :as re-frame]

   [profile-app.core.events :as events]
   [profile-app.core.routes :as routes]
   [profile-app.core.subs :as subs]
   [profile-app.core.config :as config]
   [profile-app.features.profile.page :as profile]
   [profile-app.features.blog.page :as blog]))

(defn dev-setup []
  (when config/debug? (println "dev mode")))

(defn- show-page [page-name]
  (case page-name
    :profile [profile/page]
    :blog [blog/page]
    [:div]))

(defn root []
  (let [active-page (re-frame/subscribe [::subs/active-page])]
    [show-page @active-page]))

(defn ^:dev/after-load mount-root []
  (re-frame/clear-subscription-cache!)
  (let [root-el (.getElementById js/document "app")]
    (rdom/unmount-component-at-node root-el)
    (rdom/render [root] root-el)))

(defn init []
  (routes/app-routes)
  (re-frame/dispatch-sync [::events/initialize-db])
  (dev-setup)
  (mount-root))
