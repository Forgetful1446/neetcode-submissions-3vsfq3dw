public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        List<Integer> res = new ArrayList<>();
        int idx = 0;
        for (int num = 1; num <= n; num++) {
            while (idx < n && nums[idx] < num) {
                idx++;
            }
            if (idx == n || nums[idx] > num) {
                res.add(num);
            }
        }
        return res;
    }
}