class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if len(needle) > len(haystack):
            return -1

        for i in range(0, len(haystack)):
            if haystack[i] == needle[0]:
                haystackIndex = i
                needleIndex = 0
                while haystackIndex < len(haystack) and haystack[haystackIndex] == needle[needleIndex]:
                    if needleIndex == len(needle) - 1:
                        return i
                    haystackIndex += 1
                    needleIndex += 1

        return -1