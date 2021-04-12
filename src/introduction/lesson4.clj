(ns introduction.lesson4)

(def prices [30 700 1000])

(println (prices 0))
(println (get prices 0))
(println (get prices 2))
; (println (prices 17))
(println "Default value is nil" (get prices 17))
(println "Default value is 0" (get prices 17 0))
(println "Default value is 0, but element exists" (get prices 2 0))

(println (conj prices 5))
(println prices)

; (println (conj 5 prices))

(println (+ 5 1))
(println (inc 5))
(println (update prices 0 inc))
(println (update prices 1 dec))
(println prices)

(defn soma-1
  [amount]
  (println "Adding 1 to" amount)
  (+ amount 1))

(println (update prices 0 soma-1))

(defn soma-3
  [amount]
  (println "Adding 3 to" amount)
  (+ amount 3))

(println (update prices 0 soma-3))

; Code from past lesson

(defn should-apply-discount?
  [original-value]
  (> original-value 100))

(defn post-discount-amount
  "Returns the amount with a discount of 10% if the amount is greater than 100"
  [original-amount]
  (if (should-apply-discount? original-amount)
    (let [percentage-discount (/ 10 100)
          discount-amount (* percentage-discount original-amount)]
      (- original-amount discount-amount))
    original-amount))

(println prices)

(println (map post-discount-amount prices))

(println (range 10))
(println (filter even? (range 10)))

(println "array" prices)
(println "filter" (filter should-apply-discount? prices))

(println "post-filter map" (map post-discount-amount (filter should-apply-discount? prices)))

(println "array" prices)
(println (reduce + prices))

(defn my-sum
  [amount-1 amount-2]
  (println "summing" amount-1 amount-2)
  (+ amount-1 amount-2))

(println (reduce my-sum prices))
(println (reduce my-sum (range 10)))
(println (reduce my-sum [15]))

(println (reduce my-sum 0 prices))
(println (reduce my-sum 0 (range 10)))
(println (reduce my-sum 0 [15]))

(println (reduce my-sum 0 []))
; (def empty-array [])
; (println (reduce my-sum empty-array))
