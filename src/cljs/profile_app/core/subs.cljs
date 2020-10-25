(ns profile-app.core.subs
  (:require
   [re-frame.core :as re-frame]))

(re-frame/reg-sub ::firstname (fn [db] (:firstname db)))
(re-frame/reg-sub ::secondname (fn [db] (:secondname db)))
(re-frame/reg-sub ::active-page (fn [db _] (:active-page db)))
