class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        int sPointer = 0;
        int tPointer = 0;

        while (tPointer < tArray.length && sPointer < sArray.length) {
            if (tArray[tPointer] == sArray[sPointer])
                sPointer++;

            tPointer++;
        }

        return sPointer == sArray.length;
    }
}