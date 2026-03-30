class Solution {
    public boolean isValid(String s) {
        char[] a = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char x : a){
            if(x == '(' || x =='{' || x == '['){
                stack.push(x);
            }
            if(x ==')' || x == '}'  || x ==']'){
                if(stack.isEmpty()) return false;
                char temp = stack.pop();
                if((x ==']') && !(temp == '[')) return false;
                if((x == '}') && !(temp == '{')) return false;
                if((x == ')') && !(temp =='(')) return false;
            }
        }
        return stack.isEmpty();
    }
}