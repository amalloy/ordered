(defproject ordered "0.3.0"
  :description "Pure-clojure implementation of ruby's ordered hash and set types - instead of sorting by key, these collections retain insertion order."
  :dependencies [[clojure "[1.2.1,1.3.0]"]
                  ; [clojure-contrib "1.2.0"] ; Not used anywhere.
                 ]
  :dev-dependencies [; [org.clojars.flatland/cake-marginalia "0.6.1"]
                     ; This dependency doesn't download.
                     [ordered-set "0.2.2"]] ; Not required except for benchmarks.
  :tasks [cake-marginalia.tasks])
