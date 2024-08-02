class Solution:
    def countSeniors(self, details: List[str]) -> int:
        answer = 0
        for item in details:
            age = int(item[-4:-2])
            if age > 60:
                answer += 1
        return answer
        