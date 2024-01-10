class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        map = {}

        for ch in magazine:
            if ch not in map:
                map[ch] = 1
                continue
            map[ch] += 1

        for ch in ransomNote:
            if ch not in map:
                return False

            if map[ch] > 1:
                map[ch] -= 1
            else:
                del map[ch]

        return True