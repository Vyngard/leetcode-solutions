class Solution {
    public String addBinary(String a, String b) {
        String shorter;
        String longer;
        StringBuilder answer = new StringBuilder();

        if (a.length() <= b.length()) {
            shorter = a;
            longer = b;
        } else {
            shorter = b;
            longer = a;
        }

        int shorterPointer = shorter.length() - 1;
        int longerPointer = longer.length() - 1;
        int carry = 0;

        while (shorterPointer >= 0) {
            if (shorter.charAt(shorterPointer) == '1' && longer.charAt(longerPointer) == '1') {
                if (carry == 0) {
                    answer.append("0");
                    carry = 1;
                } else {
                    answer.append("1");
                }
            } else if (shorter.charAt(shorterPointer) == '0' && longer.charAt(longerPointer) == '0') {
                if (carry == 0) {
                    answer.append("0");
                } else {
                    answer.append("1");
                    carry = 0;
                }
            } else {
                if (carry == 0) {
                    answer.append("1");
                } else {
                    answer.append("0");
                }
            }
            shorterPointer--;
            longerPointer--;
        }

        while (longerPointer >= 0) {
            if (longer.charAt(longerPointer) == '1') {
                if (carry == 0) {
                    answer.append("1");
                } else {
                    answer.append("0");
                }
            } else {
                if (carry == 0) {
                    answer.append("0");
                } else {
                    answer.append("1");
                    carry = 0;
                }
            }
            longerPointer--;
        }

        if (carry == 1) {
            answer.append(1);
        }

        return answer.reverse().toString();
    }
}