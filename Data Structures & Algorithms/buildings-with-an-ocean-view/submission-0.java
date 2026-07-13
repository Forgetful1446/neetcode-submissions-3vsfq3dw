class Solution {
    public int[] findBuildings(int[] heights) {
        List<Integer> result = new ArrayList<>();

        int max = heights.length - 1;

        if (heights.length == 1)
            return new int[]{0};

        result.add(max);

        for (int i = heights.length - 2; i >= 0; i--) {
            if (heights[i] > heights[max]) {
                result.add(i);
                max = i;
            }
        }

        Collections.reverse(result);

        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}