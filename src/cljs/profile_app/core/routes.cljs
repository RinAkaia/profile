(ns profile-app.core.routes
  (:require-macros [secretary.core :refer [defroute]])
  (:import [goog History] [goog.history EventType])

  (:require
   [secretary.core :as secretary]
   [goog.events :as gevents]
   [re-frame.core :as rf]

   [profile-app.core.events :as events]))


(defn hook-browser-navigation! []
  (doto (History.)

    (gevents/listen EventType/NAVIGATE
                    (fn [event] (secretary/dispatch! (.-token ^js event))))

    (.setEnabled true)))


(defn app-routes []
  (secretary/set-config! :prefix "#")
  ;; define routes here

  (defroute "/" []
    (rf/dispatch [::events/set-active-page :profile]))

  (defroute "/profile" []
    (rf/dispatch [::events/set-active-page :profile]))

  (defroute "/blog" []
    (rf/dispatch [::events/set-active-page :blog]))

  (hook-browser-navigation!))
