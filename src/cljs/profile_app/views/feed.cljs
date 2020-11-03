(ns profile-app.views.feed
  (:require
   [re-frame.core :as rf]
   [reagent-material-ui.components :as mui]
   [profile-app.core.subs :as subs]))

(defn view []
  [:div
   [:h1 "This is Feed"]

   [:div
    [mui/button {:color :primary
                 :variant :contained
                 :href "#/showcase"} "Showcase"]]])
