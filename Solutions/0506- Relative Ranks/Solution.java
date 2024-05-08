class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] temp = score.clone();
        String[] answer = new String[score.length];
        Map<Integer, Integer> map = new HashMap<>();

        Arrays.sort(score);
        int rank = 1;

        for (int i = score.length - 1; i >= 0; i--) {
            map.put(score[i], rank);
            rank++;
        }

        for (int i = 0; i < score.length; i++) {
            int value = map.get(temp[i]);
            if (value == 1)
                answer[i] = "Gold Medal";
            else if (value == 2)
                answer[i] = "Silver Medal";
            else if (value == 3)
                answer[i] = "Bronze Medal";
            else
                answer[i] = String.valueOf(value);
        }

        return answer;

    }
}