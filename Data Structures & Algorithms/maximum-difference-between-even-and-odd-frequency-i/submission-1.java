class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (Character x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int maxOdd = 0;
        int minEven = 1000;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int temp = entry.getValue();

            if (temp % 2 == 0) {
                minEven = Math.min(minEven, temp);
            } else {
                maxOdd = Math.max(maxOdd, temp);
            }
        }

        return maxOdd - minEven;
    }
}