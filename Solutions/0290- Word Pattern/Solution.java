import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();

        var sArray = s.split(" ");
        
        if (pattern.length() != sArray.length)
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if (!map.containsKey(ch)) {
                if (map.containsValue(sArray[i]))
                    return false;
                map.put(ch, sArray[i]);
            }
            else {
                if (!map.get(ch).equals(sArray[i]))
                    return false;
            }
        }

        return true;


    }
}