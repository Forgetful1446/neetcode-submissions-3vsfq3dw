class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        int left = 0;
        int max = 0;

        for(int right = 0; right < fruits.length; right++){
            myMap.put(fruits[right], myMap.getOrDefault(fruits[right], 0) + 1);

            while(myMap.size() > 2){
                myMap.put(fruits[left], myMap.get(fruits[left]) - 1);

                if(myMap.get(fruits[left]) == 0)
                    myMap.remove(fruits[left]);

                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}