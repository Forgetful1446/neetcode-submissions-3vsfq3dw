class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> myset = new HashSet<>();
        int result = words.length;
        for(Character x : allowed.toCharArray()){
            myset.add(x);
        }

        for(String word : words){
            for(Character x : word.toCharArray()){
                if (!myset.contains(x)) {
                    result--;
                    break;
                }
            }
        }
        return result;
    }
}