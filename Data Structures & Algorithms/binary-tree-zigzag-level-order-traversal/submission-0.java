class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(root, 0, result);
        return result;
    }

    public void dfs(TreeNode node, int level, List<List<Integer>> result) {
        if(node == null) return;
        if(level == result.size()){
            result.add(new ArrayList());
        }

        if(level % 2 == 0){
            result.get(level).add(node.val);
        } else {
            result.get(level).add(0, node.val);
        }

        dfs(node.left, level + 1, result);
        dfs(node.right, level + 1, result);
    }
}