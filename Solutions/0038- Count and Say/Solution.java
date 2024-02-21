class Solution {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";

        StringBuilder number = new StringBuilder(countAndSay(n-1));
        int index = 0;
        StringBuilder answer = new StringBuilder();

        while (index < number.length()) {
            char temp = number.charAt(index);
            int count = 0;
            while (index < number.length() && number.charAt(index) == temp) {
                index++;
                count++;
            }
            answer.append(count);
            answer.append(temp);
        }

        return answer.toString();

    }

}

