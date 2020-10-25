(ns profile-app.pages
  (:require
   [re-frame.core :as re-frame]

   [profile-app.core.subs :as subs]))

(defn blog []
  [:div
   [:h1 "This is the Blog Page."]

   [:div
    [:a {:href "#/profile"} "go to Profile Page"]]])
