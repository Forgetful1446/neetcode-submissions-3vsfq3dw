class Solution {
    public void moveZeroes(int[] nums) {
        
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] == 0){
                boolean swaped = false;
                for(int j = i ; j < nums.length; ++j){
                    if(nums[j] != 0){
                        // System.out.println("swap " + nums[i] + " : " + i + " w " +  nums[j] + " : " + j);
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        swaped = true;
                        break;
                    }
                    
                }

                if(!swaped) return;
            }
        }
    }
}