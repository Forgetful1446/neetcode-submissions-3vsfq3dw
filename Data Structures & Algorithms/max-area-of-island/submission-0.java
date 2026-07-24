class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int maxArea = 0;

        for(int rowIndex = 0; rowIndex < m; rowIndex++){
            for(int colIndex = 0; colIndex < n; colIndex++){
                if (grid[rowIndex][colIndex] == 1){
                    maxArea = Math.max(dfs(grid, rowIndex, colIndex, m, n),maxArea);
                }
            }
        }

        return maxArea;
    }

    private int dfs(int[][] grid, int row, int col,int m, int n){
        if(grid[row][col] == 1) {
            grid[row][col] = 0;
            int sum = 1;
            if (row > 0) sum += dfs(grid, row - 1, col, m, n);
            if (row < m - 1) sum += dfs(grid, row + 1, col, m, n);
            if (col > 0) sum += dfs(grid, row, col - 1, m, n);
            if (col < n - 1) sum += dfs(grid, row, col + 1, m, n);
            return sum;
        } else {
            return 0;
        }     
    }
}
