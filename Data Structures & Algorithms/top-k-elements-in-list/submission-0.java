class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);

        int current = nums[0];
        int count = 0;
        int i = 0;

        // topK lưu [tần suất, giá trị]
        int[][] topK = new int[nums.length][2];

        for (int x : nums) {
            if (x == current) {
                count++;
            } else {
                // lưu nhóm cũ
                topK[i][0] = count;   // tần suất
                topK[i][1] = current; // giá trị
                i++;

                // reset nhóm mới
                current = x;
                count = 1;
            }
        }
        // lưu nhóm cuối
        topK[i][0] = count;
        topK[i][1] = current;
        i++;

        // sort theo tần suất giảm dần
        Arrays.sort(topK, 0, i, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return b[0] - a[0]; // so sánh tần suất
            }
        });

        // lấy k giá trị có tần suất cao nhất
        int[] result = new int[k];
        for (int j = 0; j < k; j++) {
            result[j] = topK[j][1]; // lấy giá trị, không phải tần suất
        }

        return result;
    }
}