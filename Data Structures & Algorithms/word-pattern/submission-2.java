class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        char[] a = pattern.toCharArray();
        String[] b = s.split(" ");
        if(a.length != b.length) return false;
        for(int i = 0; i < pattern.length(); i++){
            if(map.containsKey(a[i]) || map.containsValue(b[i])){
                if(!map.containsKey(a[i])) return false;
                if (!(map.get(a[i]).equals(b[i]))){
                    return false;
                }
            } else {
                map.put(a[i], b[i]);
            }
        }
        return true;
    }
}