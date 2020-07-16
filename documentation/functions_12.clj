(defn
    one-less-arg
    [f x]
    (fn [& args] (apply f x args))
)
