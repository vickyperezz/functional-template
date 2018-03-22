(ns exercise3)

(defn fibonacci [num]
  
    (if (= 1 num)
      1)
    (if (= 0 num)
      0)
    (+ fibonacci(- 1 num) fibonacci(- 2 num)))
    
