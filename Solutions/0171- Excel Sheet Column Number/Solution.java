class Solution {
    public int titleToNumber(String columnTitle) {
        int answer = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            answer += (columnTitle.charAt(i) - 'A' + 1) * Math.pow(26,columnTitle.length() - i - 1);
        }

        return answer;
    }
}