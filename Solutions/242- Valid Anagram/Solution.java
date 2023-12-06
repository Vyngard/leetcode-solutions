import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (var ch : s.toCharArray()) {
            if (map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);
            else
                map.put(ch, 1);

        }

        for (var ch : t.toCharArray()) {
            if (!map.containsKey(ch))
                return false;

            if(map.get(ch) > 1)
                map.put(ch, map.get(ch) - 1);
            else
                map.remove(ch);

        }

        return true;

    }
}