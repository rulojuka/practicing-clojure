(defn do-nothing
    [x]
    x
)

(assert (= "teste" (do-nothing "teste")))
(assert (= 4 (do-nothing 4)))