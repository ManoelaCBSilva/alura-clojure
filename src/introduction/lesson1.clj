(ns introduction.lesson1)

(println "Welcome to the inventory system")

(def products-total 15)
(println products-total)

(def products-total 13)
(println products-total)

(+ 13 3)
(- 13 3)
(+ products-total 3)
(def products-total (+ products-total 3))
(println "Total" products-total)

(def inventory ["Backpack", "T-shirt"])
(println inventory)
(println (inventory 0))
(println (count inventory))
(conj inventory "Chair")
(println inventory)
(println (conj inventory "Chair"))

(def inventory (conj inventory "Chair"))
(println inventory)

(defn print-message []
  (println "------------------------")
  (println "Welcome to the inventory"))

(print-message)

(defn apply-discount [original-amount]
  (* original-amount 0.9))

(println (apply-discount 100))
(println (apply-discount 1000))

(defn post-discount-amount
  "Returns the resulting amount of a 10% discount over the original amount"
  [original-amount]
  (* original-amount 0.9))

(println (post-discount-amount 100))
(println (post-discount-amount 1000))

(defn post-discount-amount
  "Returns the amount with a discount of 10%."
  [original-amount]
  (* original-amount (- 1 0.10)))

(println (post-discount-amount 100))
(println (post-discount-amount 1000))