class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;
        int endPoison = 0;

        for (int i = 0; i < timeSeries.length; i++) {
            endPoison = timeSeries[i] + duration - 1;
            if (i == timeSeries.length - 1 || endPoison < timeSeries[i+1])
                total += duration;
            else
                total += timeSeries[i+1] - timeSeries[i];
        }

        return total;

    }
}