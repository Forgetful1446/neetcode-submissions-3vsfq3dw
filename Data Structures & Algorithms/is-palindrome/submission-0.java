class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuffer sr = new StringBuffer(s);
        return s.equals(sr.reverse().toString());
    }
}