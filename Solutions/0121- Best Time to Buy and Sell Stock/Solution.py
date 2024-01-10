class Solution:
    def maxProfit(self, prices: [int]) -> int:
        if len(prices) < 2:
            return 0

        answer = 0
        minimum = prices[0]

        for price in prices:
            answer = max(answer, price - minimum)
            minimum = min(minimum, price)


        return answer