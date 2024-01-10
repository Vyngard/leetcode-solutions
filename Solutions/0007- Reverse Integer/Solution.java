public class Solution {
    public int reverse(int x) {
        int answer = 0;
        int z = x;
        x = Math.abs(x);

        while (x != 0) {

            if (answer > Integer.MAX_VALUE / 10 || answer < Integer.MIN_VALUE / 10)
                return 0;

            answer = (answer * 10) + (x % 10);
            x /= 10;

        }
        if (z < 0)
            return -1 * answer;

        return answer;
    }

}
