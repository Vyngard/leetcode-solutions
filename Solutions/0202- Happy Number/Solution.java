import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);
            int temp = 0;
            while (n != 0) {
                temp += (int) Math.pow((n % 10),2);
                n /= 10;
            }
            n = temp;
        }

        return n == 1;

    }
}