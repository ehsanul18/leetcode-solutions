class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int count = 0;
        int length = nums.length-1;
        for(int i=0; i<nums.length; ++i) {
            if(nums[i] == val) count++;
            
            if(nums[i] == val && length>i) {
                int a = i;
                while(length>a) {
                    if (nums[length] != val) {
                        nums[i] = nums[length];
                        --length;
                        break;
                    }
                    --length;
                }
            }
        }
        int output = nums.length - count;
        return output;
    }
}
