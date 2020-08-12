(def fen-inicial "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1")
(def fen-pos-e4 "rnbqkbnr/pppppppp/8/8/4P3/8/PPPP1PPP/RNBQKBNR b KQkq e3 0 1")

; columns             abcdefgh
(def matriz-inicial ["RNBQKBNR"   ; 1
                     "PPPPPPPP"   ; 2
                     "........"   ; 3
                     "........"   ; 4
                     "........"   ; 5
                     "........"   ; 6
                     "pppppppp"   ; 7
                     "rnbqkbnr"]) ; 8

(defn letter-to-index
  [letter]
  (let [letter-int (int letter)
        letter-a (int \a)
        letter-h (int \h)]
    (if (and (<= letter-int letter-h) (>= letter-int letter-a))
      (- letter-int letter-a))))
(assert (= (letter-to-index \a) 0))
(assert (= (letter-to-index \h) 7))

(defn number-char-to-index
  [number]
  (let [number-int (int number)
        number-1 (int \1)
        number-8 (int \8)]
    (if (and (<= number-int number-8) (>= number-int number-1))
      (- number-int number-1))))
(assert (= (number-char-to-index \1) 0))
(assert (= (number-char-to-index \8) 7))

(defn string-to-coordinates
  [original]
  [(number-char-to-index (get original 1)), (letter-to-index (get original 0))])
(assert (= (string-to-coordinates "e4") [3,4]))

(defn can-move?
  [board origin destiny]
  (let [origin-coordinates (string-to-coordinates origin)
        destiny-coordinates (string-to-coordinates destiny)]
    true))




; ----------------------------------

; TEM EFEITO COLATERAL
(defn print-board
  [board]
  (if (not (nil? board))

    (do (print-board (next board))
        (println (first board)))))

(println (string-to-coordinates "e4"))
(print-board matriz-inicial)

