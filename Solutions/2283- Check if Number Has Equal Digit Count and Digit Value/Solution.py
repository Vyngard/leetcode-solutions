class Solution:
    def digitCount(self, num: str) -> bool:
        digit_count = [0] * 10

        for ch in num:
            digit_count[int(ch)] += 1

        for i in range(len(num)):
            if digit_count[i] != int(num[i]):
                return False

        return True