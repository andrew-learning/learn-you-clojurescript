(ns learn-you-clojurescript.linecount
  (:require [clojure.string :as str]))

(defn -main [& args]
  (let [fs (js/require "fs")]
    (->> (first args)
         (fs/readFileSync)
         (str)
         ((fn [s] (str/split s #"\n")))
         (count)
         (println))))

(set! *main-cli-fn* -main)
