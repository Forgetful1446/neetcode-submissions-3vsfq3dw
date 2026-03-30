class Solution {
    private String myFunc(TreeNode node){
        StringBuilder result = new StringBuilder();
        if(node == null){
            return " ";
        }
        return result.append(myFunc(node.left) +  " " + node.val + " " +myFunc(node.right)).toString();
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        String[] a = myFunc(root).trim().split("\\s+");
        for(String x : a){
            if(x.equals("")) continue;
            result.add(Integer.parseInt(x));
        }
        return result;
    }
}