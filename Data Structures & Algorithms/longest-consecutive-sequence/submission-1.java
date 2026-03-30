
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        nums = Arrays.stream(nums).distinct().toArray();
        
        int doDai = 1;
        int maxDoDai = 0;
        if(nums.length == 1) return 1;
        if(nums.length < 1) return 0;

        for(int i = 0; i < nums.length - 1; ++i){
            if(nums[i] == nums[i+1] - 1){
                ++doDai;
            } else {
                maxDoDai = (maxDoDai > doDai) ? maxDoDai: doDai;
                doDai = 1;
            }
        }
        maxDoDai = (maxDoDai > doDai) ? maxDoDai: doDai;

        return maxDoDai;
    }
}
