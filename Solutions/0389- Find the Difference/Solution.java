class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[26];

        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {
            int index = ch - 'a';
            count[index]--;
            if (count[index] < 0)
                return ch;
        }

        return 'a';
    }
}