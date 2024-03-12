class Solution:
    def arrangeCoins(self, n: int) -> int:
        for i in range(1,n+1):
            n -= i
            if n <= i:
                return i
        
        return -1
        