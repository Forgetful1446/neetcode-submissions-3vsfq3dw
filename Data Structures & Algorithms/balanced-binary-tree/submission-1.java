

class Solution {
    private static int height(TreeNode node){
        if(node == null) return -1;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    private static boolean isBalanced1(TreeNode node){
        if (node == null) return true;
        return (Math.abs(height(node.left) - height(node.right)) <= 1) && isBalanced1(node.left) && isBalanced1(node.right);
    }

    public boolean isBalanced(TreeNode root) {
        return isBalanced1(root);
    }
}
