class KthLargest {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    int k = 0;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int x : nums){
            maxHeap.add(x);
        }
    }
    
    public int add(int val) {
        maxHeap.add(val);
        int[] temp = new int[k - 1];
        for(int i = 0; i < k - 1; i++){
            temp[i] = maxHeap.poll();
        }
        int result = maxHeap.peek();
        for(int x : temp){
            maxHeap.add(x);
        }

        return result;
    }
}
