class Solution:
    def maximumHappinessSum(self, happiness: List[int], k: int) -> int:
        happiness.sort()
        answer = 0

        for i in range(0,k):
            temp = max(happiness[-1 - i] - i,0)
            answer += temp

        return answer