(ns laohuangli.const-test
  (:require [clojure.test :refer :all]
            [laohuangli.const :refer :all]))

(deftest weekdays-test
  (testing "weekend?"
    (is (weekend? :星期六))
    (is (weekend? :星期日))
    (is (weekend? "星期六"))
    (is (weekend? "星期日"))
    (is (not (weekend? :星期一))))
  (testing "weekday?"
    (is (weekday? :星期一))
    (is (weekday? :星期二))
    (is (weekday? :星期三))
    (is (weekday? :星期四))
    (is (weekday? :星期五))
    (is (weekday? "星期五"))
    (is (not (weekday? :星期六)))
    (is (not (weekday? :星期日)))))
