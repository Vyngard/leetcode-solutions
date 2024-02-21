class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        my_dict = dict()
        answer = []

        if (len(nums1) < len(nums2)):
            for num in nums1:
                if num not in my_dict:
                    my_dict[num] = 1
                else:
                    my_dict[num] += 1

            for num in nums2:
                if num in my_dict:
                    answer.append(num)
                    if my_dict[num] > 1:
                        my_dict[num] -= 1
                    else:
                        del my_dict[num]
        else:
            for num in nums2:
                if num not in my_dict:
                    my_dict[num] = 1
                else:
                    my_dict[num] += 1

            for num in nums1:
                if num in my_dict:
                    answer.append(num)
                    if my_dict[num] > 1:
                        my_dict[num] -= 1
                    else:
                        del my_dict[num]
        
        return answer