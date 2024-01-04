class Solution:
    def firstUniqChar(self, s: str) -> int:
        map = {}

        for ch in s:
            if map.get(ch) is None:
                map[ch] = 1
            else:
                map[ch] += 1

        for i in range(0,len(s)):
            if map[s[i]] == 1:
                return i

        return -1