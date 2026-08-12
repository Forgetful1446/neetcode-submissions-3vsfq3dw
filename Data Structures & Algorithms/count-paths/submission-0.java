public class Solution {
    public int uniquePaths(int m, int n) {
        if(m == 1 || n == 1) return 1;
        
        int[][] cache = new int[m][n];
        
        cache[m - 1][n - 1] = 1;

        for(int i = n - 1; i >= 0; i--){
            for(int j = m - 1; j >= 0; j--){
                if(i == n - 1) {cache[j][i] = 1; continue;}
                if(j == m - 1) {cache[j][i] = 1; continue;}
                cache[j][i] = cache[j + 1][i] + cache[j][i + 1];
            }
        }

        return cache[0][0];

    }
}