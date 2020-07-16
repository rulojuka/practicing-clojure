(def
    greet
    (fn [] (println "hello"))
)

(defn
    triplicate
    [f]
    (f)(f)(f)
)

(defn
    n-plicate
    [f x]
    (if (> x 0) (do (f) (n-plicate f (- x 1))))
)

;(triplicate greet)
(n-plicate greet 3)