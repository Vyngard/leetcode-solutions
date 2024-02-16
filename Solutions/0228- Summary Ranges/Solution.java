import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<>();
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1 || nums[i] + 1 != nums[i+1]) {
                if (index == i)
                    answer.add(String.valueOf(nums[i]));
                else
                    answer.add(nums[index]+"->"+nums[i]);

                index = i + 1;
            }
        }
        return answer;
    }
}