class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();

        int num = 0;
        char sign = '+';

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                num = num * 10 + (c - '0');
            }

            if((!Character.isDigit(c) && c != ' ') || (i == s.length() - 1)){
                switch(sign){
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(num * stack.pop());
                        break;
                    case '/':
                        stack.push(stack.pop() / num);
                        break;
                }

                num = 0;
                sign = c;
            }
        }
    int result = 0;
    while(!stack.isEmpty()){
        result += stack.pop();
    }

    return result;
    }
}