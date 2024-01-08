class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        if not nums:
            return [-1, -1]

        left, right = 0, len(nums) - 1
        start, finish = len(nums), -1

        # Search for the finish position
        while left < right:
            middle = (left + right) // 2
            if target > nums[middle]:
                left = middle + 1
            elif target < nums[middle]:
                right = middle - 1
            else:
                finish = middle
                left = middle + 1

        if nums[left] == target:
            finish = left

        # Reset for searching the start position
        left, right = 0, len(nums) - 1

        # Search for the start position
        while left < right:
            middle = (left + right) // 2
            if target > nums[middle]:
                left = middle + 1
            elif target < nums[middle]:
                right = middle - 1
            else:
                start = middle
                right = middle - 1

        if nums[left] == target:
            start = left

        if start == len(nums):
            start = -1

        return [start, finish]