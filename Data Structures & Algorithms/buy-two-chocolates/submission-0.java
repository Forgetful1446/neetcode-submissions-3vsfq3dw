class Solution {
    public int buyChoco(int[] prices, int money) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int price : prices){
            pq.offer(price);
        }

        int choco1 = pq.poll();
        int choco2 = pq.poll();

        return choco1 + choco2 > money ? money : money - choco1 - choco2;
    }
}