class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] need = new int[26];
        int[] window = new int[26];

        // Đếm ký tự của s1
        for (char c : s1.toCharArray()) {
            need[c - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {
            // thêm ký tự bên phải vào window
            window[s2.charAt(right) - 'a']++;

            // giữ kích thước cửa sổ = s1.length()
            if (right - left + 1 > s1.length()) {
                window[s2.charAt(left) - 'a']--;
                left++;
            }

            // kiểm tra 2 mảng có giống nhau không
            if (matches(need, window)) {
                return true;
            }
        }

        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}