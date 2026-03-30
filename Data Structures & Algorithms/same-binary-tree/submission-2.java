class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.offer(p);
        queue.offer(q);

        while(!queue.isEmpty()){
            TreeNode t1 = queue.poll();
            TreeNode t2 = queue.poll();
            
            if(t1 == null && t2 == null) continue;
            if(t1 == null || t2 == null) return false;

            if(t1.val != t2.val) return false;

            queue.offer(t1.left);
            queue.offer(t2.left);
            queue.offer(t1.right);
            queue.offer(t2.right);
        }
        return true;
    }
}
