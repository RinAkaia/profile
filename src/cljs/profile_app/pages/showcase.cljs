(ns profile-app.pages.showcase
  (:require
   [reagent-material-ui.components :as mui]
   [profile-app.ui.organisms :as organisms]))

(defn view []
  [:main
   [organisms/bio]

   [:section
    [:h2 "The app is under construction"]

    [mui/button {:color :primary
                 :variant :contained
                 :href "#/feed"} "Feed"]]])
