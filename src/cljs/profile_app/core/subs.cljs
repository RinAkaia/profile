(ns profile-app.core.subs
  (:require
   [re-frame.core :as rf]))

(rf/reg-sub ::active-route (fn [db _] (:active-route db)))

(rf/reg-sub ::firstname (fn [db] (:firstname db)))
(rf/reg-sub ::secondname (fn [db] (:secondname db)))
(rf/reg-sub ::bio (fn [db] (:bio db)))
