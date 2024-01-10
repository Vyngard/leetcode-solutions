import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (var ch : s.toCharArray()) {
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
                continue;
            }
            if (stack.isEmpty())
                return false;

            if ((ch == ']' && stack.pop() != '[') ||
                    (ch == '}' && stack.pop() != '{') ||
                    (ch == ')' && stack.pop() != '(')) {

                return false;
            }
        }
        return stack.isEmpty();
    }

}
