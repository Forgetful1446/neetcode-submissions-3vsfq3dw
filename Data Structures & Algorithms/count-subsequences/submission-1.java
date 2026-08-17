class Solution {

    int[][] cache;

    public int numDistinct(String s, String t) {
        if (s.length() < t.length()) return 0;

        cache = new int[s.length()][t.length()];

        for (int i = 0; i < s.length(); i++) {
            Arrays.fill(cache[i], -1);
        }

        return dfs(s, t, 0, 0);
    }

    private int dfs(String s, String t, int sIndex, int tIndex){
        if(tIndex == t.length()) return 1;
        if(sIndex == s.length()) return 0;

        if(cache[sIndex][tIndex] != -1) return cache[sIndex][tIndex];

        int result = dfs(s, t, sIndex + 1, tIndex);
        if(s.charAt(sIndex) == t.charAt(tIndex)){
            result += dfs(s, t, sIndex + 1, tIndex + 1);
        }

        cache[sIndex][tIndex] = result;

        return result;
    }
}