class Solution {
    public String largestGoodInteger(String num) {
        char[] a =  num.toCharArray();
        char max = ' ';
        for(int i = 0; i < num.length() - 2; i++){
            if(a[i] == a[i + 1] && a[i] == a[i + 2] && a[i] > max){
                max = a[i];
                i = i + 2;
            }
        }
        String result = "";
        if(max == ' ') return result;
        return result + max + max + max;

    }
}