class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0)
            return new int[]{-1,-1};
        int left = 0;
        int right = nums.length - 1;
        int middle;
        int start = nums.length;
        int finish = -1;

        while (left < right) {
            middle = (left + right) / 2;
            if (target > nums[middle]) {
                left = middle + 1;
            } else if (target < nums[middle]) {
                right = middle - 1;
            } else {
                finish = middle;
                left = middle + 1;
            }
        }

        if (nums[left] == target)
            finish = left;

        left = 0;
        right = nums.length - 1;

        while (left < right) {
            middle = (left + right) / 2;
            if (target > nums[middle]) {
                left = middle + 1;
            } else if (target < nums[middle]) {
                right = middle - 1;
            } else {
                start = middle;
                right = middle - 1;
            }
        }

        if (nums[left] == target)
            start = left;

        if (start == nums.length)
            start = -1;

        return new int[]{start,finish};
    }
}