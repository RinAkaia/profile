(ns profile-app.ui.atoms
  (:require [cljss.reagent :refer-macros [defstyled]]))

(defstyled wrapper :div
  {:padding :16px
   :margin-bottom :5px})

(defn avatar "An avatar atom"
  [{:keys [url]}]

  (wrapper [:img {:src url}]))
