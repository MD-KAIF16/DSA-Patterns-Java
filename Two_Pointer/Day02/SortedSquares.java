// Problem: LeetCode 977 - Squares of a Sorted Array
// Pattern: Two Pointer
// Day: 2/3

class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];

        int i = 0;          // left pointer
        int j = n - 1;      // right pointer
        int k = n - 1;      // result array fill from end

        while (i <= j) {

            // compare absolute values
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                res[k] = nums[i] * nums[i]; // bigger square
                i++;
            } else {
                res[k] = nums[j] * nums[j];
                j--;
            }

            k--; // move result pointer
        }

        return res;
    }
}