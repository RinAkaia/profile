(ns profile-app.core.config
  (:require [devtools.core :as devtools]))

(def debug?
  ^boolean goog.DEBUG)

(def formatters-style
  (let [{:keys [cljs-land-style]} (devtools/get-prefs)]
    (str "filter:invert(90%);" cljs-land-style)))
