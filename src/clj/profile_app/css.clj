(ns profile-app.css
  (:require [garden.def :refer [defstyles]]))

(defstyles screen
  [:body {:color :#ffffff
          :background-color :#1A222C}]

  [:main {:display :flex}]

  [:section {:display :flex
             :flex-direction :column
             :padding :24px}]


  [:.bio-card.MuiCard-root {:width :320px
                            :min-width :320px
                            :background-color :#2c3e50}

   [:* {:color :#ffffff}]

   [:.media {:height "480px"}]])
