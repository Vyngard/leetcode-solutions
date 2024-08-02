class Solution:
    def minSwaps(self, nums: List[int]) -> int:
        count_one = nums.count(1)
        n = len(nums)
        
        if count_one == 0:
            return 0 

        answer = count_zero = nums[0:count_one].count(0)    

        for i in range(1, n):
            if nums[i - 1] == 0:
                count_zero -= 1
            
            if nums[(i + count_one - 1) % n] == 0:
                count_zero += 1
            
            answer = min(answer, count_zero)
        
        return answer
                
