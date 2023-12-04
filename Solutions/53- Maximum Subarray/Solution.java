class Solution {
    public int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int currentSub = 0;

        for (var num : nums) {
            if (currentSub < 0)
                currentSub = 0;
            currentSub += num;
            maxSub = Math.max(maxSub, currentSub);
        }

        return maxSub;
    }
}