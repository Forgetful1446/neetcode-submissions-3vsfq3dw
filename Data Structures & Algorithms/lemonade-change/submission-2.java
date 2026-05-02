class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] change = new int[2];
        
        for(int bill : bills){
            if(bill == 5) change[0]++;
            if(bill == 10){
                if(change[0] < 1) return false;
                change[0]--;
                change[1]++;
            }
            if(bill == 20){
                if(change[0] >= 3 || change[0] >= 1 && change[1] >= 1){
                    if(change[1] > 0){
                        change[0]--;
                        change[1]--;
                    } else if(change[0] >= 3){
                        change[0] -= 3;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}