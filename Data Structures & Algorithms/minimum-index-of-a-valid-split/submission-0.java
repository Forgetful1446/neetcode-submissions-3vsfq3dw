class Solution {
    public int minimumIndex(List<Integer> nums) {
        int candidate = 0;
        int count = 0;

        for(int x : nums){
            if(count == 0) candidate = x;
            if(x == candidate) ++count;
            if(x != candidate) --count;
        }

        count = 0;
        for(int x : nums) if(candidate == x) count += 2;

        if (count <= nums.size()) return -1;

        int left = 0;
        
        int size = nums.size();

        for(int i = 0; i < size - 1; i++){
            if(nums.get(i) == candidate){
                left += 2;
                count -= 2;
            }

            if(left > i + 1 && count > size - i - 1) return i;
        }

        return -1;
    }
}