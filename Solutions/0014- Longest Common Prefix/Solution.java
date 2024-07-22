class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String first = strs[0];
        StringBuffer answer = new StringBuffer();

        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                String temp = strs[j];
                if (i >= temp.length() || first.charAt(i) != temp.charAt(i)) {
                    return answer.toString();
                }
            }
            answer.append(first.charAt(i));
        }

        return answer.toString();

    }
}