import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (minHeap.size() < 3 && !set.contains(num)) {
                minHeap.add(num);
                set.add(num);
            } else if (num > minHeap.peek() && !set.contains(num)) {
                    minHeap.remove();
                    minHeap.add(num);
                    set.add(num);
                }
        }
        if (minHeap.size() == 3) {
             return minHeap.remove();
        }

        int answer = 0;
        while (!minHeap.isEmpty()) {
            answer = minHeap.remove();
        }
        return answer;

    }
}