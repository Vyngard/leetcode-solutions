class Solution:
    def romanToInt(self, s: str) -> int:
        dict = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }

        number = 0
        index = 0

        while index < len(s):
            if index != len(s) - 1 and dict[s[index + 1]] > dict[s[index]]:
                number += dict[s[index + 1]] - dict[s[index]]
                index += 2
                continue

            number += dict[s[index]]
            index += 1

        return number