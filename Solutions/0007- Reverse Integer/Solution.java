class Solution {
    public int reverse(int x) {
        boolean negative = x < 0;
        int answer = 0;
        x = Math.abs(x);

        while (x > 0) {
           if (answer > (Integer.MAX_VALUE / 10) || -answer < (Integer.MIN_VALUE / 10))
               return 0;

           answer *= 10;
           answer = answer + (x % 10);
           x /= 10;
        }

        return negative ? (-answer) : answer;
    }
}