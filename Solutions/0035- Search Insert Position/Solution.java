class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle;

        while (left < right) {
            middle = (left + right) / 2;
            if (nums[middle] > target)
                right = middle - 1;
            else if (nums[middle] < target)
                left = middle + 1;
            else
                return middle;
        }

        if (target <= nums[left])
            return left;
        else
            return left + 1;
    }
}