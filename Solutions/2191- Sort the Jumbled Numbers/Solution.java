import java.util.*;

class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            int mappedValue = 0;
            int index = 1;
            int temp = num;
            do {
                int digit = temp % 10;
                mappedValue += mapping[digit] * index;
                temp /= 10;
                index *= 10;
            } while (temp > 0);
            map.put(num, mappedValue);
            list.add(num);
        }

        list.sort((a, b) -> map.get(a).compareTo(map.get(b)));

        int index = 0;
        for (int item : list) {
            nums[index] = item;
            index++;
        }

        return nums;



    }
}