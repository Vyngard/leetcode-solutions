class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        map = dict()

        for i in range(0,len(nums)):
            item = nums[i]
            if item not in map:
                map[item] = i
            else:
                if abs(map[item] - i) <= k:
                    return True
                else:
                    map[item] = i

        return False