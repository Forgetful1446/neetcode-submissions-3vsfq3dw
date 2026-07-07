class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); 
        backTracking(candidates, target, 0, 0, new ArrayList<>());
        return result;
    }

    private void backTracking(int[] candidates, int target, int start, int sum, List<Integer> current) {
        if (sum == target) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            if (sum + candidates[i] > target) {
                break;
            }

            current.add(candidates[i]);

            backTracking(candidates, target, i + 1, sum + candidates[i], current);

            current.remove(current.size() - 1);
        }
    }
}