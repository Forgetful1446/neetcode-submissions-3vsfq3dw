class Solution {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result  = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return result;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();

            for(int i = 0; i < size; i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);

                temp.add(queue.poll().val);
            }
            result.add(temp);
        }
        return result;
    }
}