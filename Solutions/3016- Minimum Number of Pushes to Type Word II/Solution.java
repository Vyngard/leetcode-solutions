import java.util.*;

class Solution {
    public int minimumPushes(String word) {
        int[] frequency = new int[26]; 
        
        for (char c : word.toCharArray()) {
            frequency[c - 'a']++;
        }

        List<Integer> counts = new ArrayList<>();
        for (int count : frequency) {
            if (count > 0) {
                counts.add(count);
            }
        }

        Collections.sort(counts, Collections.reverseOrder());
        int answer = 0;
        
        for (int i = 0; i < counts.size(); i++) {
            answer += counts.get(i) * (1 + (i / 8));
        }

        return answer;
    }
}
