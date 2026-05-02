// Problem: LeetCode 125 - Valid Palindrome
// Pattern: Two Pointer
// Day: 2

// Input: "A man, a plan, a canal: Panama"
// Output: true

class Solution {
    public boolean isPalindrome(String s) {

        int i = 0;                  // left pointer
        int j = s.length() - 1;     // right pointer

        while (i < j) {

            char left = s.charAt(i);
            char right = s.charAt(j);

            // 🔹 Short Dry Run Example:
            // 'A' vs 'a' → match
            // ' ' → skip
            // 'm' vs 'm' → match
            // ',' → skip
            // continue... → all match → return true

            // skip non-alphanumeric from left
            if (!Character.isLetterOrDigit(left)) {
                i++;
                continue;
            }

            // skip non-alphanumeric from right
            if (!Character.isLetterOrDigit(right)) {
                j--;
                continue;
            }

            // compare (ignore case)
            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            }

            // move both pointers
            i++;
            j--;
        }

        return true; // all characters matched
    }
}