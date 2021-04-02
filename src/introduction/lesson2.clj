(ns introduction.lesson2)

(defn post-discount-amount
  "Returns the amount with a discount of 10%."
  [original-amount]
  (def discount 0.10)
  (* original-amount (- 1 discount)))

(println (post-discount-amount 100))

(println discount)

(defn post-discount-amount
  "Returns the amount with a discount of 10%."
  [original-amount]
  (let [local-discount 0.10]
    (* original-amount (- 1 local-discount))))

(println (post-discount-amount 100))

(defn post-discount-amount
  "Returns the amount with a discount of 10%."
  [original-amount]
  (let [local-discount (/ 10 100)]
    (* original-amount (- 1 local-discount))))

(println (post-discount-amount 100))

(println (class 90.0))
(println (class 90N))
(println (class 90M))

(defn post-discount-amount
  "Returns the amount with a discount of 10%."
  [original-amount]
  (let [percentage-discount (/ 10 100)
        discount-amount (* percentage-discount original-amount)]
    (println "Calculating discount of" discount-amount)
    (- original-amount discount-amount)))

(println (post-discount-amount 100))

(if (> 500 100)
  (println "Greater")
  (println "Less or equal"))

(if (> 50 100)
  (println "Greater")
  (println "Less or equal"))

(defn post-discount-amount
  "Returns the amount with a discount of 10% if the amount is greater than 100"
  [original-amount]
  (if (> original-amount 100)
    (let [percentage-discount (/ 10 100)
          discount-amount (* percentage-discount original-amount)]
      (println "Calculating discount of" discount-amount)
      (- original-amount discount-amount))))

(println (post-discount-amount 1000))

(println (if nil "true" "false"))

(defn post-discount-amount
  "Returns the amount with a discount of 10% if the amount is greater than 100"
  [original-amount]
  (if (> original-amount 100)
    (let [percentage-discount (/ 10 100)
          discount-amount (* percentage-discount original-amount)]
      (println "Calculating discount of" discount-amount)
      (- original-amount discount-amount))
    original-amount))

(println (post-discount-amount 1000))
(println (post-discount-amount 100))