import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxCount = 0;
        for (var ch : s.toCharArray()) {
            if (!set.contains(ch)) {
                right++;
                set.add(ch);
            } else {
                while (left < right) {
                    set.remove(s.charAt(left));
                    left++;
                    if (!set.contains(ch)) {
                        right++;
                        set.add(ch);
                        break;
                    }

                }
            }
            maxCount = Math.max(maxCount, right - left);
        }
        return maxCount;
    }
}