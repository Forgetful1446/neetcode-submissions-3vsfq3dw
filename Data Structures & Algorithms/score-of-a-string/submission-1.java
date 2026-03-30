class Solution {
    public int scoreOfString(String s) {
        char[] a = s.toCharArray();
        int result = 0;
        for(int x = 0; x  < a.length - 1; x++){
            result += Math.abs(a[x] - a[x+1]);
        }
        return result;
    }

}