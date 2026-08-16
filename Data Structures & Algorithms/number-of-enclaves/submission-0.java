class Solution {
    public int numEnclaves(int[][] grid) {
        int rowLength = grid.length;
        int colLength = grid[0].length;

        for(int i = 0; i < colLength; i++){
            if(grid[0][i] == 1) dfs(grid, 0, i, rowLength, colLength);
            if(grid[rowLength - 1][i] == 1) dfs(grid, rowLength - 1, i, rowLength, colLength);
        }

        for(int j = 0; j < rowLength; j++){
            if(grid[j][0] == 1) dfs(grid, j, 0, rowLength, colLength);
            if(grid[j][colLength - 1] == 1) dfs(grid, j, colLength - 1, rowLength, colLength);
        }

        int count = 0;
        for(int[] row : grid){
            for(int x : row){
                if(x == 1) count++;
            }
        }

        return count;
    }

    private void dfs(int[][]grid, int row, int col, int rowLength, int colLength){
        if(grid[row][col] <= 0) return;
        if(grid[row][col] == 1) grid[row][col] = -1;
        if(row > 0) dfs(grid, row - 1, col, rowLength, colLength);
        if(col > 0) dfs(grid, row, col - 1, rowLength, colLength);
        if(row < rowLength - 1) dfs(grid, row + 1, col, rowLength, colLength);
        if(col < colLength - 1) dfs(grid, row, col + 1, rowLength, colLength);
    }
}