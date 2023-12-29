from typing import List


class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        index = len(digits) - 1

        digits[-1] += 1

        while digits[index] > 9:
            digits[index] %= 10
            index -= 1
            if index < 0:
                return [1] + digits

            digits[index] += 1

        return digits