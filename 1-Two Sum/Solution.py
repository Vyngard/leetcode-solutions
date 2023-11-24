class Solution(object):
    def twoSum(self, nums, target):
        my_dict = {}
        for i in range(len(nums)):
            if target - nums[i] in my_dict:
                return [my_dict[target - nums[i]], i]
            my_dict[nums[i]] = i
        
        
    