class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        answer = list()
        index = 0

        for i in range(0,len(nums)):
            if i == len(nums) - 1 or nums[i] + 1 != nums[i+1]:
                if index == i:
                    answer.append(str(nums[index]))
                else:
                    answer.append(str(nums[index])+"->"+str(nums[i]))
                index = i + 1
        
        return answer
        