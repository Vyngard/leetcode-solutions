class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);

        if (index == -1)
            return word;

        char[] chars = word.toCharArray();

        for (int i = 0; i <= index; i++) {
            char temp = chars[index];
            chars[index] = chars[i];
            chars[i] = temp;
            index--;
        }

        return String.valueOf(chars);

    }
}