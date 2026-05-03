// Problem: LeetCode 167 - Two Sum II (Sorted)
// Pattern: Two Pointer
// Day: 3

class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int i = 0;                      // left pointer
        int j = numbers.length - 1;     // right pointer

        while (i < j) {

            int sum = numbers[i] + numbers[j];

            // 🔹 if sum is too big → decrease it
            if (sum > target) {
                j--;
            }

            // 🔹 if sum is too small → increase it
            else if (sum < target) {
                i++;
            }

            // 🔥 found the answer
            else {
                return new int[]{i + 1, j + 1}; // 1-based index
            }
        }

        return new int[]{-1, -1}; // fallback
    }
}