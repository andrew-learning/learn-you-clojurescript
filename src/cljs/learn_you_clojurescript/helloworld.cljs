(ns learn-you-clojurescript.helloworld
  (:require [clojure.string :as str]))

(defn -main [& args]
  (->> ["hello" "world"]
       (str/join " ")
       (str/upper-case)
       (println)))

(set! *main-cli-fn* -main)
