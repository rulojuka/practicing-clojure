(defn
    multiplyBy3
    [x]
    (* 3 x)
)

(defn
    add2
    [x]
    (+ 2 x)
)

(defn
    two-fns
    [f g]
    (fn [x] (f(g x)))
)

(assert (= 27 ((two-fns multiplyBy3 add2) 7)))