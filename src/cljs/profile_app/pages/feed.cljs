(ns profile-app.pages.feed
  (:require
   [reagent-material-ui.components :as mui]))

(defn view []
  [:div
   [:h1 "This is Feed"]

   [:div
    [mui/button {:color :primary
                 :variant :contained
                 :href "#/showcase"} "Showcase"]]])
