(ns introduction.lesson5)

(def inventory {"Backpack" 10 "T-shirt" 5})
(println inventory)

(def inventory {"Backpack" 10, "T-shirt" 5})

(def inventory {"Backpack" 10
                "T-shirt"  5})
(println inventory)

(println "Inventory has" (count inventory) "elements")
(println "Keys are:" (keys inventory))
(println "Values are:" (vals inventory))

; Keyword
; :backpack

(def inventory {:backpack 10
                :t-shirt  5})

(println (assoc inventory :chair 3))
(println inventory)
(println (assoc inventory :backpack 1))

(println inventory)
(println (update inventory :backpack inc))

(defn subtract-one
  [amount]
  (println "Subtract 1 from" amount)
  (- amount 1)
  )

(println inventory)
(println (update inventory :backpack subtract-one))
(println inventory)
(println (update inventory :backpack #(- % 3)))

(println (dissoc inventory :backpack))


(def order {:backpack {:quantity 2, :price 80}
            :t-shirt  {:quantity 3, :price 40}})

(println "\n\n\n\n")
(println order)

(def order (assoc order :keychain {:quantity 1, :price 10}))
(println order)
(println (order :backpack))
(println (get order :backpack))
(println (get order :chair))
(println (get order :chair {}))
(println (:backpack order))
(println (:chair order))
(println (:chair order {}))

(println (:quantity (:backpack order)))

(println (update-in order [:backpack :quantity] inc))

; THREADING FISRT
(println order)
(println (-> order
             :backpack
             :quantity))

(-> order
    :backpack
    :quantity
    println)


