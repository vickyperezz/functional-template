(ns exercise2)

(defn less-six [x]
    (< 5 x))

(defn only-greater-than-five [lista]
  (filter less-six lista))
  
 
