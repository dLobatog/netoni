(ns netoni.core
  (:import [java.net NetworkInterface])
  (:gen-class))

(defn list-interface-names
  "Lists names of networks interfaces in host"
  (enumeration-seq (NetworkInterface/getNetworkInterfaces)))

(defn -main
  "For the moment I list network interfaces"
  [& args]
  list-interface-names)
