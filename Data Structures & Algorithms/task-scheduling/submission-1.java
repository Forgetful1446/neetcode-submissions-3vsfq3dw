class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for(char task : tasks){
            count[task - 'A']++;
        }

        int max = 0;
        int maxCount = 0;
        for(int i = 0; i < 26; i++){
            if(count[i] > max) {
                max = count[i];
                maxCount = 0;
            }
            if(count[i] == max) maxCount++;
        } 

        int formula = (max - 1) * (n + 1) + maxCount;

        return Math.max(tasks.length, formula);
    }
}
