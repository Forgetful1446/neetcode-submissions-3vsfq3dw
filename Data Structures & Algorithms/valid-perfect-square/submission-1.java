class Solution {
    public boolean isPerfectSquare(int num) {
        for(int i = 0; i <= num; i++){
            if(i * i == num)  return true;
            if(i * i > num) return false;
        }
        return false;
    }
}