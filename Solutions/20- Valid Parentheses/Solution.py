class Solution:
    def isValid(self, s: str) -> bool:
        stack = []

        for ch in s:
            if ch in '({[':
                stack.append(ch)
                continue

            if not stack:
                return False

            if ch == ']' and stack.pop() != '[' or ch == '}' and stack.pop() != '{' or ch == ')' and stack.pop() != '(':
                return False

        return not stack