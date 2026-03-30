    class Solution {
        public int lengthOfLastWord(String s) {
            s = s.trim();
            char[] a = s.toCharArray();
            int result = 0;
            for(int i = a.length - 1; i >= 0; i--){
                if(Character.isWhitespace(a[i])) break;
                result++;
            }
            return result;
        }
    }