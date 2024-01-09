class Solution:
    def mySqrt(self, x: int) -> int:
        left = 0, x

        while left < right:
            middle = (left + right + 1) // 2

            if middle > (x // middle):
                right = middle - 1
            else:
                left = middle

        return left