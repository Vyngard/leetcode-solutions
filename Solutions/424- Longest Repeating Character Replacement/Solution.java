import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int characterReplacement(String s, int k) {
        if (s.isEmpty())
            return 0;

        int left = 0;
        int right = 0;
        int longestLength = 0;
        char[] myString = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        while (right < myString.length) {
            var current = myString[right];

            if (map.containsKey(current)) {
                map.put(current, map.get(current) + 1);
            } else {
                map.put(current, 1);
            }

            var windowSize = right - left + 1;
            var maxOccurance = Collections.max(map.values());
            var difference = windowSize - maxOccurance;
            if (difference <= k) {
                longestLength = Math.max(longestLength, windowSize);
                right++;
            } else {
                map.put(myString[left], map.get(myString[left]) - 1);
                left++;
                right++;
            }
        }

        return longestLength;


    }
}