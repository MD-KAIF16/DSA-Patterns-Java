class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        // If there are fewer than 3 numbers, no triplet can be formed
        if (nums.length < 3) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Sort the array to apply two-pointer technique
        Arrays.sort(nums);

        // Step 2: Fix one number at a time and find pairs that sum to -nums[i]
        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicates for the first number
            // Example: if nums[i] == nums[i-1], the same triplet would repeat
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Call the two-pointer based function to find valid pairs
            twoSum(nums, i + 1, result, -nums[i]);
        }

        return result;
    }

    /**
     * Finds all pairs nums[i] + nums[j] = target using two pointers.
     * Starting from index 'k' to the end of the array.
     */
    private void twoSum(int[] nums, int k, List<List<Integer>> result, int target) {

        int i = k;                 // Left pointer
        int j = nums.length - 1;   // Right pointer

        // Move the two pointers inward
        while (i < j) {

            int sum = nums[i] + nums[j];

            if (sum > target) {
                // If sum is too large, move right pointer left
                j--;

            } else if (sum < target) {
                // If sum is too small, move left pointer right
                i++;

            } else {
                // Found a valid triplet: nums[i] + nums[j] + (original fixed number) = 0
                result.add(Arrays.asList(-target, nums[i], nums[j]));

                // Skip duplicates on the left side
                while (i < j && nums[i] == nums[i + 1]) {
                    i++;
                }

                // Skip duplicates on the right side
                while (i < j && nums[j] == nums[j - 1]) {
                    j--;
                }

                // Move both pointers inward after recording the triplet
                i++;
                j--;
            }
        }
    }
}