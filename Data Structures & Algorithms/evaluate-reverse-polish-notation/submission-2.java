class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(String x : tokens){
            if(x.equals("+")){
                int o2 = stack.pop();
                int o1 = stack.pop();
                stack.push(o1 + o2);
            } else if(x.equals("-")){
                int o2 = stack.pop();
                int o1 = stack.pop();
                stack.push(o1 - o2);
            } else if(x.equals("*")){
                int o2 = stack.pop();
                int o1 = stack.pop();
                stack.push(o1 * o2);
            } else if(x.equals("/")){
                int o2 = stack.pop();
                int o1 = stack.pop();
                stack.push(o1 / o2);
            }
            else{stack.push(Integer.parseInt(x));}
        }

        return stack.pop();
    }
}