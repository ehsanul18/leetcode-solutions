class Solution {
    public int maxSubArray(int[] nums) {
        // kadane's algorithm
        int max_current = nums[0];
        int max_global = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            max_current = Math.max(nums[i], max_current + nums[i]);
            if (max_current > max_global) max_global = max_current;
        }
        return max_global;
    }
}
