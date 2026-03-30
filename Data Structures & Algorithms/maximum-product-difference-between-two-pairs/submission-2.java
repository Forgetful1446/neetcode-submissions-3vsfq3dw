class Solution {
    public int maxProductDifference(int[] nums) {
        int maxIndex1 = 0;
        int maxIndex2 = 0;
        int minIndex1 = 0;
        int minIndex2 = 0;
    
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > nums[maxIndex1]) maxIndex1 = i;
            if(nums[i] < nums[minIndex1]) minIndex1 = i;
        }

        if(maxIndex1 == maxIndex2) maxIndex2 = nums.length - 1 - maxIndex1;
        if(minIndex1 == minIndex2) minIndex2 = nums.length - 1 - minIndex1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > nums[maxIndex2] && i != maxIndex1) maxIndex2 = i;
            if(nums[i] < nums[minIndex2] && i != minIndex1) minIndex2 = i;
        }
        System.out.println(nums[maxIndex1]);
        System.out.println(nums[maxIndex2]);
        System.out.println(nums[minIndex1]);
        System.out.println(nums[minIndex2]);

        return nums[maxIndex1] * nums[maxIndex2] - nums[minIndex1] * nums[minIndex2];
    }
}