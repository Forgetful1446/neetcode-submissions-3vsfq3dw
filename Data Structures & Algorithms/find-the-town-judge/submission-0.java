class Solution {
    public int findJudge(int n, int[][] trust) {
        if (n == 1) return 1;
        int[] vote = new int[n];

        for(int[] x : trust){
            vote[x[0] - 1]--;
            vote[x[1] - 1]++;
        }

        for(int i = 0; i < n; i++){
            if(vote[i] == n -1) return i + 1;
        }
        return -1;
    }
}