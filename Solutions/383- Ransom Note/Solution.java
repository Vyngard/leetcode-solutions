import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (var ch : magazine.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
                continue;
            }
            map.put(ch, map.get(ch) + 1);
        }

        for (var ch : ransomNote.toCharArray()) {
            if (!map.containsKey(ch)) {
                return false;
            }

            if (map.get(ch) > 1) {
                map.put(ch, map.get(ch) - 1);
            } else {
                map.remove(ch);
            }
        }

        return true;
    }
}