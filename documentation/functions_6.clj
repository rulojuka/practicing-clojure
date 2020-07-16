(defn
    make-thingy ; nome
    [x] ; params
    (fn [& ignored] x) ; body
)

;; Tests
(let [n (rand-int Integer/MAX_VALUE)
      f (make-thingy n)]
  (assert (= n (f)))
  (assert (= n (f 123)))
  (assert (= n (apply f 123 (range)))))