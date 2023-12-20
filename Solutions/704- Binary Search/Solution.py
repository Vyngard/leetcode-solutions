from ast import List

class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left = 0
        right = len(nums) - 1
        
        
        while left <= right:
            mean = (left + right) // 2
            if target > nums[mean]:
                left = mean + 1
            elif target < nums[mean]:
                right = mean - 1
            else:
                return mean
        
        
        return -1
        
        
        