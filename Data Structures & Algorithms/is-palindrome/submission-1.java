class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < s.length()/2 ; i++ ){
            int idx = s.length() - i;
            if(!s.substring(i, i+1).equals(s.substring(idx-1,idx))) return false;
        }
        return true;
    }
}