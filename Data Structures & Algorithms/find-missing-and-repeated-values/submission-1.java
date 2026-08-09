class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        Long N = (long) n * n;

        long expectedSum = N * (N + 1) / 2;
        long expectedSquareSum = N * (N + 1) * (2 * N + 1) / 6;

        long gridSum = 0;
        long gridSquareSum = 0;

        for (int[] row : grid){
            for(int x : row){
                gridSum += (long) x;
                gridSquareSum += (long) x * x;
            }
        }

        long differentA = gridSum - expectedSum;
        long differentB = gridSquareSum - expectedSquareSum;

        long b = ((differentB/differentA) - differentA) / 2;
        long a = differentA + b;

        return new int[]{(int)a, (int)b};
    }
}