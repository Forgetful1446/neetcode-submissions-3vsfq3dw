class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for(String x : words){
            for(String y : words){
                if(x.contains(y) && !x.equals(y) && !result.contains(y)) result.add(y);
            }
        }
        return result;
    }
}