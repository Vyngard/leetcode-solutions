class NumArray {
    private int[] myArray;

    public NumArray(int[] nums) {
        int size = nums.length;
        myArray = new int[size + 1];
        for (int i = 0; i < size; i++) {
            myArray[i+1] = myArray[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return myArray[right + 1] - myArray[left];
    }
}