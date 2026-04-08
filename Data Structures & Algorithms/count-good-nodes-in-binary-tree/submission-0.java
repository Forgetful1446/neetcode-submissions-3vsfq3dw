class Solution {
    public int goodNodes(TreeNode root) {
        return 1 + goodNode(root.left, root.val) + goodNode(root.right, root.val);
    }

    public int goodNode(TreeNode node, int max){
        if(node == null) return 0;
        if(node.val >= max){
            return 1 + goodNode(node.left, node.val) + goodNode(node.right, node.val);
        }
        return goodNode(node.left, max) + goodNode(node.right, max);
    }
}