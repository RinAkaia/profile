(ns profile-app.css
  (:require [garden.def :refer [defstyles]]))

(defstyles screen
  [:body {:height :100%
          :color :#ffffff
          :background-color :#000000}]

  [:main {:display :flex}]

  [:section {:display :flex
             :flex-direction :column
             :padding :24px}]


  [:.bio-card.MuiCard-root {:width :260px
                            :min-width :260px
                            :background-color :#121212}

   [:* {:color :#ffffff}]

   [:.media {:height "320px"}]]

  [:.MuiPaper-root {:background-color :#121212}]

  [:.MuiChip-root {:background-color :#212121}])
