class Solution {
    public int climbStairs(int n) {
        int firstStep = 0;
        int secondStep = 1;

        for (int i = 0; i < n; i++) {
            int sum = firstStep + secondStep;
            firstStep = secondStep;
            secondStep = sum;
        }

        return secondStep;
    }
}