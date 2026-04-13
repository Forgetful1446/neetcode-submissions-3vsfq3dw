class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> array = new ArrayList<>();
        kthSmallest(root, k, array);
        return array.get(array.size() - 1);
    }

    public void kthSmallest(TreeNode node, int k, List<Integer> array) {
        if(node == null || array.size() >= k) return; 
        kthSmallest(node.left, k, array);
        if(array.size() < k) array.add(node.val);
        kthSmallest(node.right, k, array);
    }
}
