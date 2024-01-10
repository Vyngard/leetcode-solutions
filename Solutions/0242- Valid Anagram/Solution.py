class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        map = {}

        for ch in s:
            if map.get(ch):
                map[ch] += 1
            else:
                map[ch] = 1

        for ch in t:
            if not map.get(ch):
                return False

            if map[ch] > 1:
                map[ch] -= 1
            else:
                del map[ch]

        return True