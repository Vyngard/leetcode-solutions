package Solutions.66- Plus One;

public class Solution {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        int index = size - 1;

        digits[index]++;

        while (digits[index] > 9) {
            digits[index] %= 10;
            index--;
            if (index < 0 ) {
                int[] newDigits = new int[size + 1];
                newDigits[0] = 1;
                for (int i = 1; i < newDigits.length; i++) {
                    newDigits[i] = digits[i-1];
                }
                return newDigits;
            }
            digits[index]++;
        }

        return digits;
    }
} {
    
}
