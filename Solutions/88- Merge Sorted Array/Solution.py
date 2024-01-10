class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        index1 = m - 1
        index2 = n - 1
        pointer = m + n - 1

        while index2 >= 0:
            if index1 >= 0 and nums1[index1] > nums2[index2]:
                nums1[pointer] = nums1[index1]
                index1 -= 1
            else:
                nums1[pointer] = nums2[index2]
                index2 -= 1
            pointer -= 1