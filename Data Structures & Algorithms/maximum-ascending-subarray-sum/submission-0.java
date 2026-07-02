class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = 0;
        int current = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                current += nums[i];
            } else {
                max = Math.max(current, max);
                current = nums[i];
            }
        }
        max = Math.max(current, max);
        return max;
    }
}