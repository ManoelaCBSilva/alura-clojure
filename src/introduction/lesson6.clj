(ns introduction.lesson6)

(def order {:backpack {:quantity 2, :price 80}
            :t-shirt  {:quantity 3, :price 40}})

(defn print-and-15 [value]
  (println "value" value)
  15)

(println (map print-and-15 order))

; (defn print-and-15 [key value]
;   (println key "and" value)
;   15)

; (println (map print-and-15 order))

(defn print-and-15 [[key value]]
  (println key "<and>" value)
  15)

(println (map print-and-15 order))

(defn print-and-15 [[key value]]
  value)

(println (map print-and-15 order))

(defn price-per-product [[key value]]
  (* (:quantity value) (:price value)))

(println (map price-per-product order))
(println (reduce + (map price-per-product order)))

(defn price-per-product [[_ value]]
  (* (:quantity value) (:price value)))

(println (map price-per-product order))
(println (reduce + (map price-per-product order)))

(defn order-total [order]
  (reduce + (map price-per-product order)))

(println (order-total order))

; THREADING LAST
(defn order-total [order]
  (->> order
      (map price-per-product)
      (reduce +)))

(println (order-total order))

(defn product-total-price [product]
  (* (:quantity product) (:price product)))

(defn order-total-price [order]
  (->> order
       vals
       (map product-total-price)
       (reduce +)))

(println (order-total-price order))


(def order {:backpack {:quantity 2, :price 80}
            :t-shirt  {:quantity 3, :price 40}
            :keychain {:quantity 1}})

(defn free?
  [product]
  (<= (get product :price 0) 0))

(println "Filtering free ones")
(println (filter free? (vals order)))

(defn free?
  [[key product]]
  (<= (get product :price 0) 0))

(println "Filtering free ones")
(println (filter free? order))

(defn free?
  [[_ product]]
  (<= (get product :price 0) 0))

(println "Filtering free ones")
(println (filter free? order))

(defn free?
  [product]
  (<= (get product :price 0) 0))

(println "Filtering free ones")
(println (filter (fn [[key product]] (free? product)) order))

(println (filter #(free? (second %)) order))

(defn paid?
  [product]
  (not (free? product)))

(println (paid? {:price 50}))
(println (paid? {:price 0}))

(println ((comp not free?) {:price 50}))

(def paid? (comp not free?))
(println (paid? {:price 50}))
(println (paid? {:price 0}))

