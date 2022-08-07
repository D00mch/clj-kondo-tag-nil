(ns clj-kondo-tag-nil.core)

(defmacro defstackfn [& forms]
  `(map identity forms))

(defstackfn f [!a]
  !a
  (!a !b))
