class Solution {
    public boolean isPerfectSquare(int num) {
        long left = 1;
        long right = num;
        while (left < right) {
            long middle = (left + right) >>> 1;
            if (middle * middle >= num) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left * left == num;
    }
}