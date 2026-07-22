class Solution {
    public int countServers(int[][] grid) {
        int[] row = new int[grid.length];
        int[] col = new int[grid[0].length];

        for(int rowIndex = 0; rowIndex < grid.length; rowIndex++){
            for(int colIndex = 0; colIndex < grid[0].length; colIndex++){
                if(grid[rowIndex][colIndex] == 1){
                    row[rowIndex]++;
                    col[colIndex]++;
                }
            }
        }

        int communicate = 0;

        for(int rowIndex = 0; rowIndex < grid.length; rowIndex++){
            for(int colIndex = 0; colIndex < grid[0].length; colIndex++){
                if(grid[rowIndex][colIndex] == 1){
                    if(row[rowIndex] > 1 || col[colIndex] > 1) ++communicate;
                } 
            }
        }
        return communicate;
    }
}