class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        do {
            slow = (slow >= nums.length - 1) ? 0 : slow +1;
            fast = (fast >= nums.length - 1) ? 0 : fast +1;
            fast = (fast >= nums.length - 1) ? 0 : fast +1;
            
        } while(nums[slow] != nums[fast]);
        return nums[slow];
    }
}
