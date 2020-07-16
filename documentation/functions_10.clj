(defn 
    sumOfSinAndCosSquares
    [x]
    ( + (* (Math/cos x) (Math/cos x)) (* (Math/sin x) (Math/sin x)))
)

(assert
    (< 
        (Math/abs (- -1.0 (Math/cos Math/PI)))
        0.000000001
    )
)
(assert
    (< 
        (Math/abs (- 1.0 (sumOfSinAndCosSquares Math/PI)))
        0.000000001
    )
)