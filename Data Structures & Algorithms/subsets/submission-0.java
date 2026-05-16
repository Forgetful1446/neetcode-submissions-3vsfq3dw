class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset = new ArrayList<>();

        dfs(0, nums, subset);

        return result;
    }

    public void dfs(int index, int[] nums, List<Integer> subset) {
        if (index >= nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }

        // chọn phần tử hiện tại
        subset.add(nums[index]);
        dfs(index + 1, nums, subset);

        // quay lui
        subset.remove(subset.size() - 1);

        // không chọn phần tử hiện tại
        dfs(index + 1, nums, subset);
    }
}