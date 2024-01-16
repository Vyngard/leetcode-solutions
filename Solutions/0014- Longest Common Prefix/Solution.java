class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != ch)
                    return answer.toString();
            }
            answer.append(ch);
        }

        return answer.toString();
    }

}