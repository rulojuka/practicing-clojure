(defn always-thing
    [ & ignored]
    100
)


(assert (= 100 (always-thing)))
(assert (= 100 (always-thing "teste")))
(assert (= 100 (always-thing 4 "teste")))