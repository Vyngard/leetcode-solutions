class Solution {
    public boolean digitCount(String num) {
        int[] digitCount = new int[10];

        for (char ch : num.toCharArray()) {
            digitCount[ch - '0']++;
        }

        for (int i = 0; i < num.length(); i++) {
            if (digitCount[i] != (num.charAt(i) - '0')) {
                return false;
            }
        }

        return true;
    }
}
