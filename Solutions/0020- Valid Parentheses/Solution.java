import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (var ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{')
                stack.add(ch);
            else {
                if (stack.isEmpty())
                    return false;
                else {
                    if (ch == ')' && stack.peek() != '(' ||
                        ch == ']' && stack.peek() != '[' ||
                        ch == '}' && stack.peek() != '{')
                        return false;
                    else
                        stack.pop();
                }
            }

        }

        return stack.isEmpty();
    }

}