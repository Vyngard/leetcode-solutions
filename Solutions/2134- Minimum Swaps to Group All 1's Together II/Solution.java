import java.util.*;

class Solution {
    public int minSwaps(int[] nums) {
        int countOne = 0;
        for (int num : nums) {
            if (num == 1) {
                countOne++;
            }
        }

        int n = nums.length;
        if (countOne == 0) {
            return 0;
        }

        int countZero = 0;
        for (int i = 0; i < countOne; i++) {
            if (nums[i] == 0) {
                countZero++;
            }
        }

        int answer = countZero;

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] == 0) {
                countZero--;
            }
            
            if (nums[(i + countOne - 1) % n] == 0) {
                countZero++;
            }
            
            answer = Math.min(answer, countZero);
        }

        return answer;
    }

}
