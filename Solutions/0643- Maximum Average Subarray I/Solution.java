class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length <= k) {
            double average = 0;
            for (var num : nums) {
                average += num;
            }
            return average / k;
        }

        if (nums.length == 0)
            return 0;

        double tempSum = 0;

        for (int i = 0; i < k; i++)
            tempSum += nums[i];

        double maxSum = tempSum;

        for (int i = 1; i <= nums.length - k; i++) {
            tempSum = tempSum - nums[i-1] + nums[i + k - 1];

            maxSum = Math.max(maxSum,tempSum);
        }

        return maxSum / k;
    }
}