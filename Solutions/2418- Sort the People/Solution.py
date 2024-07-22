class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        my_dict = dict()
        for i in range(0, len(names)):
            my_dict[heights[i]] = names[i]

        heights.sort(reverse=True)
        answer = list()
        for i in heights:
            answer.append(my_dict[i])
        
        return answer