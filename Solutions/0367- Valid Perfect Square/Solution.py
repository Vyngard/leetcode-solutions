class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        left, right = 1, num
        while left < right:
            middle = (left + right) // 2
            if middle * middle >= num:
                right = middle
            else:
                left = middle + 1
        return left * left == num