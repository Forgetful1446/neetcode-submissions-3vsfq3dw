class Solution {
    public int findCircleNum(int[][] isConnected) {
        int result = 0;
        int n = isConnected.length;

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                result++;
                dfs(isConnected, visited, i);
            }
        }

        return result;
    }

    private void dfs(int[][] isConnected, boolean[] visited, int city) {
        visited[city] = true;

        for (int nextCity = 0; nextCity < isConnected.length; nextCity++) {
            if (isConnected[city][nextCity] == 1 && !visited[nextCity]) {
                dfs(isConnected, visited, nextCity);
            }
        }
    }
}