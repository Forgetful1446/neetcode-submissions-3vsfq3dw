class Solution {
    public void recoverTree(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        LNR(root, list);
        int first = -1;
        int second = -1;
        
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                if (first == -1) {
                    first = i;        
                }
                second = i + 1;             
            }
        }
        
        fix(root, list.get(first), list.get(second));
    }

    public void fix(TreeNode node, int first, int second){
        if(node == null) return;
        if (node.val == first) {
            node.val = second;
        } else if (node.val == second) {
            node.val = first;
        }
        fix(node.left, first, second);
        fix(node.right, first, second);
    }

    public void LNR(TreeNode node, List<Integer> list){
        if (node == null) return;
        LNR(node.left, list);
        list.add(node.val);
        LNR(node.right, list);
    }
}