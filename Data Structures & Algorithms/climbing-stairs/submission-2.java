class Solution {
    int[] stored = new int[46];

    public int climbStairs(int n) {
        if(n <= 3) return n;
        if(stored[n] != 0) return stored[n];
        int climb1 = climbStairs(n - 1);
        stored[n - 1] = (stored[n - 1] == 0) ? climb1 : stored[n - 1];
        int climb2 = climbStairs(n - 2);
        stored[n - 2] = (stored[n - 2] == 0) ? climb2 : stored[n - 2];
        return climb1 + climb2;
    }
}
