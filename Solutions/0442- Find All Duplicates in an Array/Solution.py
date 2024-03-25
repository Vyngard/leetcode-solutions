class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        answer = list()

        for i in range(0,len(nums)):
            while nums[i] != nums[nums[i] - 1]:
                temp = nums[nums[i] - 1]
                nums[nums[i] - 1] = nums[i]
                nums[i] = temp
        
        for i in range(0,len(nums)):
            if nums[i] != i + 1:
                answer.append(nums[i])
        
        return answer
        