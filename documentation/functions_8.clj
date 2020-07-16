(defn
    opposite
    [f]
    (fn
        [& args]
        (not (apply f args))
    )
)

(assert (= true ((opposite =) 3 7)))
(assert (= false ((opposite =) 3 3)))