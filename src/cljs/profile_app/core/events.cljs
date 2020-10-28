(ns profile-app.core.events
  (:require
   [re-frame.core :as rf]
   [day8.re-frame.tracing :refer-macros [fn-traced]]

   [profile-app.core.db :as db]))

(rf/reg-event-db ::initialize-db
                 (fn-traced [_ _] db/default-db))

(rf/reg-event-db
 ::set-active-page (fn-traced [db [_ active-page]]
                              (assoc db :active-page active-page)))
