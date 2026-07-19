class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
        dfs(image, image[sr][sc], color, sc, sr);
        return image;
    }

    private void dfs(int[][] image, int originalColor, int color, int col, int row){
        if (col < 0 || col >= image[0].length || row < 0 || row >= image.length) return;
        if(image[row][col] == originalColor) image[row][col] = color;
        if(row > 0 && image[row - 1][col] == originalColor) dfs(image, originalColor, color, col, row - 1);
        if(row < image.length - 1 && image[row + 1][col] == originalColor) dfs(image, originalColor, color, col, row + 1);
        if(col > 0 && image[row][col - 1] == originalColor) dfs(image, originalColor, color, col - 1, row);
        if(col < image[0].length - 1 && image[row][col + 1] == originalColor) dfs(image, originalColor, color, col + 1, row);

    }
}