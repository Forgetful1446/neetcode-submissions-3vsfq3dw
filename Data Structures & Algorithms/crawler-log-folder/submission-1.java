class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        for(String x : logs){
            if(x.equals("../")){
                if(stack.isEmpty()){
                    continue;
                }
                stack.pop();
            } else if(x.equals("./")){
                continue;
            } else {
                stack.push(x);
            }
        }


        return stack.size();
        
    }
}