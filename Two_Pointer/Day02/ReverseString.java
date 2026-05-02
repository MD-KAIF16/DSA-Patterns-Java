// Problem: LeetCode 344 - Reverse String
// Pattern: Two Pointer
// Day: 3

// Input: ['h','e','l','l','o']
// Output: ['o','l','l','e','h']

class Solution {
    public void reverseString(char[] s) {

        int i = 0;                  // left pointer
        int j = s.length - 1;       // right pointer

        while (i < j) {

            // 🔹 Dry Run (short)
            // i=0, j=4 → swap h & o
            // i=1, j=3 → swap e & l
            // i=2, j=2 → stop

            // swap characters
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            // move pointers
            i++;
            j--;
        }
    }
}