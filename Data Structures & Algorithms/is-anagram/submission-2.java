class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mapAnagram = new HashMap<>();
        for(Character x : s.toCharArray()){
            if(mapAnagram.containsKey(x)){
                mapAnagram.put(x,mapAnagram.get(x) + 1);
            } else {
                mapAnagram.put(x,1);
            }
        }

        for (Character z : t.toCharArray()){
            if(mapAnagram.containsKey(z) && mapAnagram.get(z) > 0 ){
                mapAnagram.put(z,  mapAnagram.get(z) - 1);
                if(mapAnagram.containsValue(0)) mapAnagram.remove(z);
            } else {
                return false;
            }
        }
        
        return mapAnagram.isEmpty();
    }       
}