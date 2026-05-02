// Problem: Valid Word Abbreviation
// Pattern: Two Pointer

class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {

        int i = 0; // pointer for word
        int j = 0; // pointer for abbr

        while (i < word.length() && j < abbr.length()) {

            char w = word.charAt(i);
            char a = abbr.charAt(j);

            // 🔹 If current abbr char is digit
            if (Character.isDigit(a)) {

                // ❗ leading zero not allowed
                if (a == '0') return false;

                int num = 0;

                // build full number (for cases like "12")
                while (j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
                    num = num * 10 + (abbr.charAt(j) - '0');
                    j++;
                }

                // skip characters in word
                i = i + num;

            } else {
                // 🔹 If character → must match
                if (w != a) return false;

                i++;
                j++;
            }
        }

        // both pointers should reach end
        return i == word.length() && j == abbr.length();
    }
}