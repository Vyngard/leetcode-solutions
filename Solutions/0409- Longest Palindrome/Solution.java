import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (!set.contains(ch))
                set.add(ch);
            else {
                set.remove(ch);
                count += 2;
            }
        }



        return !set.isEmpty() ? count + 1 : count;
    }
}