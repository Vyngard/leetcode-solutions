public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0];
        if (strs[0].isEmpty())
            return "";

        for (int i = 0 ; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].isEmpty())
                    return "";
                if (i >= strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0,i);
                }
            }
        }

        return strs[0];
    }

}
