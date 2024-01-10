class Solution:
    def maxSubArray(self, nums: list[int]) -> int:
        maxSub = nums[0]
        currentSub = 0

        for num in nums:
            if currentSub < 0:
                currentSub = 0
            currentSub += num
            maxSub = max(currentSub, maxSub)

        return maxSub