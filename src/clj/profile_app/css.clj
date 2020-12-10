(ns profile-app.css
  (:require [garden.def :refer [defstyles]]))

(defstyles screen
  [:body {:height :100%
          :font-family :Roboto
          :color :#c9d1d9
          :background-color :#0d1117}]

  [:main {:display :flex}]

  [:section {:display :flex
             :flex-direction :column
             :padding :24px}]

  [:.MuiPaper-root :.MuiCard-root {:background-color :#161b22!important}]

  [:.bio-card.MuiCard-root {:width :260px
                            :min-width :260px}

   [:* {:color :#c9d1d9}]

   [:.media {:height "320px"}]]

  [:.MuiChip-root {:background-color :#21262d}])

(defstyles devtools
  [:#--re-frame-10x-- {}
   [:.panel-content :.panel-content-tabs
    {:background-color :#161b22!important}]

   [:pre :.code-fragment ".code-fragment .rc-h-box .rc-box"
    :.app-db-path--header :.app-db-path--path-header
    ".app-db-path--path-header .form-control"
    {:background-color :#21262d!important}]

   [".app-db-path--path-header .form-control"
    {:color :#c9d1d9}]])
