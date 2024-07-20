class Solution:
    def restoreMatrix(self, rowSum: List[int], colSum: List[int]) -> List[List[int]]:
        answer = list()
        for i in range(0,len(rowSum)):
            temp = list()
            for j in range(0, len(colSum)):
                min_numer = min(rowSum[i], colSum[j])
                temp.append(min_numer)
                rowSum[i] -= min_numer
                colSum[j] -= min_numer
            answer.append(temp)
        return answer
        