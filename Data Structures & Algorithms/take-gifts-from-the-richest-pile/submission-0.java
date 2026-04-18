class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : gifts){
            pq.add(x);
        }

        for(int i = 0; i < k; i++){
            pq.add((int)Math.sqrt(pq.poll()));
        }

        int  result = 0;
        while(!pq.isEmpty()){
            result += pq.poll();
        }
        return result;
    }
}