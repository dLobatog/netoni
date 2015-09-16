(ns netoni.core
  (:gen-class)
  (:import [java.net NetworkInterface])
  (:use clojure.contrib.command-line))

(defn -main [& args]
  (with-command-line args
      "Netoni"
      [[foo "foo arg" 1]
       remaining]
    (println "foo: " foo)
    (println "remaining: " remaining)))

(comment
  (defn list-interface-names
    "Lists names of networks interfaces in host"
    (enumeration-seq (NetworkInterface/getNetworkInterfaces))))
