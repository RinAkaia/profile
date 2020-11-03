(ns profile-app.views.showcase
  (:require
   [re-frame.core :as rf]
   [reagent-material-ui.components :as mui]
   [profile-app.core.events :as events]
   [profile-app.features.profile.bio :as bio]))

;; (defn- show-feed [] (rf/dispatch [::events/activate-route :feed]))

(defn view []
  [:main
   [bio/view]

   [:section
    [:h2 "The app is under construction"]

    [mui/button {:color :primary
                 :variant :contained
                 :href "#/feed"} "Feed"]]])
