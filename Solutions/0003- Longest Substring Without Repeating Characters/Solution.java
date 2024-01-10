import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int answer = 0;
        int size;

        while (right < s.length()) {
            char ch = s.charAt(right);
            if (!map.containsKey(ch)) {
                map.put(ch, right);
                right++;
            } else {
                left = Math.max(map.get(ch) + 1, left); // we make sure that the left pointer doesn't go back if there is a duplicate character
                map.put(ch, right);
                right++;
            }
            size = (right - left);
            answer = Math.max(size,answer);
        }

        return answer;
    }
}