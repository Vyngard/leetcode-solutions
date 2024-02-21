import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> temp = new ArrayList<>();
        if (nums1.length < nums2.length) {
            for (int num : nums1)
                set.add(num);

            for (int num : nums2) {
                if (set.contains(num)) {
                    temp.add(num);
                    set.remove(num);
                }
            }
        } else {
            for (int num : nums2)
                set.add(num);

            for (int num : nums1) {
                if (set.contains(num)) {
                    temp.add(num);
                    set.remove(num);
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