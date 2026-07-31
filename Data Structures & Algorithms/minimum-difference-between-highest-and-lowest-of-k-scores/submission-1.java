class Solution {
    public int minimumDifference(int[] nums, int k) {
        int l = 0;
        int r = k - 1;

        Arrays.sort(nums);

        int result = 100000;

        while (r < nums.length){
            result = (nums[r] - nums[l]) < result ? nums[r] - nums[l] : result;
            l++;
            r++;
        }

        return result;
    }
}