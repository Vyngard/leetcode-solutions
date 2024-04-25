class Solution {
    public int pivotIndex(int[] nums) {
        int count = 0;
        for (int num : nums)
            count += num;

        int left = 0;
        int right = count;
        
        for (int i = 0; i < nums.length; ++i) {
            right -= nums[i];
            if (left == right) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}