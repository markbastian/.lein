{:user {:plugins [[cider/cider-nrepl "0.16.0"]
                  ;[refactor-nrepl "2.3.1"]
                  [lein-ancient "0.6.15"]
                  [jonase/eastwood "0.2.5"]
                  [lein-simpleton "1.3.0"]
                  [lein-kibit "0.1.6"]
                  [lein-codox "0.10.3"]
                  [lein2-eclipse "2.0.0"]
                  [hiccup-bridge "1.0.1"]
                  [lein-marginalia "0.9.1"]
                  [lein-set-version "0.4.1"]
                  [lein-create-template "0.2.0"]
                  [venantius/ultra "0.5.2"]]
        :dependencies [[slamhound "1.5.5"]
                       [datawalk "0.1.10"]
                       [spyscope "0.1.7-SNAPSHOT"]
                       [org.clojure/tools.trace "0.7.9"]
;                       [jsofra/data-scope "0.1.2"]
]
        :aliases {"slamhound" ["run" "-m" "slam.hound"]}
        :injections [(require '[spyscope.core :as spy])
             (use 'spyscope.repl)
             ;(require 'data-scope.charts)
             ;(require 'data-scope.graphs)
             ;(require 'data-scope.inspect)
             ;(require 'data-scope.pprint)
             (use 'clojure.tools.trace)]}}
