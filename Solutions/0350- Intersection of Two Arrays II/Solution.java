import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> temp = new ArrayList<>();
        if (nums1.length < nums2.length) {
            for (int num : nums1) {
                if (!map.containsKey(num))
                    map.put(num,1);
                else
                    map.put(num,map.get(num) + 1);
            }

            for (int num : nums2) {
                if (map.containsKey(num)) {
                    temp.add(num);
                    if (map.get(num) > 1)
                        map.put(num,map.get(num) - 1);
                    else
                        map.remove(num);
                }
            }
        } else {
            for (int num : nums2) {
                if (!map.containsKey(num))
                    map.put(num,1);
                else
                    map.put(num,map.get(num) + 1);
            }

            for (int num : nums1) {
                if (map.containsKey(num)) {
                    temp.add(num);
                    if (map.get(num) > 1)
                        map.put(num,map.get(num) - 1);
                    else
                        map.remove(num);
                }
            }
        }
        int[] answer = new int[temp.size()];
        for (int i = 0;i < answer.length;i++) {
            answer[i] = temp.get(i);
        }
        return answer;

    }
}