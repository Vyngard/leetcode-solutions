class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        answer = [[1]]

        for i in range(1, numRows):
            temp = list()
            temp.append(1)
            lastList = answer[-1]
            left = 0
            right = 1
            while right < len(lastList):
                temp.append(lastList[left] + lastList[right])
                right += 1
                left += 1

            answer.append(temp + [1])

        return answer
