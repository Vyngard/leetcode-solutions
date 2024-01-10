class Solution:
    def productExceptSelf(self, nums: list[int]) -> [int]:
        length = len(nums)

        prefix = [1] * length
        postfix = [1] * length

        prefix[0] = nums[0]
        for i in range(1, length):
            prefix[i] = prefix[i - 1] * nums[i]

        postfix[length - 1] = nums[length - 1]

        for i in range(length - 2, -1, -1):
            postfix[i] = postfix[i + 1] * nums[i]

        nums[0] = postfix[1]
        nums[length - 1] = prefix[length - 2]

        for i in range(1, length - 1):
            nums[i] = prefix[i - 1] * postfix[i + 1]

        return nums
