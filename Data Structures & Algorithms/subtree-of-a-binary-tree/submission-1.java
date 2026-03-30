class Solution {  
    public static String treeToString(TreeNode node){
        if(node == null) return "#";
        return "," + node.val + treeToString(node.left) + treeToString(node.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String s1 = treeToString(root);
        String s2 = treeToString(subRoot);
        return s1.contains(s2);
    }
}
