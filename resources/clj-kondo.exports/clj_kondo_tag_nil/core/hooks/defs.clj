(ns hooks.defs)

(defn traverse-body [[head & tail]]
  (println head :class (class head) :tag (:tag head))
  (if (seq tail) (recur tail) nil))

(defn defstackfn [{:keys [node]}]
  (traverse-body (:children node)))
