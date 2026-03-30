class Solution {
    public int findLucky(int[] arr) {
        Hashtable<Integer, Integer> hash = new Hashtable<>();
        for(int x : arr){
            hash.put(x,hash.getOrDefault(x,0) + 1);
        } 
        int max = -1;
        for(Map.Entry<Integer,Integer> entry: hash.entrySet()){
            if(entry.getKey() == entry.getValue()) max = max > entry.getKey() ? max : entry.getKey();
        }
        return max;
    }
}