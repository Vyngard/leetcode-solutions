public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int nums1Length = nums1.length;
        int nums2Length = nums2.length;

        int left = 0;
        int right = nums1Length;

        while (left <= right) {
            int nums1Partition = (left + right) / 2;
            int nums2Partition = (nums1Length + nums2Length + 1) / 2 - nums1Partition;

            int nums1MaxLeft = (nums1Partition != 0) ? nums1[nums1Partition - 1] : Integer.MIN_VALUE;
            int nums1MinRight = (nums1Partition != nums1Length) ? nums1[nums1Partition] : Integer.MAX_VALUE;

            int nums2MaxLeft = (nums2Partition != 0) ? nums2[nums2Partition - 1] : Integer.MIN_VALUE;
            int nums2MinRight = (nums2Partition != nums2Length) ? nums2[nums2Partition] : Integer.MAX_VALUE;

            if (nums1MaxLeft <= nums2MinRight && nums2MaxLeft <= nums1MinRight) {
                // Correct partition
                if ((nums1Length + nums2Length) % 2 == 0) {
                    // Number of all items is even
                    return (Math.max(nums1MaxLeft, nums2MaxLeft) + Math.min(nums1MinRight, nums2MinRight)) / 2.0;
                } else {
                    // Number of all items is odd
                    return Math.max(nums1MaxLeft, nums2MaxLeft);
                }
            } else if (nums1MaxLeft > nums2MinRight) {
                // Move partition to the left
                right = nums1Partition - 1;
            } else {
                // Move partition to the right
                left = nums1Partition + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays not sorted or empty");
    }

}
