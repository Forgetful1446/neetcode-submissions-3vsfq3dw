class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<Integer>();
        postorder(root, result);
        return result;
    }

    private void postorder(Node root, List<Integer> result){
        if(root == null) return;
        for (Node x : root.children){
            postorder(x, result);
        }
        result.add(root.val);
    }
}