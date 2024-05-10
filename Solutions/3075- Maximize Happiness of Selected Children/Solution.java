class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long answer = 0;
        Arrays.sort(happiness);

        for (int i = 0; i < k; i++) {
            int temp = Math.max(happiness[happiness.length - 1 - i] - i,0);
            answer += temp;
        }

        return answer;
    }
}