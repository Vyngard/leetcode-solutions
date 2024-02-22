class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:
        following = [0] * (n + 1)  # who I trust
        follower = [0] * (n + 1)  # who trust me

        for item in trust:
            following[item[0]] += 1
            follower[item[1]] += 1

        for i in range(1,n+1):
            if following[i] == 0 and follower[i] == n - 1:
                return i
        
        return -1