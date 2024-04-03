class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        for i in range(0,len(nums)):
            while nums[nums[i] - 1] != nums[i]:
                nums[nums[i] - 1], nums[i] = nums[i], nums[nums[i] - 1]
        
        answer = list()

        for i in range(0,len(nums)):
            if nums[i] != i + 1:
                answer.append(i + 1)

        return answer
        