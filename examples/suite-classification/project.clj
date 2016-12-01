(defproject suite-classification "0.3.1-SNAPSHOT"
  :description "Example of using the turn key classification system"
  :url "http://github.com/thinktopic/cortex"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [thinktopic/cortex.suite "0.3.1-SNAPSHOT"]
                 ;;If you have cuda-8.0 installed then add this:
                 [thinktopic/gpu-compute "0.3.1-SNAPSHOT"]]
  :main suite-classification.main
  :aot [suite-classification.main])
