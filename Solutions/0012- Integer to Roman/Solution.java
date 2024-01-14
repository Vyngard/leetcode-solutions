class Solution {
    public String intToRoman(int num) {
        String[] roman = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] number = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int index = 0;
        StringBuilder answer = new StringBuilder();

        while (num > 0) {
            if (num / number[index] > 0) {
                answer.append(roman[index]);
                num -= number[index];
            } else {
                index++;
            }
        }

        return answer.toString();
    }
}