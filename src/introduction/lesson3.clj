(ns introduction.lesson3)

(defn post-discount-amount
  "Returns the amount with a discount of 10% if the amount is greater than 100"
  [original-amount]
  (if (> original-amount 100)
    (let [percentage-discount (/ 10 100)
          discount-amount (* percentage-discount original-amount)]
      (- original-amount discount-amount))
    original-amount))

(println (post-discount-amount 1000))
(println (post-discount-amount 100))

; PREDICATE
(defn should-apply-discount?
  [original-value]
  (if (> original-value 100)
    true
    false))

(println (should-apply-discount? 1000))
(println (should-apply-discount? 100))

(defn post-discount-amount
  "Returns the amount with a discount of 10% if the amount is greater than 100"
  [original-amount]
  (if (should-apply-discount? original-amount)
    (let [percentage-discount (/ 10 100)
          discount-amount (* percentage-discount original-amount)]
      (- original-amount discount-amount))
    original-amount))

(println (post-discount-amount 1000))
(println (post-discount-amount 100))

(defn should-apply-discount?
  [original-value]
  (println "Calling redefined version")
  (if (> original-value 100)
    true))

(println (should-apply-discount? 1000))
(println (should-apply-discount? 100))
(println (post-discount-amount 1000))
(println (post-discount-amount 100))

(defn should-apply-discount?
  [original-value]
  (println "Calling when version")
  (when (> original-value 100)
    true))

(println (should-apply-discount? 1000))
(println (should-apply-discount? 100))
(println (post-discount-amount 1000))
(println (post-discount-amount 100))

(defn should-apply-discount?
  [original-value]
  (println "Calling > version")
  (> original-value 100))

(println (should-apply-discount? 1000))
(println (should-apply-discount? 100))
(println (post-discount-amount 1000))
(println (post-discount-amount 100))

(defn should-apply-discount?
  [original-value]
  (> original-value 100))

(println (should-apply-discount? 1000))
(println (should-apply-discount? 100))
(println (post-discount-amount 1000))
(println (post-discount-amount 100))

(defn more-expensive-than-100?
  [original-value]
  (println "Making the invocation of more-expensive-than-100? explicit")
  (> original-value 100))

(defn post-discount-amount
  "Returns the amount with a discount of 10% if discount must be applied"
  [must-apply-discount original-amount]
  (if (must-apply-discount original-amount)
    (let [percentage-discount (/ 10 100)
          discount-amount (* percentage-discount original-amount)]
      (- original-amount discount-amount))
    original-amount))

(println "Function as parameter")
(println (post-discount-amount more-expensive-than-100? 1000))
(println (post-discount-amount more-expensive-than-100? 100))

; HIGHER ORDER FUNCTIONS
; IMMUTABILITY

(defn more-expensive-than-100? [original-value] (> original-value 100))

(println "No name function. a.k.a Anonymous")
(println (post-discount-amount (fn [original-value] (> original-value 100)) 1000))
(println (post-discount-amount (fn [original-value] (> original-value 100)) 100))
(println (post-discount-amount (fn [v] (> v 100)) 1000))
(println (post-discount-amount (fn [v] (> v 100)) 100))
(println (post-discount-amount #(> %1 100) 1000))
(println (post-discount-amount #(> %1 100) 100))
(println (post-discount-amount #(> % 100) 1000))
(println (post-discount-amount #(> % 100) 100))

(def more-expensive-than-100? (fn [original-value] (> original-value 100)))
(def more-expensive-than-100? #(> %1 100))
(println (post-discount-amount more-expensive-than-100? 1000))
(println (post-discount-amount more-expensive-than-100? 100))