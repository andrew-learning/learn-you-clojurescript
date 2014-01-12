(ns learn-you-clojurescript.addnums)

(defn -main [& args]
  (->> (map #(js/Number %1) args) ; No need to skip first 2 args
       (reduce +)
       (println)))

(set! *main-cli-fn* -main)
