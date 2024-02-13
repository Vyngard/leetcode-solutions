class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        answer = 0

        for i in range(0, len(columnTitle)):
            answer += (ord(columnTitle[i]) - ord('A') + 1) * pow(26, len(columnTitle) - i - 1)

        return answer