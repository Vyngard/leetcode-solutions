class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int start = -1;
        int finish = -1;
        int middle;

        while (left < right) {
            middle = (left + right + 1) / 2;
            if (target < nums[middle])
                right = middle - 1;
            else if (target > nums[middle])
                left = middle + 1;
            else if (target == nums[middle]) {
                start = middle;
                right = middle - 1;
            }
        }

        if (left == right && nums[left] == target)
            start = left;
        
        left = 0;
        right = nums.length - 1;

        while (left < right) {
            middle = (left + right + 1) / 2;
            if (target < nums[middle])
                right = middle - 1;
            else if (target > nums[middle])
                left = middle + 1;
            else if (target == nums[middle]) {
                finish = middle;
                left = middle + 1;
            }
        }

        if (left == right && nums[left] == target)
            finish = left;
        

        return new int[]{start,finish};
    }

}