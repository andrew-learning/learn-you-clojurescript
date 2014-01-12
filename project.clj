(defproject learn-you-clojurescript "0.1.0-SNAPSHOT"
  :description "Examples from https://github.com/rvagg/learnyounode translated to ClojureScript"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2138"]]
  :plugins [[lein-cljsbuild "1.0.1"]]
  :cljsbuild
  {:builds
    [{:source-paths ["src/cljs"],
         :compiler
         {:pretty-print true,
              :output-to "resources/public/generated/learn_you_clojurescript",
              :optimizations :whitespace}}]} )
