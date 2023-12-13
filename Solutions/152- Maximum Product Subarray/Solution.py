class Solution:
    def maxProduct(self, nums: list[int]) -> int:
        if len(nums) == 1:
            return nums[0]

        max_num, min_num = 1, 1
        answer = 0

        for num in nums:
            if num == 0:
                min_num, max_num = 1, 1
                continue

            temp_min = min_num * num
            temp_max = max_num * num
            min_num = min(min(temp_min, temp_max),num)
            max_num = max(max(temp_min, temp_max), num)

            answer = max(max_num, answer)


        return answer
