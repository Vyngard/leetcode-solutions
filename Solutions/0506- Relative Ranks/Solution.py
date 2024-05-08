class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        temp = score[:]
        answer = [None] * len(score)
        rank_map = {}

        
        for index, value in enumerate(sorted(score, reverse=True)):
            rank_map[value] = index + 1

       
        for i in range(len(score)):
            rank = rank_map[temp[i]]
            if rank == 1:
                answer[i] = "Gold Medal"
            elif rank == 2:
                answer[i] = "Silver Medal"
            elif rank == 3:
                answer[i] = "Bronze Medal"
            else:
                answer[i] = str(rank)

        return answer
        