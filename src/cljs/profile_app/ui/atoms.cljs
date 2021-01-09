(ns profile-app.ui.atoms
  (:require [cljss.core :refer-macros [defstyles]]))

(defstyles styles []
  {:padding "16px"
   :margin-bottom "5px"})

(defn avatar "An avatar atom"
  [{:keys [url]}]

  [:img {:class (styles)
         :src url}])
