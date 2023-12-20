class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;


        while (left <= right) {
            int mean = (right + left) / 2;
            if (target > nums[mean]) {
                left = mean + 1;
            } else if (target < nums[mean]) {
                right = mean - 1;
            } else {
                return mean;
            }
        }

        return -1;
    }
}