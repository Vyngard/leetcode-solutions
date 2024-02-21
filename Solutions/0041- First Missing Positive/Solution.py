class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        nums.sort()
        index = 0

        for num in nums:
            if num <= 0:
                index += 1
        
        number = 1

        for i in range(index,len(nums)):
            if nums[i] != number:
                return number
            if i + 1 < len(nums) and nums[i+1] != number:
                number += 1
        
        return 1 if nums[-1] <= 0 else nums[-1] + 1
        
        