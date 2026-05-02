class Solution {

    // Helper function:
    // Check if substring from index i to j is a palindrome
    public boolean palindrome(int i, int j, String s) {

        // Compare characters from both ends
        while (i < j) {
            // If mismatch → not palindrome
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            // Move pointers inward
            i++;
            j--;
        }

        return true; // all matched
    }

    public boolean validPalindrome(String s) {

        int i = 0;                  // left pointer (start)
        int j = s.length() - 1;     // right pointer (end)

        while (i < j) {

            char left = s.charAt(i);
            char right = s.charAt(j);

            // If characters don't match
            if (left != right) {

                // We can remove ONE character
                // Option 1: skip left
                // Option 2: skip right

                return palindrome(i + 1, j, s) || 
                       palindrome(i, j - 1, s);
            }

            // If match → move both pointers
            i++;
            j--;
        }

        return true; // already palindrome
    }
}