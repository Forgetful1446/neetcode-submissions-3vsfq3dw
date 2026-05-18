class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int index = 0;
        while(true){
            if(index >= strs[0].length()) break;
            Character temp = strs[0].charAt(index);
            for(int i = 0; i < strs.length; ++i){
                if(index >= strs[i].length() || strs[i].charAt(index) != temp) return result;
            }
            result = result + temp;
            ++index;
        }

        return result;
    }
}