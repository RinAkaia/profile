(ns profile-app.pages
  (:require
   [re-frame.core :as re-frame]
   [reagent-material-ui.components :as mui]

   [profile-app.core.subs :as subs]))

(defn profile []
  (let [firstname (re-frame/subscribe [::subs/firstname])
        secondname (re-frame/subscribe [::subs/secondname])]

    [:div
     [:h1 (str "Hello from " @firstname " " @secondname ".")]

     [mui/button {:color :primary :variant :contained} "I love Lisp"]

     [:div
      [:br]
      [:a {:href "#/blog"} "go to Blog Page"]]]))
