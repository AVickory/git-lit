(ns git-lit.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [git-lit.core-test]))

(doo-tests 'git-lit.core-test)
