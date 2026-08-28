class Solution {
    int[][] cache;
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length / 2;
        cache = new int[n + 1][n + 1];
        for(int[] row : cache){
            Arrays.fill(row, -1);
        }
        return dfs(costs, 0, n, n);
        
    }

    private int dfs(int[][]costs, int i ,int remainA, int remainB){
        if (i == costs.length) return 0;
        if (cache[remainA][remainB] != -1) return cache[remainA][remainB];
        
        int res = Integer.MAX_VALUE;

        if (remainA > 0) res = costs[i][0] + dfs(costs, i + 1, remainA - 1, remainB);
        if (remainB > 0) res =  Math.min(res, costs[i][1] + dfs(costs, i + 1, remainA, remainB - 1));

        cache[remainA][remainB] = res;

        return res;
    }
}