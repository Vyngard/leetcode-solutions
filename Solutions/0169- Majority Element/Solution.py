class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        my_dict = dict()
        n = len(nums) // 2

        for num in nums:
            if num not in my_dict:
                my_dict[num] = 1
            else:
                my_dict[num] += 1

            if my_dict[num] > n:
                return num

        return -1