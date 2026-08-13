public class Solution {
    public boolean makeEqual(String[] words) {
        int[] freq = new int[26];
        int flag = 0;
        int n = words.length;

        for (String w : words) {
            for (char c : w.toCharArray()) {
                int i = c - 'a';
                if (freq[i] != 0) {
                    freq[i]++;
                    if (freq[i] % n == 0) {
                        flag++;
                    }
                } else {
                    freq[i]++;
                    if (freq[i] % n != 0) {
                        flag--;
                    }
                }
                freq[i] %= n;
            }
        }

        return flag == 0;
    }
}