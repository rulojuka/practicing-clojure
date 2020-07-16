(defn greeting
    ([greet name] (str greet ", " name "!"))
    ([name] (greeting "Hello" name))
    ([] (greeting "World"))
)

(assert (= "Hello, World!" (greeting)))
(assert (= "Hello, Clojure!" (greeting "Clojure")))
(assert (= "Good morning, Clojure!" (greeting "Good morning" "Clojure")))