class KthLargest {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int k = 0;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int x : nums){
            add(x);
        }
    }
    
    public int add(int val) {
        minHeap.add(val);
        if(minHeap.size() > k) minHeap.poll();
        return minHeap.peek();
    }
}
