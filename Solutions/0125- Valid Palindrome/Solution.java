class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        var my_char = s.toCharArray();

        while (left <= right) {
            if (my_char[left] != my_char[right])
                return false;
            left++;
            right--;
        }

        return true;
    }
}