(ns profile-app.ui.atoms.avatar
  (:require [cljss.core :refer-macros [defstyles]]
            [cljss.reagent :refer-macros [defstyled]]))

(defn _atom "An avatar atom"
  [{:keys [url]}]

  [:img {:src url}])
