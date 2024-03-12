class Solution {
    public int arrangeCoins(int n) {
        for (int i = 1; i <= n; i++) {
            n -= i;
            if (n <= i) {
                return i;
            }
        }

        return -1;
        
    }
}