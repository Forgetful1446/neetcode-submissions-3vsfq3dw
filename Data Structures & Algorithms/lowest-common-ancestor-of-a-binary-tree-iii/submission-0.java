class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        HashSet<Node> hash = new HashSet<>();
        hash.add(p);
        hash.add(q);
        while(p != null){
            p = p.parent;
            if(hash.contains(p)) return p;
            if(p != null) hash.add(p);
        }
        while(q != null){
            q = q.parent;
            if(hash.contains(q)) return q;
            if(q != null) hash.add(q);
        }

        return null;

    }
}