(ns profile-app.features.profile.page
  (:require
   [reagent-material-ui.components :as mui]

   [profile-app.features.profile.bio :as bio]))

(defn view []
  [:main
   [bio/view]

   [:section
    [:h2 "The app is under construction"]
    [mui/button {:color :primary :variant :contained} "Test"]]])
