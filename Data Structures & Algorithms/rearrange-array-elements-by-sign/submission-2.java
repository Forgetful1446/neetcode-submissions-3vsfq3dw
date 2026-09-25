class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positiveIndex = 0;
        int negativeIndex = 0;

        int length =    nums.length;

        int[] result = new int[length];

        for(int i = 0; i < length; i++){
            if(i % 2 == 0){
                while (positiveIndex < length && nums[positiveIndex] < 0) positiveIndex++;
                result[i] = nums[positiveIndex++];
            } else {
                while (negativeIndex < length && nums[negativeIndex] > 0) negativeIndex++;
                result[i] = nums[negativeIndex++];
            }
        }
        return result;
    }
}