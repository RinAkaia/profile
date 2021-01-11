(ns profile-app.lib.devtools
  (:require
   [devtools.core :as devtools]
   [profile-app.core.config :as config]))

(defn setup "Devtools setup" []
  (let [formatters-style (let [{:keys [cljs-land-style]} (devtools/get-prefs)]
                           (str config/formatters-style cljs-land-style))]

    (devtools/set-pref! :cljs-land-style formatters-style))
  (devtools/install!))
