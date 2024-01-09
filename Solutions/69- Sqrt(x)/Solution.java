class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;

        while (left < right) {
            int middle = (left + right + 1) / 2;
            if (middle > (x / middle)) {
                right = middle - 1;
            } else {
                left = middle;
            }
        }
        return left;
    }
}