class Solution {
    boolean result = false;

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] used = new boolean[m][n];

        for (int i = 0; i < m && !result; i++) {
            for (int j = 0; j < n && !result; j++) {
                exist(board, word, 0, j, i, used);
            }
        }
        return result;
    }

    private void exist(char[][] board, String word, int wordIndex, int colIndex, int rowIndex, boolean[][] used) {
        if (result) return;

        if (rowIndex < 0 || rowIndex >= board.length || colIndex < 0 || colIndex >= board[0].length) return;
        if (used[rowIndex][colIndex] || board[rowIndex][colIndex] != word.charAt(wordIndex)) return;

        if (wordIndex == word.length() - 1) {
            result = true;
            return;
        }

        used[rowIndex][colIndex] = true;
        exist(board, word, wordIndex + 1, colIndex - 1, rowIndex, used);
        exist(board, word, wordIndex + 1, colIndex + 1, rowIndex, used);
        exist(board, word, wordIndex + 1, colIndex, rowIndex - 1, used);
        exist(board, word, wordIndex + 1, colIndex, rowIndex + 1, used);
        used[rowIndex][colIndex] = false;
    }
}