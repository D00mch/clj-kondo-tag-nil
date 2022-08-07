# clj-kondo-tag-nil

## To reproduce:

Clone repository locally and run: 

    clj-kondo --lint src/clj_kondo_tag_nil/core.clj

You will see:

    $ clj-kondo --lint src/clj_kondo_tag_nil/core.clj
    <token: defstackfn> :class clj_kondo.impl.rewrite_clj.node.token.TokenNode :tag nil
    <token: f> :class clj_kondo.impl.rewrite_clj.node.token.TokenNode :tag nil
    <vector: [!a]> :class clj_kondo.impl.rewrite_clj.node.seq.SeqNode :tag :vector
    <token: !a> :class clj_kondo.impl.rewrite_clj.node.token.TokenNode :tag nil
    <list: (!a !b)> :class clj_kondo.impl.rewrite_clj.node.seq.SeqNode :tag :list

`TokenNode`'s `:tag` is not suppose to be nil.
