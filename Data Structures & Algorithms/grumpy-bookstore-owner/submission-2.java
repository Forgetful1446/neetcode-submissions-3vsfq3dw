class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int max = 0;
        
        for(int i = 0; i < customers.length; i++){
            if(grumpy[i] == 0) max += customers[i];
        }

        if(minutes == 0) return max; 

        int left = 0;
        int right = 0;
        int current = max;
        while(right  < customers.length){
            if(right - left < minutes || left >= right){
                
                if(grumpy[right] == 1){
                    current += customers[right];
                }
                right++;
                max = Math.max(max, current);
            } else {
                if(grumpy[left] == 1){
                    current -= customers[left];
                }
                left++;
                max = Math.max(max, current);
            }
        }

        return max;
    }
}