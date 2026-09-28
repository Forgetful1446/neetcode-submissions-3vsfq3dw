class Solution {
    public String decodeString(String s) {
        // Input: s = "2[a3[b]]c"
        // Output: "abbbabbbc"

        char[] a = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(char x : a){
            if (x == ']'){
                StringBuilder string = new StringBuilder();
                while(!stack.isEmpty() && stack.peek() != '['){
                    string.insert(0, stack.pop());
                }
                if(!stack.isEmpty()) stack.pop();
                StringBuilder number = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit((stack.peek()))){
                    number.insert(0,stack.pop());
                }
                String temp = string.toString().repeat(Integer.parseInt(number.toString()));
                char[] b = temp.toCharArray();
                for(char y : b){
                    stack.push(y);
                }

            } else {
                stack.push(x);
            }
        }
        while(!stack.isEmpty()){
            result.insert(0,stack.pop());
        }
        return result.toString();
    }
}