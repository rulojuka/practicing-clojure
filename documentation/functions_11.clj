(defn http-get [url]
  (slurp
    (.openStream
      (java.net.URL. url))))

(defn http-get [url]
  (slurp url))



(assert (.contains (http-get "https://www.w3.org") "html"))