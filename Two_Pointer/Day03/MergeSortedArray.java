// Problem: LeetCode 88 - Merge Sorted Array
// Pattern: Two Pointer
// Day: 3

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;        // last element of nums1 (valid part)
        int j = n - 1;        // last element of nums2
        int k = m + n - 1;    // last index of nums1 (final position)

        // 🔹 Compare from back and fill
        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];  // place bigger element
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--; // move position
        }

        // 🔹 If nums2 still has elements
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}