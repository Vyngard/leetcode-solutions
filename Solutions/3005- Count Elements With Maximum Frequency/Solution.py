class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        arr = [0] * 101
        max_num = 0

        for num in nums:
            arr[num] += 1
            if arr[num] > max_num:
                max_num = arr[num]

        count = 0
        for elem in arr:
            if elem == max_num:
                count += elem
        
        return count
        