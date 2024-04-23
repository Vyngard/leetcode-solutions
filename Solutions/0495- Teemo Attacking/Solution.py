class Solution:
    def findPoisonedDuration(self, timeSeries: List[int], duration: int) -> int:
        total = 0
        endPoison = 0

        for i in range(0,len(timeSeries)):
            endPoison = timeSeries[i] + duration - 1
            if i == len(timeSeries) - 1 or endPoison < timeSeries[i+1]:
                total += duration
            else:
                total += timeSeries[i+1] - timeSeries[i]
        
        return total
