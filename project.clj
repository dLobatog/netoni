(defproject netoni "0.1.0-SNAPSHOT"
  :license {:name "GPLv3"
            :url "https://www.gnu.org/licenses/gpl.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot netoni.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
