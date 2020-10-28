(ns profile-app.features.blog.page
  (:require
   [re-frame.core :as rf]

   [profile-app.core.subs :as subs]))

(defn view []
  [:div
   [:h1 "This is the Blog Page.."]

   [:div
    [:a {:href "#/profile"} "go to Profile Page"]]])
