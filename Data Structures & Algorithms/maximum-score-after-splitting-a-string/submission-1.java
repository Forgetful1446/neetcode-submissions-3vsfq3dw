class Solution {
    public int maxScore(String s) {
        int count0 = 0;
        int max = 0;
        //011101
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0') count0++;
        }
        int left = 0;
        int right = s.length() - count0;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == '0') {
                left++;
            } else {
                right--;
            }
            max = Math.max(left + right, max);
        }

        return max;
    }
}