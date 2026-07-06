class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> current = new ArrayList<>();
        backTracking(nums, target, current, 0, 0);
        return result;
    }

    private void backTracking(int[] nums, int target, List<Integer> current, int sum, int start){
        if(sum == target){
            result.add(new ArrayList<>(current));
        }else if (sum > target){
            return;
        }else{
            for (int i = start; i < nums.length; i++) {
                current.add(nums[i]);
                backTracking(nums, target, current, sum + nums[i], i);
                current.remove(current.size() - 1);
            }
        }
    }
}
