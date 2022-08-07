(ns hooks.defs
  (:require
    [clj-kondo.hooks-api :refer [list-node token-node]]))

(defn traverse-body [[head & tail]]
  (println head :class (class head) :tag (:tag head))
  (if (seq tail) (recur tail) nil))

(defn defstackfn [{:keys [node]}]
  (let [[fn-name args & body] (rest (:children node))]
    (let [result (list-node (list* (token-node 'defn)
                                   fn-name
                                   args
                                   (traverse-body body)))]
      {:node result})))
