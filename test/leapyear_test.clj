(ns leapyear-test
  (:require [clojure.test :refer :all]))


;; @todo A year is not a leap year if not divisible by 4
;; @todo A year is a leap year if divisible by 4
;; @todo A year is a leap year if divisible by 400
;; @todo A year is not a leap year if divisible by 100 but not by 400

(defn leap-year? [year]
  false)


(deftest leapyear-tests
  (testing "A year is not a leap year if not divisible by 4"
    (is (= (leap-year? 1995) false))))