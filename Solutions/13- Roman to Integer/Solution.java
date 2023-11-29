import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] myChar = s.toCharArray();
        int i = 0;
        int number = 0;

        while (i < s.length()) {
            if (i != s.length() - 1 && map.get(myChar[i + 1]) > map.get(myChar[i])) {
                number += map.get(myChar[i + 1]) - map.get(myChar[i]);
                i += 2;
                continue;
            }
            number += map.get(myChar[i]);
            i++;
        }

        return number;
    }

}