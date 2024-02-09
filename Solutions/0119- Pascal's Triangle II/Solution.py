class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        my_list = [1]

        if rowIndex == 0:
            return my_list

        while rowIndex > 0:
            temp = my_list
            my_list = [1]
            for i in range(0,len(temp) - 1):
                my_list.append(temp[i] + temp[i+1])
            my_list.append(1)
            rowIndex -= 1

        return my_list