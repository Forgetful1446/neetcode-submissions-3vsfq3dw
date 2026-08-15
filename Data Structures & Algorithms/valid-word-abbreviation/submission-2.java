class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int index = 0;

        for (int i = 0; i < abbr.length(); i++) {

            if (Character.isDigit(abbr.charAt(i))) {

                if (abbr.charAt(i) == '0') {
                    return false;
                }

                int length = 0;

                while (i < abbr.length() && Character.isDigit(abbr.charAt(i))) {
                    length = length * 10 + (abbr.charAt(i) - '0');
                    i++;
                }

                index += length;
                i--;

            } else {

                if (index >= word.length() || abbr.charAt(i) != word.charAt(index)) {
                    return false;
                }

                index++;
            }
        }

        return index == word.length();
    }
}