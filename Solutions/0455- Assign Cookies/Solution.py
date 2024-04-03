class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g.sort()
        s.sort()

        answer = 0
        index1 = 0
        index2 = 0

        while index1 < len(g) and index2 < len(s):
            if s[index2] >= g[index1]:
                index1 += 1
                answer += 1
            index2 += 1
        
        return answer
        