class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        my_dict = Counter(arr)

        for item in arr:
            if my_dict[item] == 1:
                if k == 1:
                    return item
                else:
                    k -= 1
        return ""
        