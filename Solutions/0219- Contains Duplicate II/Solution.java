import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int item = nums[i];
            if (!map.containsKey(item))
                map.put(item,i);
            else {
                if(Math.abs(map.get(item) - i) <= k)
                    return true;
                else
                    map.put(item, i);
            }
        }

        return false;
    }
}