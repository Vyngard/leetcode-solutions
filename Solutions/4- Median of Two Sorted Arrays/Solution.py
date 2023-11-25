
def findMedianSortedArrays(nums1, nums2):
    # Ensure nums1 is the smaller array
    if len(nums1) > len(nums2):
        nums1, nums2 = nums2, nums1

    nums1_length = len(nums1)
    nums2_length = len(nums2)

    left = 0
    right = nums1_length

    while left <= right:
        nums1_partition = (right + left) // 2
        nums2_partition = (nums1_length + nums2_length + 1) // 2 - nums1_partition

        nums1_maxLeft = nums1[nums1_partition - 1] if nums1_partition != 0 else float("-infinity")
        nums1_minRight = nums1[nums1_partition] if nums1_partition != nums1_length else float("+infinity")

        nums2_maxLeft = nums2[nums2_partition - 1] if nums2_partition != 0 else float("-infinity")
        nums2_minRight = nums2[nums2_partition] if nums2_partition != nums2_length else float("+infinity")

        if nums1_maxLeft <= nums2_minRight and nums2_maxLeft <= nums1_minRight:
            # we reached the correct partition
            if (nums1_length + nums2_length) % 2 == 0:
                # number of all items are even
                return (max(nums1_maxLeft, nums2_maxLeft) + min(nums1_minRight, nums2_minRight)) / 2
            else:
                # number of all items are odd
                return max(nums1_maxLeft, nums2_maxLeft)
        elif nums1_maxLeft > nums2_minRight:
            # we are too far to right. we should move the partition to left
            right = nums1_partition - 1
        else:
            # we are too far to left. we should move the partition to right
            left = nums1_partition + 1
