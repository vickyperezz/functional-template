(ns exercise10)

(defn faverage[lista]
    (/ (reduce + 0 lista) (count lista) )
  
  )
(defn squear [x]
  (* x x)
) 


(defn fvariance [lista]
  (let [cantDatos (count lista)
        mediana (faverage lista)]
  
  (/ (reduce + 0 (map squear (for [x lista] (- x mediana)))) cantDatos)
)
)
