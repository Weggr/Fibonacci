(defun fib (n)
  "loop-based iterative computation of the nth element of the Fibonacci sequence"
  (check-type n (integer 0 *))
  (loop for f1 = 0 then f2
        and f2 = 1 then (+ f1 f2)
        repeat n finally (return f1)))
