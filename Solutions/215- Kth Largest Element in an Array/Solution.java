import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int num : nums) {
            queue.add(num);

            if (queue.size() > k)
                queue.remove();

        }

        return queue.remove();

    }

}