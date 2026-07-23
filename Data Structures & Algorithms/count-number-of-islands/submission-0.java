class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int islandCount = 0;

        for(int rowIndex = 0; rowIndex < m; rowIndex++){
            for(int colIndex = 0; colIndex < n; colIndex++){
                if (grid[rowIndex][colIndex] == '1'){
                    dfs(grid, rowIndex, colIndex, m, n);
                    islandCount++;
                }
            }
        }

        return islandCount;
    }

    private void dfs(char[][] grid, int row, int col,int m, int n){
        if(grid[row][col] == '1') {
            grid[row][col] = 0;
            if (row > 0) dfs(grid, row - 1, col, m, n);
            if (row < m - 1) dfs(grid, row + 1, col, m, n);
            if (col > 0) dfs(grid, row, col - 1, m, n);
            if (col < n - 1) dfs(grid, row, col + 1, m, n);
        } else {
            return;
        }     
    }
}
