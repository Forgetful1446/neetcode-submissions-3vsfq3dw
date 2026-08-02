class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        // if (n % groupSize != 0) return false;

        final int MAX_VAL = 1000;
        int[] count = new int[MAX_VAL + 1];   // index = giá trị lá bài trực tiếp
        for (int x : hand) count[x]++;

        for (int start = 0; start <= MAX_VAL; start++) {
            if (count[start] == 0) continue;

            int need = count[start];          // số nhóm cần bắt đầu từ đây
            for (int i = start; i < start + groupSize; i++) {
                if (i > MAX_VAL || count[i] < need) return false;
                count[i] -= need;
            }
        }
        return true;
    }
}