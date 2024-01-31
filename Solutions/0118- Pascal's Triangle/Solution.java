import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(List.of(1));

        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(1);
            var lastList = answer.getLast();
            int left = 0;
            int right = 1;
            while (right < lastList.size()) {
                temp.add(lastList.get(left) + lastList.get(right));
                right++;
                left++;
            }
            temp.add(1);
            answer.add(temp);
        }

        return answer;

    }
}