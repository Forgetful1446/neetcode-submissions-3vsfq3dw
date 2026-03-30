class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> ransomNoteMap  = new HashMap<>();
        HashMap<Character, Integer> magazineMap  = new HashMap<>();

        for(char x : ransomNote.toCharArray()){
            ransomNoteMap.put(x, ransomNoteMap.getOrDefault(x, 0) + 1);
        }

        for(char x : magazine.toCharArray()){
            magazineMap.put(x, magazineMap.getOrDefault(x, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : ransomNoteMap.entrySet()){
            if(magazineMap.get(entry.getKey()) == null || entry.getValue() > magazineMap.get(entry.getKey())){
                return false;
            }
        }
        return true;
    }
}