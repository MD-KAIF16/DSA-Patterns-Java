// Problem: Count Pairs Whose Sum is Less than Target
// Pattern: Two Pointer
// Day: 3

import java.util.*;

class Solution {
    public int countPairs(List<Integer> nums, int target) {

        // 🔹 Step 1: sort array
        Collections.sort(nums);

        int i = 0;                      // left pointer
        int j = nums.size() - 1;        // right pointer

        int count = 0;

        // 🔹 Step 2: two pointer traversal
        while (i < j) {

            int sum = nums.get(i) + nums.get(j);

            if (sum < target) {

                // 🔥 All pairs from i to j are valid
                count += (j - i);

                i++; // move left pointer
            } else {
                j--; // reduce sum
            }
        }

        return count;
    }
}