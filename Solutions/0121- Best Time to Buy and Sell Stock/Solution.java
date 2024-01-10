class Solution {
    public int maxProfit(int[] prices) {

        if (prices.length < 2)
            return 0;

        int answer = 0;
        int min = prices[0];

        for (var price : prices) {
            answer = Math.max(answer, price - min);
            min = Math.min(min, price);
        }
        return answer;
    }
}