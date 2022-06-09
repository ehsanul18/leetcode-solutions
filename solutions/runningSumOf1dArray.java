class Solution {
    public int[] runningSum(int[] nums) {
        if (nums.length == 1) return nums;
        int [] output_arr = new int[nums.length];
        output_arr[0] = nums[0];
        output_arr[1] = nums[0] + nums[1];
        
        for (int i=2; i < output_arr.length; ++i) {
            output_arr[i] = output_arr[i-1] + nums[i];
        }
        
        return output_arr;
    }
}
