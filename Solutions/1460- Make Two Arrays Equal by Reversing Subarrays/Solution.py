class Solution:
    def canBeEqual(self, target: List[int], arr: List[int]) -> bool:
        my_dict = dict()
        for item in arr:
            if item not in my_dict:
                my_dict[item] = 1
            else:
                my_dict[item] += 1
        
        for item in target:
            if item not in my_dict:
                return False
            else:
                if my_dict[item] > 1:
                    my_dict[item] -= 1
                else:
                    my_dict.pop(item)
        
        return True