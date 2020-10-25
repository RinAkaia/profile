(ns profile-app.features.profile.page
  (:require
   [re-frame.core :as re-frame]
   [reagent-material-ui.components :as mui]

   [profile-app.core.subs :as subs]))

(defn page []
  (let [firstname (re-frame/subscribe [::subs/firstname])
        secondname (re-frame/subscribe [::subs/secondname])]

    [:div
     [:h1 (str "Hello from " @firstname " " @secondname ".")]

     [:h2 "The app is under construction"]

     [mui/button {:color :primary :variant :contained} "Test"]

     [:div
      [:br]
      [:a {:href "#/blog"} "go to Blog Page"]]]))
