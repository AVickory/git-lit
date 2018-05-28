(ns git-lit.core-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            [git-lit.core :as core]))

(deftest fake-test
  (testing "fake description"
    (is (= 1 2))))
