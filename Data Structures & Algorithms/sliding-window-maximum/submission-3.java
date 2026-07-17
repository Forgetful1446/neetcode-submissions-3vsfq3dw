class Solution {
    private int findMax(int[] array, int start, int end){
        int maxValue = array[start];
        for(int i = start; i < end; i++){
            maxValue = Math.max(maxValue, array[i]);
        }
        return maxValue;
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();

        int left = 0;
        int right = k;

        int currentMax = findMax(nums, left, right);

        while(right < nums.length){
            list.add(currentMax);
            if(nums[left++] == currentMax) currentMax = findMax(nums, left, right);
            if(nums[right] > currentMax) currentMax = nums[right];
            right++;
        }

        list.add(currentMax);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
