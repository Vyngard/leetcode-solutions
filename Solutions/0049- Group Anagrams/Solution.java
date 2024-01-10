import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();


        for (int i = 0; i < strs.length; i++) {
            char[] strsChar = strs[i].toCharArray();
            Arrays.sort(strsChar);
            String newStrs = Arrays.toString(strsChar);
            if (map.containsKey(newStrs)) {
                var temp = map.get(newStrs);
                temp.add(strs[i]);
                map.put(newStrs, temp);
            } else {
                var temp = new ArrayList<String>();
                temp.add(strs[i]);
                map.put(newStrs, temp);
            }

        }

        return new ArrayList<>(map.values());
    }
}