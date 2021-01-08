(ns profile-app.ui.organisms
  (:require
   [re-frame.core :as rf]
   [reagent-material-ui.components :as mui]
   [profile-app.core.subs :as subs]
   [profile-app.ui.atoms :as atoms]))

;; TODO: Separate data and view

(defn- short-info []
  (let [bio (rf/subscribe [::subs/bio])]
    (map-indexed
     (fn [index item] [:p {:key index} (str item)]) @bio)))

(defn bio []
  (let [firstname (rf/subscribe [::subs/firstname])
        secondname (rf/subscribe [::subs/secondname])]

    [mui/card {:className "bio-card"}
     [mui/card-media {:className "media"
                      :image "/assets/avatar.jpeg"
                      :title "Avatar"}]

     [atoms/avatar {:src "/assets/avatar.jpeg"}]

     [mui/card-content
      [mui/typography {:gutterBottom true
                       :variant :h5
                       :component :h2} (str @firstname " " @secondname)]

      [mui/typography {:variant :body2
                       :color :textSecondary
                       :component :div} (short-info)]]]))
