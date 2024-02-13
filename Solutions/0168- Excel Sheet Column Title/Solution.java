class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder answer = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            char letter = (char) ('A' + columnNumber % 26);
            answer.append(letter);
            columnNumber /= 26;
        }

        return answer.reverse().toString();
    }
}