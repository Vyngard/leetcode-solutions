class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length())
            return -1;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int pointer = i;
                for (char ch : needle.toCharArray()) {
                    if (pointer < haystack.length() && ch == haystack.charAt(pointer))
                        pointer++;
                    else
                        break;
                }
                if ((pointer - i) == needle.length())
                    return i;
            }
        }

        return -1;
    }
}