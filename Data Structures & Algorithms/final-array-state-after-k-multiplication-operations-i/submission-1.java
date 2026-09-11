class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int val : nums){
            heap.offer(val);
        }

        for(int i = 0; i < k; ++i){
            int min = heap.poll();
            for(int index = 0; index < nums.length; index++){
                if(nums[index] == min){
                    nums[index] *= multiplier;
                    heap.offer(min * multiplier);
                    break;
                }
            }
        }
        return nums;
    }
}