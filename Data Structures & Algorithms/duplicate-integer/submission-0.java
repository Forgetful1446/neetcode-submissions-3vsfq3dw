class Solution {
        public boolean hasDuplicate(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int x : nums){
                if(map.containsValue(x)) return true;
                map.put(x,x);
            }
            return false;
        }
    }