(def
    greet
    (fn ([] (println "hello")) ([x] (println x)))
)

(defn
    triplicate
    [f]
    (f)(f)(f)
)

(defn
    triplicate2
    [f & args]
    (triplicate (fn [] (apply f args)))
)

(triplicate2 greet)
(triplicate2 greet "Ale")