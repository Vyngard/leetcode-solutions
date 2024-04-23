class Solution:
    def constructRectangle(self, area: int) -> List[int]:
        mean = int(sqrt(area))

        while area % mean != 0:
            mean -= 1
        
        return [area//mean, mean]
        