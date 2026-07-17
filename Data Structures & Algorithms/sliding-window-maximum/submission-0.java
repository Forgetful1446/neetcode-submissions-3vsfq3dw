class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < k; i++){
            maxHeap.add(nums[i]);
        }

        List<Integer> list = new ArrayList<>();

        int left = 0;
        int right = k;

        while(right < nums.length){
            list.add(maxHeap.peek());
            maxHeap.remove(nums[left++]);
            maxHeap.add(nums[right++]);
        }

        list.add(maxHeap.peek());

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
