(ns profile-app.core.main
  (:require
   [reagent.dom :as rdom]
   [re-frame.core :as rf]

   [profile-app.core.events :as events]
   [profile-app.core.routes :as routes]
   [profile-app.core.subs :as subs]
   [profile-app.core.config :as config]
   [profile-app.features.profile.page :as profile-page]
   [profile-app.features.blog.page :as blog-page]))

(defn dev-setup []
  (when config/debug? (println "dev mode")))

(defn- show-page [page-name]
  (case page-name
    :profile [profile-page/view]
    :blog [blog-page/view]
    [:div]))

(defn root []
  (let [active-page (rf/subscribe [::subs/active-page])]
    [show-page @active-page]))

(defn ^:dev/after-load mount-root []
  (rf/clear-subscription-cache!)
  (let [root-el (.getElementById js/document "app")]
    (rdom/unmount-component-at-node root-el)
    (rdom/render [root] root-el)))

(defn init []
  (routes/app-routes)
  (rf/dispatch-sync [::events/initialize-db])
  (dev-setup)
  (mount-root))
