(ns exercise3)

(defn fibonacci [num]
  
    (if (<= num 1)
      num
      (+ (fibonacci (- num 1)) (fibonacci (- num 2))
    )   
)
    
