(ns profile-app.core.routes
  (:require-macros [secretary.core :refer [defroute]])
  (:import [goog History] [goog.history EventType])
  (:require [secretary.core :as secretary]
            [goog.events :as gevents]
            [re-frame.core :as rf]
            [profile-app.core.events :as events]
            [profile-app.pages.showcase :as showcase]
            [profile-app.pages.feed :as feed]))

(defn- hook-browser-navigation! []
  (doto (History.)

    (gevents/listen EventType/NAVIGATE
                    (fn [event] (secretary/dispatch! (.-token ^js event))))

    (.setEnabled true)))

(defn subscribe []
  (secretary/set-config! :prefix "#")
  ;; define routes here

  (defroute "/" []
    (rf/dispatch [::events/activate-route :showcase]))

  (defroute "/showcase" []
    (rf/dispatch [::events/activate-route :showcase]))

  (defroute "/feed" []
    (rf/dispatch [::events/activate-route :feed]))

  (hook-browser-navigation!))

(defn resolve-route [view-id]
  (case view-id
    :showcase [showcase/view]
    :feed [feed/view]
    [:div {} "Error 404"]))
