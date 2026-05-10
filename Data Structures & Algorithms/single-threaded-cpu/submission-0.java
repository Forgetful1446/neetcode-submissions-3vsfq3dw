class Solution {
    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;

        // [enqueueTime, processingTime, index]
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            arr[i][0] = tasks[i][0];
            arr[i][1] = tasks[i][1];
            arr[i][2] = i;
        }

        // sort theo enqueueTime
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        // pq: processingTime nhỏ nhất trước
        // nếu bằng nhau -> index nhỏ hơn
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a[1] == b[1]) {
                    return Integer.compare(a[2], b[2]);
                }
                return Integer.compare(a[1], b[1]);
            }
        );

        int[] ans = new int[n];

        long time = 0;
        int i = 0;
        int idx = 0;

        while (i < n || !pq.isEmpty()) {

            // nếu cpu rảnh và chưa có task nào available
            if (pq.isEmpty() && time < arr[i][0]) {
                time = arr[i][0];
            }

            // thêm tất cả task đã available
            while (i < n && arr[i][0] <= time) {
                pq.offer(arr[i]);
                i++;
            }

            // lấy task tốt nhất
            int[] cur = pq.poll();

            ans[idx++] = cur[2];

            time += cur[1];
        }

        return ans;
    }
}