class Solution {
    public String maximumOddBinaryNumber(String s) {
        int zeros = 0;
        int ones = 0;

        for(char c : s.toCharArray()){
            if(c == '0') zeros++;
            if(c == '1') ones++;
        }

        if(ones == 0) return "0".repeat(zeros);
        
        return "1".repeat(ones - 1) + "0".repeat(zeros) + "1";
    }
}