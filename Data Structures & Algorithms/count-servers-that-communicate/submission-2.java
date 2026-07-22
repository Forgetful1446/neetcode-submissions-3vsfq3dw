class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] row = new int[m];
        int[] col = new int[n];

        for(int rowIndex = 0; rowIndex < m; rowIndex++){
            for(int colIndex = 0; colIndex < n; colIndex++){
                if(grid[rowIndex][colIndex] == 1){
                    row[rowIndex]++;
                    col[colIndex]++;
                }
            }
        }

        int communicate = 0;

        for(int rowIndex = 0; rowIndex < m; rowIndex++){
            for(int colIndex = 0; colIndex < n; colIndex++){
                if(grid[rowIndex][colIndex] == 1){
                    if(row[rowIndex] > 1 || col[colIndex] > 1) ++communicate;
                } 
            }
        }
        return communicate;
    }
}