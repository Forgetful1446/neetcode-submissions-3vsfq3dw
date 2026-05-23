class Solution {
    public int rob(int[] nums) {
        int rob1 = 0;
        int rob2 = 0;

        for(int x : nums){
            int max =  Math.max(x + rob1, rob2);
            rob1 = rob2;
            rob2 = max;
        }

        return rob2;
    }
}   