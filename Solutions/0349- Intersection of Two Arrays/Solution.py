class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        my_set = set()
        answer = []

        if (len(nums1) < len(nums2)):
            for num in nums1:
                my_set.add(num)

            for num in nums2:
                if num in my_set:
                    answer.append(num)
                    my_set.remove(num)
        else:
            for num in nums2:
                my_set.add(num)

            for num in nums1:
                if num in my_set:
                    answer.append(num)
                    my_set.remove(num)
        
        return answer