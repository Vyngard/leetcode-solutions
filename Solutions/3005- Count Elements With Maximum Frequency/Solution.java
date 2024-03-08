class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101];
        int max = 0;
        for (int num : nums) {
            arr[num]++;
            if (arr[num] > max)
                max = arr[num];
        }

        int count = 0;
        for (int elem : arr) {
            if (elem == max)
                count += elem;
        }

        return count;
    }
}