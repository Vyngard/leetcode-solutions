import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Hashtable<Integer, Integer> map = new Hashtable<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int[] answer = new int[k];

        for (int num : nums) {
            if (map.get(num) == null)
                map.put(num, 1);
            else
                map.put(num, map.get(num) + 1);
        }

        for (var value : map.values()) {
            queue.add(value);
            if (queue.size() > k)
                queue.remove();
        }

        int index = 0;
        while (!queue.isEmpty()) {
            int item = queue.remove();
            for (Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == item) {
                    answer[index] = entry.getKey();
                    map.remove(entry.getKey());
                    index++;
                    break;
                }
            }
        }

        return answer;
    }
}