(require '[clojure.string :as str])

;Receives a string, remove evertything that is not 0s ans 1s, splits into 1-element strings, parses those strings to integers and transform array into list
(defn
    transformStringIntoList
    [anyString]
    (into () (map #(Integer/parseInt %) (str/split (str/replace anyString #"[^10]" "") #"")))
)

(defn
    listToDecimal
    [list, acc, multiplier]
    (if (empty? list)
        acc
        (do
            (listToDecimal (rest list) (+ acc (* (first list) multiplier)) (* 2 multiplier)) ; Check if this is doing tail recursion
        )
    )
)

(defn
    bin2dec
    [binaryString]
    (listToDecimal (transformStringIntoList binaryString) 0 1)
)

(assert (= 0 (bin2dec "0")))
(assert (= 0 (bin2dec "0asdf")))
(assert (= 0 (bin2dec "000")))
(assert (= 0 (bin2dec "0a0asfd0s")))
(assert (= 1 (bin2dec "01")))
(assert (= 2 (bin2dec "10")))
(assert (= 34 (bin2dec "100010")))

(time (bin2dec "10"))
(time (bin2dec "10110"))
(time (bin2dec "100011010110"))
(time (bin2dec "1000101110111010110"))
(time (bin2dec "100010111010101110101011010110"))
(time (bin2dec "100010111010101110101011100010111010101110101011010110010110"))
