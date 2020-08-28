(ns leapyear-test
  (:require [clojure.test :refer :all]))


;; @todo A year is not a leap year if not divisible by 4
;; @todo A year is a leap year if divisible by 4
;; @todo A year is a leap year if divisible by 400
;; @todo A year is not a leap year if divisible by 100 but not by 400

(defn leap-year? [year]
  (if (zero? (mod year 100))
    (zero? (mod year 400))
    (zero? (mod year 4))))


(deftest leapyear-tests
  (testing "A year is not a leap year if not divisible by 4"
    (is (= (leap-year? 1995) false))
    (is (= (leap-year? 1) false)))

  (testing "A year is a leap year if divisible by 4"
    (is (= (leap-year? 1996) true))
    (is (= (leap-year? 0) true))
    (is (= (leap-year? 4) true))
    (is (= (leap-year? 2020) true)))

  (testing "A year is a leap year if divisible by 400",
    (is (= (leap-year? 1600) true)))

  (testing "A year is not a leap year if divisible by 100 but not by 400",
    (is (= (leap-year? 1800) false)))
  )