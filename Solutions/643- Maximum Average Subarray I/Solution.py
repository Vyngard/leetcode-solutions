class Solution:
    def findMaxAverage(self, nums: [int], k: int) -> float:
        if len(nums) < k:
            average = 0
            for num in nums:
                average += num
            return average / k

        if not nums:
            return 0

        tempSum = 0

        for i in range(0, k):
            tempSum += nums[i]

        maxSum = tempSum

        for i in range(1, len(nums) - k + 1):
            tempSum = tempSum - nums[i - 1] + nums[i + k - 1]

            maxSum = max(tempSum, maxSum)

        return maxSum / k
