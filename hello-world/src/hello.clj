(ns hello
  (:require [hello-time :as ht]
            [strs]))

(defn run [opts]
  (println strs/hello-prefix (ht/time-str (ht/now))))
