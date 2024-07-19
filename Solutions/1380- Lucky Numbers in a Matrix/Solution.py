class Solution:
    def luckyNumbers (self, matrix: List[List[int]]) -> List[int]:
        size = len(matrix[0])
        count = 0
        my_set = set()
        answer = list()

        for item in matrix:
            my_set.add(min(item))

        max_number = -1
        while count < size:
            for item in matrix:
                if item[count] > max_number:
                    max_number = item[count]
            if max_number in my_set:
                answer.append(max_number)
            count += 1
            max_number = -1

        return answer