class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int left = 0;
        int right = s.length() - 1;
        StringBuilder newString = new StringBuilder(s);
        while (left < right) {
            if (set.contains(s.charAt(left))) {
                while (right > left) {
                    if (set.contains(s.charAt(right))) {
                        newString.setCharAt(left,s.charAt(right));
                        newString.setCharAt(right,s.charAt(left));
                        right--;
                        break;
                    }
                    right--;
                }
            }
            left++;
        }
        return newString.toString();
    }
}