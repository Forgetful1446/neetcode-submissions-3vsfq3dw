class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character x : text.toCharArray()){
            map.put(x,map.getOrDefault(x, 0) + 1);
        }
        // balloon
        int minCharacter = text.length();

        minCharacter = Math.min(minCharacter, map.getOrDefault('b', 0));
        minCharacter = Math.min(minCharacter, map.getOrDefault('a', 0));
        minCharacter = Math.min(minCharacter, map.getOrDefault('l', 0) / 2);
        minCharacter = Math.min(minCharacter, map.getOrDefault('o', 0) / 2);
        minCharacter = Math.min(minCharacter, map.getOrDefault('n', 0));

        return minCharacter;
    }
}

