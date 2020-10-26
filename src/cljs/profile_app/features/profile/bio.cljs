(ns profile-app.features.profile.bio
  (:require
   [re-frame.core :as re-frame]
   [reagent-material-ui.components :as mui]

   [profile-app.core.subs :as subs]))

(defn- short-info []
  (let [bio (re-frame/subscribe [::subs/bio])]
    (map-indexed
     (fn [index item] [:p {:key index} (str item)]) @bio)))

(defn view []
  (let [firstname (re-frame/subscribe [::subs/firstname])
        secondname (re-frame/subscribe [::subs/secondname])]

    [mui/card {:className "bio-card"}
     [mui/card-media {:className "media"
                      :image "/assets/avatar.jpeg"
                      :title "Avatar"}]

     [mui/card-content
      [mui/typography {:gutterBottom true
                       :variant "h5"
                       :component "h2"} (str @firstname " " @secondname)]

      [mui/typography {:variant "body2"
                       :color "textSecondary"
                       :component "div"} (short-info)]]]))
