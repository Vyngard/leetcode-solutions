class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1)
            return s;

        int size = 0;
        int[] answer = new int[] {-1,-1};

        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j > i; j--) {
                if (s.charAt(j) == s.charAt(i))
                {
                    size = 0;
                    int index1 = i;
                    int index2 = j;
                    while (index1 < index2) {
                        if (s.charAt(index1) != s.charAt(index2))
                            break;
                        else {
                            size += 2;
                            index1++;
                            index2--;
                        }
                    }
                    if (index1 == index2) {
                        size++;
                        index1++;
                        index2--;
                    }

                    if (index1 > index2 && size > answer[1]) {
                        answer[0] = i;
                        answer[1] = size;
                    }
                }
            }
        }

        if (answer[0] == -1 || answer[1] == -1)
            return String.valueOf(s.charAt(0));

        return s.substring(answer[0],answer[0] + answer[1]);
    }

}