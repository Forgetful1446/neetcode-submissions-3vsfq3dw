class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapAnagram = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars); // chuyển thành String để làm key

            // nếu key chưa có thì tạo list mới
            if (!mapAnagram.containsKey(key)) {
                mapAnagram.put(key, new ArrayList<>());
            }

            // thêm từ gốc vào list
            mapAnagram.get(key).add(strs[i]);
        }

        // chuyển values trong map thành result
        result.addAll(mapAnagram.values());

        return result;
        
    }
}