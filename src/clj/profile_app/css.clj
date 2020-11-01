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

  [:.MuiPaper-root :.MuiCard-root {:background-color :#121212!important}]

  [:.bio-card.MuiCard-root {:width :260px
                            :min-width :260px}

   [:* {:color :#ffffff}]

   [:.media {:height "320px"}]]

  [:.MuiChip-root {:background-color :#212121}])

(defstyles devtools
  [:#--re-frame-10x-- {}
   [:.panel-content :.panel-content-tabs
    {:background-color :#121212!important}]

   [:pre :.code-fragment ".code-fragment .rc-h-box .rc-box"
    :.app-db-path--header :.app-db-path--path-header
    ".app-db-path--path-header .form-control"
    {:background-color :#212121!important}]

   [".app-db-path--path-header .form-control"
    {:color :#ffffff}]])
