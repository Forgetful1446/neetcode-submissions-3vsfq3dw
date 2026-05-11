class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int count = 0;
        for(char x : s.toCharArray()){
            if(x == '(') count++;
            if(x == ')'){
                max = max > count ? max : count;
                count--;
            }
        }
        return max;
    }
}