class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length())
            return -1;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                var haystackIndex = i;
                var needleIndex = 0;
                while (haystackIndex < haystack.length() && haystack.charAt(haystackIndex) == needle.charAt(needleIndex)) {
                    if (needleIndex == needle.length() - 1) {
                        return i;
                    }
                    haystackIndex++;
                    needleIndex++;
                }
            }
        }

        return -1;
    }
}