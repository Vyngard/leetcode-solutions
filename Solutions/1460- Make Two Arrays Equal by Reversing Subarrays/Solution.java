import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int item : arr) {
            if (!map.containsKey(item)) {
                map.put(item, 1);
            } else {
                map.put(item, map.get(item) + 1);
            }
        }

        for (int item : target) {
            if (!map.containsKey(item)) {
                return false;
            } else {
                int temp = map.get(item);
                if (temp > 1) {
                    map.put(item, temp - 1);
                } else {
                    map.remove(item);
                }
            }
        }

        return true;

    }
}